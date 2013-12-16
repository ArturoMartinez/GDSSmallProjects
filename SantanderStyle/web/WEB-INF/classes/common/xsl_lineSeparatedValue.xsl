<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

	<xsl:template name="lineSeparatedValue">
		<xsl:param name="curValue"/>
		<xsl:param name="prefix" select="''"/>
		<xsl:param name="suffix" select="''"/>
		<xsl:for-each select="$curValue">
			<xsl:choose>
				<xsl:when test="position() &gt; 1">
					<br/><xsl:value-of select="$prefix"/><xsl:value-of select="."/><xsl:value-of select="$suffix"/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="."/></xsl:otherwise>
				</xsl:choose>
			</xsl:for-each>
		</xsl:template>
	</xsl:stylesheet>



