#pragma once
#include "StatusException.h"
#include <vector>

class SplitterTool
{
	FILE* m_hInputFile;
	FILE* m_hOutputFile;
	char* m_szBuffer;
public:
	SplitterTool(const std::vector<std::string>& vecArguments);
	~SplitterTool(void);

	int run();

};

