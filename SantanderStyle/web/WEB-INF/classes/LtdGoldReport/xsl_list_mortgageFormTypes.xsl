<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

	<xsl:template name="mortgageFormTypes">
		<xsl:param name="curValue"/>
		<xsl:choose>
			<xsl:when test="$curValue = '04'">A</xsl:when>
			<xsl:when test="$curValue = '08'">B</xsl:when>
			<xsl:when test="$curValue = '12'">9999</xsl:when>
			<xsl:when test="$curValue = '16'">395</xsl:when>
			<xsl:when test="$curValue = '17'">MG01</xsl:when>
			<xsl:when test="$curValue = '20'">400</xsl:when>
			<xsl:when test="$curValue = '21'">MG06</xsl:when>
			<xsl:when test="$curValue = '24'">397</xsl:when>
			<xsl:when test="$curValue = '25'">MG07</xsl:when>
			<xsl:when test="$curValue = '28'">397A</xsl:when>
			<xsl:when test="$curValue = '29'">MG08</xsl:when>
			<xsl:when test="$curValue = '32'">403A</xsl:when>
			<xsl:when test="$curValue = '33'">MG02</xsl:when>
			<xsl:when test="$curValue = '36'">403B</xsl:when>
			<xsl:when test="$curValue = '37'">MG04</xsl:when>
			<xsl:when test="$curValue = '40'">4051</xsl:when>
			<xsl:when test="$curValue = '41'">LQ01</xsl:when>
			<xsl:when test="$curValue = '44'">4052</xsl:when>
			<xsl:when test="$curValue = '45'">LQ02</xsl:when>
			<xsl:when test="$curValue = '48'">410</xsl:when>
			<xsl:when test="$curValue = '49'">MG01S</xsl:when>
			<xsl:when test="$curValue = '52'">413</xsl:when>
			<xsl:when test="$curValue = '53'">MG07S</xsl:when>
			<xsl:when test="$curValue = '56'">413A</xsl:when>
			<xsl:when test="$curValue = '57'">MG08S</xsl:when>
			<xsl:when test="$curValue = '60'">416</xsl:when>
			<xsl:when test="$curValue = '61'">MG06S</xsl:when>
			<xsl:when test="$curValue = '64'">419A</xsl:when>
			<xsl:when test="$curValue = '65'">MG02S</xsl:when>
			<xsl:when test="$curValue = '66'">MG03S</xsl:when>
			<xsl:when test="$curValue = '68'">419B</xsl:when>
			<xsl:when test="$curValue = '69'">MG04S</xsl:when>
			<xsl:when test="$curValue = '70'">MG05S</xsl:when>
			<xsl:when test="$curValue = '72'">1SC</xsl:when>
			<xsl:when test="$curValue = '76'">2SC</xsl:when>
			<xsl:when test="$curValue = '80'">3SC</xsl:when>
			<xsl:when test="$curValue = '84'">33SC</xsl:when>
			<xsl:when test="$curValue = '88'">466</xsl:when>
			<xsl:when test="$curValue = '89'">MG10S</xsl:when>
		</xsl:choose>
	</xsl:template>

	
</xsl:stylesheet>

