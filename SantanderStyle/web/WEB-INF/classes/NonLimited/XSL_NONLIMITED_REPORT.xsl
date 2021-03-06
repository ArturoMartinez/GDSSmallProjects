<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html" encoding="utf-8" indent="yes" doctype-system="http://www.w3.org/TR/html4/strict.dtd"/>

	

	<xsl:include href="xsl_summary_details.xsl"/>
	<xsl:include href="xsl_credit_summary.xsl"/>
	<xsl:include href="xsl_payment_performance.xsl"/>
	<xsl:include href="xsl_payment_analysis.xsl"/>
	<xsl:include href="xsl_public_record_information.xsl"/>
	<xsl:include href="xsl_cifas.xsl"/>
	
	<xsl:include href="../common/xsl_commaSeparatedValue.xsl"/>
	<xsl:include href="../common/xsl_lineSeparatedValue.xsl"/>
	<xsl:include href="../common/xsl_one_row_date.xsl"/>

	<xsl:include href="xsl_list_payment_terms.xsl"/>
	<xsl:include href="xsl_list_payment_patterns.xsl"/>
	<xsl:include href="../common/xsl_list_fraud_categories.xsl"/>

	<xsl:include href="xsl_consumer_credit_licenses.xsl"/>
	<xsl:include href="xsl_notices_of_correction.xsl"/>
	<xsl:include href="xsl_previous_searches.xsl"/>
	<xsl:include href="xsl_directorship_and_secretaryship_informaion_of_proprietors.xsl"/>
	<xsl:template match="/RawBureauData/NonLtdBusinessData">
		<html>
			<head>
				<meta http-equiv="X-UA-Compatible" content="IE=8" />
				<meta name="author" content="GDS Modellica" />
				<meta name="robots" content="noindex, nofollow" />
				<title><xsl:value-of select="BusinessName"/></title>
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
				
				<xsl:call-template name="xsl_summary_details"/>
				<xsl:call-template name="xsl_credit_summary"/>
				<xsl:call-template name="xsl_payment_performance"/>
				<!--<xsl:call-template name="xsl_payment_analysis"/>-->

				<xsl:call-template name="xsl_public_record_information"/>
				<xsl:call-template name="xsl_consumer_credit_licences"/>
				<xsl:call-template name="xsl_notices_of_correction"/>
				<xsl:call-template name="xsl_previous_searches"/>
				
				<xsl:call-template name="xsl_directorship_and_secretaryship_informaion_of_proprietors"/>

				<xsl:call-template name="xsl_cifas"/>

			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
