#pragma once
#include <string>

class StatusException
{
	int m_iCode;
	std::string m_strMessage;
public:
	StatusException(int iCode, const std::string& strMessage)
	{
		m_iCode = iCode;
		m_strMessage = strMessage;
	}

	const std::string& getMessage() const {return m_strMessage;}
	int getCode() const {return m_iCode;}
};