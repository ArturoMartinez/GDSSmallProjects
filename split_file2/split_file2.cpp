// split_file2.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"
#include "SplitterTool.h"
#include <string>
using namespace std;

int main(int argc, const char* argv[])
{
	try
	{
		vector<string> vecArgs;
		//vecArgs.push_back("SOVF15K.ARFTTY.FILE1");
		//vecArgs.push_back("SOVF15K.ARFTTY.OUTPUT.FILE1");
		for(int i = 1;i < argc;i++)
			vecArgs.push_back(argv[i]);

		SplitterTool tool(vecArgs);
		return tool.run();
	}
	catch(StatusException& e)
	{
		printf("%s\n", e.getMessage().c_str());
		return e.getCode();
	}
	catch(...)
	{
		printf("Unknown Error\n");
		return 99;
	}
}

