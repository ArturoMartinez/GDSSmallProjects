<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" encoding="utf-8" indent="yes" doctype-system="http://www.w3.org/TR/html4/strict.dtd"/>
	<xsl:include href="xsl_balance_sheet.xsl"/>
	<xsl:include href="xsl_profit_and_loss.xsl"/>
	<xsl:include href="xsl_company_ratio_and_disclosure_items.xsl"/>
	<xsl:include href="xsl_payment_profile.xsl"/>
	<xsl:include href="xsl_payment_summary.xsl"/>
	<xsl:include href="xsl_instalment_cais.xsl"/>
	<xsl:include href="xsl_company_identification_details.xsl"/>
	<xsl:include href="xsl_public_record_information.xsl"/>

	<xsl:include href="xsl_mortages_charges_satisfactions.xsl"/>
	<xsl:include href="xsl_consumer_credit_licenses.xsl"/>
	<xsl:include href="xsl_corporate_structure.xsl"/>
	<xsl:include href="xsl_legal_notices.xsl"/>
	<xsl:include href="xsl_management_information.xsl"/>

	<xsl:include href="xsl_county_court_judgments.xsl"/>
	<xsl:include href="xsl_list_payment_patterns.xsl"/>

	<xsl:template match="/RawBureauData/LtdCompanyData">
		<html>
			<head>
				<title><xsl:value-of select="CommercialName"/></title>
				<meta http-equiv="x-ua-compatible" content="IE=8"/>
				<link rel="stylesheet" type="text/css" href="styles.css"/>
			</head>
			<body>
				<div id="sectionNavigator" style="">Go to:<br/>
					<select id="selectSectionNavigator"
						onchange="document.location.href='#'+this.options[this.selectedIndex].value"
						style="text-transform:capitalize"> </select>
				</div>
				
				
				<br/>
				<br/>
				<div class="section" id="company_details">
					<h2>company details</h2>
					<div class="dataLabel">company name</div>
					<div class="dataValue">
						<xsl:value-of select="CommercialName"/>
					</div>
					<br style="clear:both"/>
					<div class="dataLabel">registered number</div>
					<div class="dataValue">
						<xsl:value-of select="RegNumber"/>
					</div>
					<br style="clear:both"/>
					<div class="dataLabel">registered office</div>
					<div class="dataValue">
						<xsl:if test="Identification/RegisteredOffice/LocationLine1!=''"><xsl:value-of select="Identification/RegisteredOffice/LocationLine1"/>&#xA0;</xsl:if>
						<xsl:if test="Identification/RegisteredOffice/LocationLine2!=''"><xsl:value-of select="Identification/RegisteredOffice/LocationLine2"/>&#xA0;</xsl:if>
						<xsl:if test="Identification/RegisteredOffice/LocationLine3!=''"><xsl:value-of select="Identification/RegisteredOffice/LocationLine3"/>&#xA0;</xsl:if>
						<xsl:if test="Identification/RegisteredOffice/LocationLine4!=''"><xsl:value-of select="Identification/RegisteredOffice/LocationLine4"/>&#xA0;</xsl:if>
						<xsl:if test="Identification/RegisteredOffice/LocationLine5!=''"><xsl:value-of select="Identification/RegisteredOffice/LocationLine5"/>&#xA0;</xsl:if>
						<xsl:if test="Identification/RegisteredOffice/Postcode!=''"><xsl:value-of select="Identification/RegisteredOffice/Postcode"/></xsl:if>
					</div>
					<br style="clear:both"/>
					<div class="dataLabel">date incorporated</div>
					<div class="dataValue">
						<xsl:value-of
							select="Identification/IncorporationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Identification/IncorporationDate/MM"/></span>&#xA0;<xsl:value-of
							select="Identification/IncorporationDate/CCYY"/></div>
					<br/>
				</div>

				<div class="section" id="credit_summary">
					<h2>credit summary</h2>
					<div class="dataLabel">credit rating</div>
					<div class="dataValue">
						<span>
							<xsl:value-of select="CommercialDelphi/CreditRating"/>
							
						</span>
					</div>
					<br style="clear:both"/>
					<div class="dataLabel">credit opinion</div>

									
					<div class="dataValue">
						<span>
							<xsl:value-of select="CommercialDelphi/CommDelphiBandText"/>
							<xsl:if test="CommercialDelphi/CreditTextLine1!=''"><xsl:value-of select="CommercialDelphi/CreditTextLine1"/><br style="clear:both"/></xsl:if>
							<xsl:if test="CommercialDelphi/CreditTextLine2!=''"><xsl:value-of select="CommercialDelphi/CreditTextLine2"/><br style="clear:both"/></xsl:if>
							<xsl:if test="CommercialDelphi/CreditTextLine3!=''"><xsl:value-of select="CommercialDelphi/CreditTextLine3"/><br style="clear:both"/></xsl:if>
							<xsl:if test="CommercialDelphi/CreditTextLine4!=''"><xsl:value-of select="CommercialDelphi/CreditTextLine4"/><br style="clear:both"/></xsl:if>
							<xsl:if test="CommercialDelphi/CreditTextLine5!=''"><xsl:value-of select="CommercialDelphi/CreditTextLine5"/><br style="clear:both"/></xsl:if>
						</span>
					</div>
					<br style="clear:both"/>
					<div class="dataLabel">risk analysis</div>
					<div class="dataValue">
						<xsl:value-of select="CommercialDelphi/ConclusionText"/>
					</div>
					<br style="clear:both"/>

					<h3>financial stability assessment</h3>
					<div style="width:850px;margin:auto;overflow:hidden">
						<div style="width:400px;float:left" class="font14">
							<div class="dataLabel">commercial delphi score</div>
							<div class="dataValue">
								<span>
									<xsl:value-of select="CommercialDelphi/CommDelphiScore"/>
									out of 100 </span>
							</div>
							<br style="clear:both"/>
							<div class="dataLabel">commercial delphi band</div>
							<div class="dataValue">
								<span>
									<xsl:value-of select="CommercialDelphi/CommDelphiBand"/><br/>
									<xsl:value-of select="CommercialDelphi/CommDelphiBandText"/>
									
								</span>
							</div>
							<br style="clear:both"/>
							<div class="dataLabel">failure odds</div>
							<div class="dataValue">
								<span>
									<xsl:value-of
										select="CommercialDelphiHistory/CompanyHistory/StabilityOdds"
									/>
								</span>
							</div>
							<br style="clear:both"/>
						</div>
						<xsl:variable name="ratingStarsImgSectionHeight">58</xsl:variable>
						<xsl:variable name="score">
							<xsl:value-of
								select="CommercialDelphiHistory/CompanyHistory/CommDelphiScore"/>
						</xsl:variable>
						<div class="subSectionInsert" style="width:300px;float:left">
							<h3>commercial delphi rating</h3>
							<div
								style="margin:auto;padding-top:10px;width:300px;font:italic normal 21px MS Serif"
									><xsl:value-of
									select="CommercialDelphiHistory/CompanyHistory/CommDelphiScore"
								/> out of 100 </div>
							<div
								style="margin:auto;width:150px;height:{$ratingStarsImgSectionHeight}px;background:URL(ratingStars-mid.png) 0px -{(floor($score div 10)) * $ratingStarsImgSectionHeight}px no-repeat"
							/>

									<xsl:value-of select="CommercialDelphi/CommDelphiBandText"/>
						</div>
					</div>
				</div>


				<xsl:call-template name="xsl_instalment_cais"/>

				<xsl:call-template name="xsl_public_record_information"/>

				<xsl:call-template name="xsl_balance_sheet"/>

				<xsl:call-template name="xsl_profit_and_loss"/>

				<xsl:call-template name="xsl_company_ratio_and_disclosure_items"/>

				<xsl:call-template name="xsl_payment_profile"/>

				<xsl:call-template name="xsl_company_identification_details"/>

				<xsl:call-template name="xsl_consumer_credit_licences"/>

				<xsl:call-template name="xsl_corporate_structure"/>

				<xsl:call-template name="xsl_management_information"/>

				<xsl:call-template name="xsl_mortages_charges_satisfactions"/>

				<xsl:call-template name="xsl_legal_notices"/>

				<xsl:call-template name="xsl_county_court_judgments"/>
                                <script src="jquery-1.4.2.min.js" type="text/javascript"><xsl:comment/></script>
                                <script src="mainJS.js" type="text/javascript"><xsl:comment/></script>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
