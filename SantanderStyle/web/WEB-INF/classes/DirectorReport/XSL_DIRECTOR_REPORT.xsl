<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" >

	<xsl:output method="html" encoding="utf-8" indent="yes" doctype-system="http://www.w3.org/TR/html4/strict.dtd"/>

	<xsl:include href="xsl_personal_details.xsl"/>
	<xsl:include href="xsl_directorship_secretaryship_partnership.xsl"/>
	<xsl:include href="xsl_convictions.xsl"/>
	<xsl:include href="xsl_disqualifications.xsl"/>
	<xsl:include href="xsl_notices_of_correction.xsl"/>
	<xsl:include href="xsl_cifas.xsl"/>

	
	<xsl:include href="../common/xsl_commaSeparatedValue.xsl"/>
	<xsl:include href="../common/xsl_lineSeparatedValue.xsl"/>
	<xsl:include href="../common/xsl_one_row_date.xsl"/>



	<xsl:template match="/RawBureauData/DirectorData">
		
		<html>
			<head>
				<meta http-equiv="x-ua-compatible" content="IE=8"/>
            <meta name="author" content="GDS Modellica" />
            <meta name="robots" content="noindex, nofollow" />
            <title>
               <xsl:call-template name="commaSeparatedValue">
                  <xsl:with-param name="curValue" select="DirectorDetails/Name/*" />
                  <xsl:with-param name="separator" select="' '" />
               </xsl:call-template>
            </title>
				<link rel="stylesheet" type="text/css" href="./rsc/css/styles_production.css"/>
				<script src="./rsc/js/jquery-1.10.2.min.js"></script>
				<script src="./rsc/js/mainJS.js"></script>
			</head>
			<body>

				<div id="sectionNavigator" style="">Go to:<br/>
					<select id="selectSectionNavigator"
						onchange="document.location.href='#'+this.options[this.selectedIndex].value"
						style="text-transform:capitalize"> </select>
						<div style="padding-top:5px;text-align:right" id="currentXSLSourceVersion"></div>
				</div>
				<br style="clear:both"/>
				<br style="clear:both"/>
				
				<xsl:call-template name="xsl_personal_details"/>
				<xsl:call-template name="xsl_directorship_secretaryship_partnership"/>
				<xsl:call-template name="xsl_convictions"/>
				<xsl:call-template name="xsl_disqualifications"/>
				<xsl:call-template name="xsl_notices_of_correction"/>
				<xsl:call-template name="xsl_cifas"/>
            
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
