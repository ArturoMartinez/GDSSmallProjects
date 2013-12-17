<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

	<xsl:template name="commaSeparatedValue">
		<xsl:param name="curValue"/>
		<xsl:param name="separator"/>
		<xsl:for-each select="$curValue">
			<xsl:choose>
				<xsl:when test="position() &gt; 1">
					<xsl:choose>
						<xsl:when test="$separator!=''">
							<xsl:value-of select="$separator"/>

						</xsl:when>
						<xsl:otherwise>,&#xA0;</xsl:otherwise>
					</xsl:choose>
					<xsl:value-of select="."/>
				</xsl:when>
				<xsl:otherwise>
					<xsl:value-of select="."/></xsl:otherwise>
			</xsl:choose>
		</xsl:for-each>

		</xsl:template>


	</xsl:stylesheet>


