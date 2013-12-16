<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

	<xsl:template name="oneRowDate">
		<xsl:param name="curValue"/>
		<xsl:value-of select="$curValue/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="$curValue/MM"/></span>&#xA0;<xsl:value-of select="$curValue/CCYY"/>
	</xsl:template>
</xsl:stylesheet>



