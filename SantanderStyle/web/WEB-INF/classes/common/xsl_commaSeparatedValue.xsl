<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

	<xsl:template name="commaSeparatedValue">
		<xsl:param name="curValue"/>
		<xsl:param name="separator" select="',&#xA0;'"/>
		<xsl:param name="ignoredNode" select="''"/>
		<xsl:param name="recordLimit" select='-1'/>

		<xsl:for-each select="$curValue">

			<xsl:if test="name() != $ignoredNode and ($recordLimit=-1 or position() &lt; $recordLimit+1)">
				<xsl:choose>
					<xsl:when test="position() &gt; 1 and . !=''" >
						<xsl:call-template name="addSeparatorIfPreviousValuesNotEmpty">
							<xsl:with-param name="positionStart" select="0"/>
							<xsl:with-param name="positionEnd" select="position()-1"/>
							<xsl:with-param name="separator" select="$separator"/>
							<xsl:with-param name="nodesList" select="$curValue"/>
						</xsl:call-template>
						<xsl:value-of select="."/>
					</xsl:when>
					<xsl:when test=" . != ''">
						<xsl:value-of select="."/>
					</xsl:when>
				</xsl:choose>
			</xsl:if>
		</xsl:for-each>
	</xsl:template>

	<!-- Recusive template, checks if all values from the param start position until the param end position are empty or not. If not, returns the separator parameter -->
	<xsl:template name="addSeparatorIfPreviousValuesNotEmpty">
		<xsl:param name="positionStart"/>
		<xsl:param name="positionEnd"/>
		<xsl:param name="separator"/>
		<xsl:param name="nodesList"/>
		<xsl:choose>
			<xsl:when test="$nodesList[$positionStart] != ''">
				<xsl:value-of select="$separator"/>
			</xsl:when>
			<xsl:otherwise>
				<xsl:if test="$positionStart &lt; $positionEnd">
					<xsl:call-template name="addSeparatorIfPreviousValuesNotEmpty">
						<xsl:with-param name="positionStart" select="$positionStart+1"/>
						<xsl:with-param name="positionEnd" select="$positionEnd"/>
						<xsl:with-param name="separator" select="$separator"/>
						<xsl:with-param name="nodesList" select="$nodesList"/>
					</xsl:call-template>
				</xsl:if>
			</xsl:otherwise>
		</xsl:choose>
	</xsl:template>


</xsl:stylesheet>



