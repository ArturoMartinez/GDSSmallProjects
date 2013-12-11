<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

	<xsl:template name="commaSeparatedValue">
		<xsl:param name="curValue"/>

		<xsl:for-each select="$curValue">
			<xsl:choose>
				<xsl:when test="position() &gt; 1">,&#xA0;<xsl:value-of select="."/></xsl:when>
				<xsl:otherwise><xsl:value-of select="."/></xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>

		</xsl:template>


	</xsl:stylesheet>

