<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="utf-8" indent="yes"/>

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
 
	<xsl:template match="/LtdCompanyData">
		<xsl:text disable-output-escaping="yes">&lt;!DOCTYPE html></xsl:text>
		<html>
			<head>
				<script src="jquery-1.4.2.min.js" type="text/javascript"><xsl:comment/></script>
				<style type="text/css">
					body{
					    font:normal normal normal 11px Arial;
					}
					div .dataLabel, div .dataValue{
					    float:left;
					}
					
					div .dataLabel, div .matrixLabel{
					    font-weight:bold;
					    width:200px;
					    text-transform:capitalize;
					    margin-left:15px;
					}
					div .matrixLabel{
					    margin-top:10px;
					    width:100%;
					}
					
					.section{
					    clear:both;
					    margin:10px;
					    border:1px solid #aaaaaa;
					    border-radius:3px;
					    padding:0px 0px 10px 0px;
					    background:#fefefe;
					    -webkit-box-shadow:-2px 2px 3px 0px #CCC;
					    box-shadow:-2px 2px 3px 0px #CCC;
					    overflow:hidden;
					
					}
					h2{
					    margin:0px 0px 7px 0px;
					    padding:3px 0px 3px 10px;
					    clear:both;
					    text-transform:capitalize;
					    border-bottom:1px solid #bbb;
					    color:#FFFFFF;
					    font-weight:normal;
					    text-shadow:1px -1px #666666;
					    font-size:14px;
					    background: #999999; /* Old browsers */
					    background: -moz-linear-gradient(top,  #c6c6c6 0%, #aaaaaa 60%, #888888 100%); /* FF3.6+ */
					    background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#c6c6c6), color-stop(60%,#aaaaaa), color-stop(100%,#888888)); /* Chrome,Safari4+ */
					    background: -webkit-linear-gradient(top,  #c6c6c6 0%,#aaaaaa 60%,#888888 100%); /* Chrome10+,Safari5.1+ */
					    background: -o-linear-gradient(top,  #c6c6c6 0%,#aaaaaa 60%,#888888 100%); /* Opera 11.10+ */
					    background: -ms-linear-gradient(top,  #c6c6c6 0%,#aaaaaa 60%,#888888 100%); /* IE10+ */
					    background: linear-gradient(to bottom,  #c6c6c6 0%,#aaaaaa 60%,#888888 100%); /* W3C */
					    filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#c6c6c6', endColorstr='#888888',GradientType=0 ); /* IE6-9 */
					    
					}
					h3{
					background: #dadae5; /* Old browsers */
					background: -moz-linear-gradient(top,  #dadae5 0%, #c3c3cc 100%); /* FF3.6+ */
					background: -webkit-gradient(linear, left top, left bottom, color-stop(0%,#dadae5), color-stop(100%,#c3c3cc)); /* Chrome,Safari4+ */
					background: -webkit-linear-gradient(top,  #dadae5 0%,#c3c3cc 100%); /* Chrome10+,Safari5.1+ */
					background: -o-linear-gradient(top,  #dadae5 0%,#c3c3cc 100%); /* Opera 11.10+ */
					background: -ms-linear-gradient(top,  #dadae5 0%,#c3c3cc 100%); /* IE10+ */
					background: linear-gradient(to bottom,  #dadae5 0%,#c3c3cc 100%); /* W3C */
					filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#dadae5', endColorstr='#c3c3cc',GradientType=0 ); /* IE6-9 */
					
					    text-transform:capitalize;
					    padding:4px 0px 2px 15px;
					    color:#333;
					    font-weight:normal;
					    text-shadow:-1px 1px #DDDDDD;
					    
					    font-size:12px
					    }
					    #notFound{
					    color:#f00
					    }
					    
					    #notfound{
					    color:#f00
					    }
					.doubt{
					    color:#e90
					}
					div .matrix table td doubt{
					    color:#e90
					}
					
					/*Tables*/
					
					
					div .matrix{
					    min-width:200px;
					    min-height:100px;
					    margin:5px 10px 10px 15px;
					
					    background:#eeeee;
					}
					div .matrix table{
					    border-bottom:1px solid #555555;
					    border-left:1px solid #777777;
					    border-right:1px solid #aaaaaa;
					    border-top:1px solid #cccccc;
					    -webkit-box-shadow:-2px 2px 2px 0px #ddd;
					    box-shadow:-2px 2px 2px 0px #ddd;
					
					}
					div .matrix table tr:hover th,
					div .matrix table tr:hover td{
					    color:#eee;
					    background:#348
					}
					div .matrix table tr:hover th div{
					    color:#eee;
					    white-space:nowrap;
					    background:#78A
					}
					div .matrix table tr:hover td div{
					    color:#eee;
					    white-space:nowrap;
					    background:#AAB
					}
					div .matrix table th,
					div .matrix table td{
					    font:normal normal normal 11px Arial;
					    border-top:1px solid #cccccc;
					
					    border-right:1px solid #cccccc;
					    line-height:15px
					}
					div .matrix table th{
					    font-weight:bold;
					    text-align:left;
					    background:#98b1d9;
					    text-transform:capitalize;
					    vertical-align:top;
					    white-space:nowrap;
					    text-indent:3px;
					}
					div .matrix table th span{
					    margin-right:5px
					}
					div .matrix table td{
					    min-width:150px;
					    background:#ddd;
					    text-align:center
					}
					
					div .matrix table th div.inCellSubTitle,
					div .matrix table td div.inCellSubValue{
					
					    font-weight:normal;
					    text-transform:capitalize;
					    background:#dedede;
					    margin:0px;
					    padding:0px;
					}
					div .matrix table th div.inCellSubTitle{
					    font-weight:normal;
					    text-align:right;
					    border-bottom:1px solid #ccc;
					    padding-right:3px
					}
					
					div .matrix table td div.inCellSubValue{
					    border-bottom:1px solid #ddd;
					    background:#eee;
					}
					div .matrix.thcenter table th{
					    text-align:center
					}
					div .matrix.td60 table td{
					    min-width:60px !important;
					
					    width:70px !important;
					}
					div.subSectionInsert{
					    float:left;
					    margin:0px 10px 10px 10px;
					    border:1px solid #bbb;
					    text-align:center;
					    border-radius:2px;
					    padding-bottom:10px;
					    -webkit-box-shadow:-2px 2px 2px 0px #ddd;
					    box-shadow:-2px 2px 2px 0px #ddd;
					}
					div.subSectionInsert h3{
					    margin:0px 0px 5px 0px;
					    padding:5px
					}
					div.subSectionInsert div{
					    font:italic normal normal 13px MS Serif
					}
					#sectionNavigator,
					#sectionNavigator select{
					    font-size:9px;
					}
					#sectionNavigator{
					    padding:4px 8px 8px 8px;
					    position:fixed;
					    top:0;
					    right:0;
					    opacity:0.35;
					    border:1px solid #333;
					    border-right:none;
					    border-top:none;
					    background:#AAAAAA;
					    border-radius:0px 0px 0px 5px;
					    -webkit-box-shadow:-2px 2px 4px 0px #BBB;
					    box-shadow:-2px 2px 4px 0px #BBB;
					}
					#sectionNavigator:hover{
					    opacity:0.75;
					}
				.font14 div{
					font-size:14px
				}</style>
			</head>
			<body>
				<script type="text/javascript"><![CDATA[
                $(document).ready(function () {
                    $("div.num").digits();
                    $("span.num").digits();
                    $("td.num span").digits();
                    $("td.num div").digits();
                    
                    var sectionsOptionsArray = $(".section");
                    for (s = 0; s < sectionsOptionsArray.length; s++) {
                        var id = sectionsOptionsArray[s].id;
                        var text = id.replace(/_/g, " ");
                        $('#selectSectionNavigator').append(new Option(text, id, false, false));
                    }
                    
                    
                    var sectionsH2Array = $(".section h2");
                    for (s = 0; s < sectionsH2Array.length; s++) {
                        var collapseImg = document.createElement('img');
                        collapseImg.collapsedStatus = false
                        
                        collapseImg.src = "collapse.png"
                        collapseImg.style.margin = "1px 15px 0px 0px"
                        collapseImg.style. float = "right"
                        collapseImg.style.border = "none"
                        collapseImg.style.cursor = "pointer"
                        
                        collapseImg.onclick = function () {
                            if (! this.collapsedStatus) {
                                this.originalDivParentHeight = this.parentNode.parentNode.clientHeight
                                this.src = "expand.png"
                                this.parentNode.parentNode.style.height = "20px"
                                this.parentNode.parentNode.style.overflow = "hidden"
                                this.collapsedStatus = true
                            } else {
                                this.src = "collapse.png"
                                this.parentNode.parentNode.style.height = this.originalDivParentHeight-10 + "px"
                                this.collapsedStatus = false
                            }
                        }
                        
                        sectionsH2Array[s].appendChild(collapseImg);
                    }
                });
                
                
                $.fn.digits = function () {
                    return this.each(function () {
                        $(this).text($(this).text().replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,"));
                    })
                }//]]></script>
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
					<br/>
					<div class="dataLabel">registered number</div>
					<div class="dataValue">
						<xsl:value-of select="RegNumber"/>
					</div>
					<br/>
					<div class="dataLabel">registered office</div>
					<div class="dataValue">
						<xsl:apply-templates select="Identification/RegisteredOffice"/>
					</div>
					<br/>
					<div class="dataLabel">date incorporated</div>
					<div class="dataValue"><xsl:value-of
							select="Identification/IncorporationDate/CCYY"/>/<xsl:value-of
							select="Identification/IncorporationDate/MM"/>/<xsl:value-of
							select="Identification/IncorporationDate/DD"/></div>
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
					<br/>
					<div class="dataLabel">credit opinion</div>
					<div class="dataValue">
						<span>
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
									<xsl:value-of select="CommercialDelphi/CommDelphiBand"/>
									
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
						<xsl:variable name="ratingStarsImgSectionHeight">116</xsl:variable>
						<xsl:variable name="score">
							<xsl:value-of
								select="CommercialDelphiHistory/CompanyHistory/CommDelphiScore"/>
						</xsl:variable>
						<div class="subSectionInsert" style="width:400px;float:left">
							<h3>commercial delphi rating</h3>
							<div
								style="margin:auto;padding-top:10px;width:300px;font:italic normal 21px MS Serif"
									><xsl:value-of
									select="CommercialDelphiHistory/CompanyHistory/CommDelphiScore"
								/> out of 100 </div>
							<div
								style="margin:auto;width:300px;height:116px;background:URL(ratingStars.png) 0px -{(floor($score div 10)) * $ratingStarsImgSectionHeight}px no-repeat"
							/>
						</div>
					</div>
				</div>

				<xsl:call-template name="xsl_payment_summary"/>

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

			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
