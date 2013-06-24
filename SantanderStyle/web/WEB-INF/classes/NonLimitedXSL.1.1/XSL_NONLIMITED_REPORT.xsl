<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" encoding="utf-8" indent="yes" doctype-system="http://www.w3.org/TR/html4/strict.dtd"/>
	<xsl:include href="xsl_summary_details.xsl"/>
	<xsl:include href="xsl_credit_summary.xsl"/>
	<xsl:include href="xsl_payment_performance.xsl"/>
	<xsl:include href="xsl_payment_analysis.xsl"/>
	<xsl:include href="xsl_public_record_information.xsl"/>
	
	<xsl:include href="xsl_consumer_credit_licenses.xsl"/>
	<xsl:include href="xsl_notices_of_correction.xsl"/>
	<xsl:include href="xsl_previous_searches.xsl"/>
	<xsl:include href="xsl_directorship_and_secretaryship_informaion_of_proprietors.xsl"/>
	<xsl:template match="/NonLtdBusinessData">
		<html>
			<head>
				<title><xsl:value-of select="BusinessName"/></title>
				<script src="jquery-1.4.2.min.js" type="text/javascript"><xsl:comment/></script>
				<script src="mainJS.js" type="text/javascript"><xsl:comment/></script>
				<link rel="stylesheet" type="text/css" href="styles.css"/>
			
			</head>
			<body>

				<div id="sectionNavigator" style="">Go to:<br/>
					<select id="selectSectionNavigator"
						onchange="document.location.href='#'+this.options[this.selectedIndex].value"
						style="text-transform:capitalize"> </select>
				</div>
				<br style="clear:both"/>
				<br style="clear:both"/>
				
				<xsl:call-template name="xsl_summary_details"/>
				<xsl:call-template name="xsl_credit_summary"/>
				<xsl:call-template name="xsl_payment_performance"/>
				<xsl:call-template name="xsl_payment_analysis"/>

				<xsl:call-template name="xsl_public_record_information"/>
				<xsl:call-template name="xsl_consumer_credit_licences"/>
				<xsl:call-template name="xsl_notices_of_correction"/>
				<xsl:call-template name="xsl_previous_searches"/>
				
				<xsl:call-template name="xsl_directorship_and_secretaryship_informaion_of_proprietors"/>
			
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
