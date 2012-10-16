#include "StdAfx.h"
#include "SplitterTool.h"
using namespace std;

SplitterTool::SplitterTool(const vector<string>& vecArguments)
{
	m_szBuffer = NULL;
	m_hInputFile = NULL;
	m_hOutputFile = NULL;

	if(vecArguments.size() != 2)
		throw StatusException(1, "Usage:\n\nsplit_file2 <input file> <output file>");

	m_hInputFile = fopen(vecArguments.at(0).c_str(), "r");
	if(!m_hInputFile)
		throw StatusException(2, "Failed to open input file");

	m_hOutputFile = fopen(vecArguments.at(1).c_str(), "w");
	if(!m_hOutputFile)
	{
		fclose(m_hInputFile);
		throw StatusException(2, "Failed to open output file");
	}
}

SplitterTool::~SplitterTool(void)
{
	delete[] m_szBuffer;
	fclose(m_hInputFile);	
	fclose(m_hOutputFile);
}

int SplitterTool::run()
{
	m_szBuffer = new char[1024 * 1024];
	bool bFirst = true;
	int iCount = 0;

	while(!feof(m_hInputFile))
	{		
		if(!fgets(m_szBuffer, 1024 * 1024, m_hInputFile))
		{
			if (ferror(m_hInputFile))
				throw StatusException(3, "Error reading from input file");

			continue;
		}

		char* szEnd = strrchr(m_szBuffer, '@');
		if(!szEnd)
			throw StatusException(4, "Invalid line found");

		if(strncmp(m_szBuffer, "1100", 4) == 0 && !bFirst)
		{
			iCount++;
			if(!fwrite("GDSSEP", 6, 1, m_hOutputFile))
				throw StatusException(5, "Failed to write to output file");
		}
			
		if(!fwrite(m_szBuffer, szEnd - m_szBuffer + 1, 1, m_hOutputFile))
			throw StatusException(5, "Failed to write to output file");
		
		if(bFirst)
		{
			bFirst = false;
			iCount++;
		}
	}

	printf("Found %d records\n", iCount);

	return 0;
}

