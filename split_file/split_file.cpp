// split_file.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#pragma warning(disable: 4996)

int main(int argc, char* argv[])
{
	if(argc < 2)
	{
		printf("Usage: split_file <filename>\n");
		return 1;
	}

	FILE* hFile = fopen(argv[1], "rb");
	if(!hFile)
	{
		printf("Failed to open file\n");
		return 2;
	}
	
	fseek(hFile, 0, SEEK_END);
	long long lFilesize = ftell(hFile);
	if(lFilesize >= (long long)(2 * 1024 * 1024 * 1023))
	{
		fclose(hFile);
		printf("File too large!");
		return 3;
	}
	rewind(hFile);

	char* szBuffer = new char[(int)lFilesize+1];
	if(!szBuffer)
	{
		fclose(hFile);
		printf("Not enough memory\n");
		return 4;
	}
	
	fread(szBuffer, (int)lFilesize, 1, hFile);
	if(ferror(hFile))
	{
		printf("Failed to read file\n");
		return 5;
	}
	fclose(hFile);
	hFile = NULL;

	int iSectionSize = (int)ceil(double(lFilesize) / 10.0);

	char* szPtr = szBuffer;
	int iOffset = 0;
	int iLastSep = 0;
	int iNextSection = iSectionSize;
	int iSectionNum = 1;
	int iSectionStart = 0;
	for(int iOffset = 0;iOffset < (int)lFilesize;szPtr++, iOffset++)
	{
		if(*szPtr == 'G' && 
			iOffset + 6 < (int)lFilesize &&
			*(szPtr+1) == 'D' &&
			*(szPtr+2) == 'S' &&
			*(szPtr+3) == 'S' &&
			*(szPtr+4) == 'E' &&
			*(szPtr+5) == 'P')
		{
			iLastSep = iOffset;
		}

		if(iOffset >= iNextSection)
		{
			char szFileNameBuffer[255];
			sprintf(szFileNameBuffer, "%s.%d.txt", argv[1], iSectionNum);

			hFile = fopen(szFileNameBuffer, "wb");
			fwrite(szBuffer + iSectionStart, iLastSep - iSectionStart, 1, hFile);
			fclose(hFile);
			hFile = NULL;

			iSectionStart = iLastSep + 6;
			iSectionNum++;
			iNextSection += iSectionSize;
		}
	}

	char szFileNameBuffer[255];
	sprintf(szFileNameBuffer, "%s.%d.txt", argv[1], iSectionNum);

	hFile = fopen(szFileNameBuffer, "wb");
	fwrite(szBuffer + iSectionStart, (int)lFilesize - iSectionStart, 1, hFile);
	fclose(hFile);
	hFile = NULL;

	return 0;
}

