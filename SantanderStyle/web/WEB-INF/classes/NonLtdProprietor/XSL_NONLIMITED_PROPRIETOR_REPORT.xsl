<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" encoding="utf-8" indent="yes" doctype-system="http://www.w3.org/TR/html4/strict.dtd"/>
	<xsl:include href="xsl_summary.xsl"/>
	
	<xsl:include href="xsl_notices_of_correction.xsl"/>
	
	<xsl:include href="xsl_voters_roll.xsl"/>
	
	<xsl:include href="xsl_aliases_and_associations.xsl"/>
	
	
	<xsl:include href="xsl_public_informations.xsl"/>
	
	<xsl:include href="xsl_previous_searches.xsl"/>
	
	<xsl:include href="xsl_CAIS.xsl"/>

	<xsl:include href="xsl_list_company_types.xsl"/>
	<xsl:include href="xsl_list_account_types.xsl"/>
	
	<xsl:include href="xsl_address_links.xsl"/>
	<xsl:template match="/RawBureauData">
		<html>
			<head>
            <meta http-equiv="X-UA-Compatible" content="IE=8" />
            <meta name="author" content="GDS Modellica" />
            <meta name="robots" content="noindex, nofollow" />
				<title><xsl:value-of select="ConsumerOutput/Applicant/FormattedName"/></title>
				<link rel="stylesheet" type="text/css" href="./rsc/css/styles_production.css"/>
            <script src="./rsc/js/jquery-1.10.2.min.js"></script>
				<script src="./rsc/js/mainJS.js"></script>
			</head>
			<body>
				
				<div id="sectionNavigator" style="">Go to:<br/>
					<select id="selectSectionNavigator"
						onchange="document.location.href='#'+this.options[this.selectedIndex].value"
						style="text-transform:capitalize"> </select>
						<div style="padding-top:5px;text-align:right" id="currentXSLSourceVersion">
						
						</div>
				</div>
				<br style="clear:both"/>
				<br style="clear:both"/>
				
				<xsl:call-template name="xsl_summary"/>
				
				<xsl:call-template name="xsl_notices_of_correction"/>
				
				<xsl:call-template name="xsl_voters_roll"/>	

				<xsl:call-template name="xsl_aliases_and_associations"/>	
				<xsl:call-template name="xsl_public_informations"/>
				
				<xsl:call-template name="xsl_previous_searches"/>
				<xsl:call-template name="xsl_CAIS"/>
			
				<xsl:call-template name="xsl_address_links"/>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
