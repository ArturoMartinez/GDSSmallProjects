<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:output method="html" encoding="utf-8"/>
	<xsl:template match="/">
		<xsl:variable name="borrid">
		  <xsl:for-each select="//BORROWER">
        	   <xsl:if test="position() = 1">
		  		<xsl:value-of select="@BorrowerID"/>
    	       </xsl:if>            		     
		  </xsl:for-each>
		</xsl:variable>
		<xsl:variable name="cobid">
		  <xsl:for-each select="//BORROWER">
   	        <xsl:if test="position() = 2">
		  		<xsl:value-of select="@BorrowerID"/>
   	        </xsl:if>  
		  </xsl:for-each>
		</xsl:variable>
		
		<xsl:variable name="jointid">
		  <xsl:value-of select="$borrid"/>&#160;<xsl:value-of select="$cobid"/>	
		</xsl:variable>
		
		<xsl:variable name="borrname">
		   	<xsl:value-of select="//BORROWER[@BorrowerID=$borrid]/@_FirstName"/>&#160;
  		  	<xsl:value-of select="//BORROWER[@BorrowerID=$borrid]/@_LastName"/>
		</xsl:variable>
		<xsl:variable name="cobname">
		   	<xsl:value-of select="//BORROWER[@BorrowerID=$cobid]/@_FirstName"/>&#160;
  		  	<xsl:value-of select="//BORROWER[@BorrowerID=$cobid]/@_LastName"/>
		</xsl:variable>
		
		<xsl:variable name="noderoginfo">
		  <xsl:value-of select="//RESPONSE_DATA/CREDIT_RESPONSE/CREDIT_COMMENT[@_TypeOtherDescription ='UL']/_Text"/>	
		</xsl:variable>
		
		
	
<HTML>
<HEAD>

<STYLE type="text/css">
BODY 
	{ 
		font-size: 8pt; 
		background-color: white;
	}
 TR 
	{
		page-break-inside: avoid; 
	}

 TD 
	{
		font-family: Arial,Times New Roman;
		font-size: 8pt ;
		background-color: ffffff;
		page-break-inside: avoid;
	}

 TH 
	{
		font-family: Arial,Times New Roman;
		font-size: 8pt ;
		background-color: #1065b5;
		color:#ffffff;
		page-break-inside: avoid;
	}

.PAGEBREAK
{
	page-break-before: always;
	font-family: Arial,Times New Roman;
	font-size: 8pt ;

}
.TDSHADED 
	{
		font-family: Arial,Times New Roman;
		font-size: 8pt ;
		background-color: rgb(224,224,224);		
		page-break-inside: avoid;
	}

.TDRED 
	{
		color:red;
		font-family: Arial,Times New Roman;
		font-size: 8pt ;
		page-break-inside: avoid;
	}
	
.BOLD8
	{
		font-family: Arial,Times New Roman;
		font-size: 8pt ;
		text-align: left;
  		font-weight: bold;
		color:black;
	}	
.BOLD18
	{
		font-family: Arial,Times New Roman;
		font-size: 18pt ;
		text-align: left;
  		font-weight: bold;
		color:black;
	}		

.NORMALBANNER
	{
		font-family: Arial,Times New Roman;
		font-size: 8pt ;
		text-align: center;
		height: 15px;
		background-color: #009999;
		
	}

.TRADEBANNER
	{
		font-family: Arial,Times New Roman;
		font-size: 8pt ;
		text-align: center;
		height: 15px;
		background-color: #A4ECDC;
		color: black;
		
	}	
.TRADEBANNERCENTER
	{
		font-family: Arial,Times New Roman;
		font-size: 8pt ;
		text-align: Center;
		background-color: #A4ECDC;
		color: black;
		
	}	

	

</STYLE>
<TITLE><xsl:apply-templates select="//CREDIT_RESPONSE/CREDIT_BUREAU/@_Name"/></TITLE>
</HEAD>
<FORM name="mpsample">
<BODY>

		<xsl:text disable-output-escaping="yes">&lt;input type="hidden" name="creditreportid" value="</xsl:text>  
			<xsl:value-of select="//CREDIT_RESPONSE/@CreditReportIdentifier"/>
		<xsl:text disable-output-escaping="yes">"/&gt;</xsl:text>  

		<BR/><BR/>
				
				
		<TABLE BORDER="0" WIDTH="100%">
			<TR><TD><FONT  size = "+1"><B>CSC UNDISCLOSED LIABILITIES</B></FONT></TD></TR>
			<TR><TH CLASS="NORMALBANNER" WIDTH="100%"><center>ORDER INFO</center></TH></TR>
		</TABLE>
				<!--  Page one header area -->
				<TABLE CELLPADDING="0" CELLSPACING="0" WIDTH="100%" >
				<xsl:for-each select="//CREDIT_RESPONSE">
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">CRED REF #</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;<xsl:value-of select="//RESPONSE_DATA/CREDIT_RESPONSE/@CreditReportIdentifier"/></TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">ULR COMPLETED</TD>
						<TD WIDTH="13%" NOWRAP="TRUE">&#160;<xsl:value-of select="@CreditReportLastUpdatedDate"/></TD>
						<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">REQUESTED BY</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;<xsl:value-of select="//RESPOND_TO_PARTY/CONTACT_DETAIL/@_Name"/></TD>
					</TR>
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">PREPARED FOR</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;<xsl:value-of select="//RESPOND_TO_PARTY/@_Name"/></TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">CREDIT ORDERED</TD>
						<TD WIDTH="13%" NOWRAP="TRUE">&#160;<xsl:value-of select="@CreditReportFirstIssuedDate"/></TD>
						<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">FNMA #</TD>
						<TD WIDTH="7%" NOWRAP="TRUE">&#160;<xsl:value-of select="//RESPONSE_DATA/CREDIT_RESPONSE/@CreditReportIdentifier"/></TD>
					</TR>
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">&#160;</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;<xsl:apply-templates select="CREDIT_BUREAU/@_StreetAddress"/></TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">REPOSITORIES</TD>
						<TD WIDTH="13%" NOWRAP="TRUE">
							<xsl:if test="CREDIT_REPOSITORY_INCLUDED/@_EquifaxIndicator[.='Y']">EFX	</xsl:if>
							<xsl:if test="CREDIT_REPOSITORY_INCLUDED/@_ExperianIndicator[.='Y']">XPN </xsl:if>
							<xsl:if test="CREDIT_REPOSITORY_INCLUDED/@_TransUnionIndicator[.='Y']">TU  </xsl:if>
						</TD>
						<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">PRPD BY</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;</TD>
					</TR>
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">&#160;</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;
							<xsl:apply-templates select="CREDIT_BUREAU/@_City"/>,
							<xsl:apply-templates select="CREDIT_BUREAU/@_State"/>
							<xsl:apply-templates select="CREDIT_BUREAU/@_PostalCode"/>
						</TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">PRICE</TD>
						<TD WIDTH="13%" NOWRAP="TRUE"><xsl:value-of select="//CREDIT_REPORT_PRICE/@_Amount"/></TD>
						<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">LOAN TYPE</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;</TD>
					</TR>
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">&#160;</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;</TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">LOAN #</TD>
						<TD WIDTH="13%" NOWRAP="TRUE"><xsl:value-of select="//@LenderCaseIdentifier"/></TD>
						<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">&#160;</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;</TD>
					</TR>
				</xsl:for-each>			
					

					
				</TABLE>
				
				
				<!---  APPLICANT INFO -->
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>APPLICANT INFO</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE CELLPADDING="0" CELLSPACING="0" WIDTH="100%" >
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">APPLICANT</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;<xsl:value-of select="$borrname"/></TD>
						
						<TD WIDTH="7%" NOWRAP="TRUE">&#160;</TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">CO-APPLICANT</TD>
						<TD WIDTH="13%" NOWRAP="TRUE">&#160;<xsl:value-of select="$cobname"/></TD>
						
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;</TD>
					</TR>
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">SSN #</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/@_SSN"/></TD>
						
						<TD WIDTH="7%" NOWRAP="TRUE">&#160;</TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">SSN #</TD>
						<TD WIDTH="13%" NOWRAP="TRUE">&#160;<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$cobid]/@_SSN"/></TD>
						
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;</TD>
					</TR>
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">DOB</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/@_BirthDate"/></TD>
						
						<TD WIDTH="7%" NOWRAP="TRUE">&#160;</TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">DOB</TD>
						<TD WIDTH="13%" NOWRAP="TRUE">&#160;<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$cobid]/@_BirthDate"/></TD>
						
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;</TD>
					</TR>					
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">MARITAL STATUS</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/@MaritalStatusType"/></TD>
						
						<TD WIDTH="7%" NOWRAP="TRUE">&#160;</TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">DEPENDENTS</TD>
						<TD WIDTH="13%" NOWRAP="TRUE">&#160;</TD>
						
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;</TD>
					</TR>
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">CURR ADDRESS</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;
							<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/_RESIDENCE[@BorrowerResidencyType='Current']/@_StreetAddress"/>,						
							<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/_RESIDENCE[@BorrowerResidencyType='Current']/@_City"/>,
							<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/_RESIDENCE[@BorrowerResidencyType='Current']/@_State"/>
							<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/_RESIDENCE[@BorrowerResidencyType='Current']/@_PostalCode"/>
				
						</TD>
						
						<TD WIDTH="7%" NOWRAP="TRUE">&#160;</TD>
						
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">LENGTH</TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">&#160;</TD>
						
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;</TD>
					</TR>
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">PREV ADDRESS</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;
							<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/_RESIDENCE[@BorrowerResidencyType='Prior']/@_StreetAddress"/>,						
							<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/_RESIDENCE[@BorrowerResidencyType='Prior']/@_City"/>,
							<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/_RESIDENCE[@BorrowerResidencyType='Prior']/@_State"/>
							<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/_RESIDENCE[@BorrowerResidencyType='Prior']/@_PostalCode"/>
						
						</TD>
						
						<TD WIDTH="7%" NOWRAP="TRUE">&#160;</TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">LENGTH</TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">&#160;</TD>
						
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;</TD>
					</TR>
				</TABLE>
				
			<!-- IF no Derogs exist just print the message otherwise print all the sections with derogs -->
			

			
			<xsl:choose>
				<xsl:when test="string-length($noderoginfo) > 0">
				<BR/>
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"></TH>
					</TR>
				</TABLE>
				<BR/>
				<TABLE BORDER="1" CELLPADDING="0" CELLSPACING="0" WIDTH="100%">
				<TR><TD><BR/><center><b><xsl:value-of select="$noderoginfo"/></b></center><BR/></TD></TR>
				</TABLE>
				<BR/>
				
				</xsl:when>
				<xsl:otherwise>

				<!---  TRADELINE INFO -->
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>TRADE LINES</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE BORDER="1" CELLPADDING="0" CELLSPACING="0" WIDTH="100%">
				<TR>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="2%">D<br/>E<br/>R<br/>O<br/>G</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="2%">W<br/>H<br/>O<br/>S<br/>E<br/></TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="22%">CREDITOR</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="9%">DATE<br/>REPORTED<hr/>ECOA</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="9%">DATE<br/>OPENED<hr/>DLA</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="9%">HIGH<br/>CREDIT<hr/>ACCT TYPE</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="9%">BALANCE<br/>&#160;<hr/>TERMS</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="9%">PAST<br/>DUE</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="6%">MO<br/>REV</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="3%">30</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="3%">60</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="3%">90</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="14%">STATUS<br/>&#160;<hr/>SOURCE</TD>
					</TR>
				</TABLE>
				
				
 				<TABLE BORDER="1" CELLPADDING="0" CELLSPACING="0" WIDTH="100%" >
 				<TR>
 				<TD>
               		<TABLE WIDTH="100%" BORDER="0" CELLPADDING="0" CELLSPACING="0">
						<xsl:for-each select="//CREDIT_LIABILITY/@_UnpaidBalanceAmount">
	  						<xsl:variable name="pid">
								<xsl:value-of select="../@PARTYIDREF"/>
							</xsl:variable>
							<xsl:variable name="crd">
								<xsl:value-of select="../@CreditLiabilityID"/>
							</xsl:variable>
							<xsl:variable name="crcomment">
								<xsl:value-of select="../CREDIT_COMMENT[1]/_Text"/>
							</xsl:variable>
							<xsl:variable name="aot">
								<xsl:value-of select="../@_AccountOwnershipType"/>
							</xsl:variable>
					
					
							<xsl:choose>
					   			<xsl:when test="contains($crd,'OLD')">
						   			<xsl:call-template name="display_trade_grayed">
						      			<xsl:with-param name="borrid" select="$borrid"/>
						      			<xsl:with-param name="cobid" select="$cobid"/>
						      			<xsl:with-param name="pid" select="$pid"/>
						      			<xsl:with-param name="crd" select="$crd"/>
						      			<xsl:with-param name="crcomment" select="$crcomment"/>
						      			<xsl:with-param name="aot" select="$aot"/>
						      
						   			</xsl:call-template>  
					   			</xsl:when>
					   			<xsl:otherwise>
						   			<xsl:call-template name="display_trade_normal">
						     			 <xsl:with-param name="borrid" select="$borrid"/>
						      			<xsl:with-param name="cobid" select="$cobid"/>
						      			<xsl:with-param name="pid" select="$pid"/>
						      			<xsl:with-param name="crd" select="$crd"/>
						      			<xsl:with-param name="crcomment" select="$crcomment"/>
						      			<xsl:with-param name="aot" select="$aot"/>
						   			</xsl:call-template>  
					   			</xsl:otherwise>
							</xsl:choose>
				
			    		</xsl:for-each>	
			    		<TR><TD COLSPAN="13"></TD></TR>
			    	</TABLE>

				</TD>
				</TR>			    
				</TABLE>


				<!---  PUBLIC RECORD INFO -->
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>PUBLIC RECORDS</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE BORDER="0" CELLPADDING="1" CELLSPACING="1" WIDTH="100%">
					<TR>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="20%">NAME</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="15%">RECORD TYPE</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="5%">SOURCE</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="5%">AMOUNT</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="15%">COURT - DOCKET</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="10%">DATE FILED</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="10%">DATE SETTLED</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="5%">LIABILITY</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="15%">PLAINTIFF</TD>
					</TR>
				</TABLE>
				<TABLE BORDER="0" CELLPADDING="1" CELLSPACING="1" WIDTH="100%">
					<xsl:for-each select="//CREDIT_PUBLIC_RECORD">
				
					<TR>
						<TD WIDTH="20%" NOWRAP="TRUE">
							<!-- test for which borrname -->
							<xsl:if test="@BorrowerID[.=$borrid]">
								<xsl:value-of select="$borrname"/>&#160;&#160;<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/@_SSN"/>
							</xsl:if>	
							<xsl:if test="@BorrowerID[.=$cobid]">
								<xsl:value-of select="$cobname"/>&#160;&#160;<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$cobid]/@_SSN"/>
							</xsl:if>
						</TD>
						<TD WIDTH="15%" NOWRAP="TRUE"><xsl:apply-templates select="@_Type"/></TD>
						<TD WIDTH="5%" NOWRAP="TRUE">
        					<xsl:for-each select="CREDIT_REPOSITORY">
        						<xsl:if test="@_SourceType[.='Equifax']">EFX&#160;</xsl:if>    
 								<xsl:if test="@_SourceType[.='TransUnion']">TU&#160;</xsl:if>    
 								<xsl:if test="@_SourceType[.='Experian']">XPN&#160;</xsl:if> 
        					</xsl:for-each>     
						</TD>
						<TD WIDTH="5%" NOWRAP="TRUE"><xsl:apply-templates select="@_LegalObligationAmount"/></TD>
						<TD WIDTH="15%" NOWRAP="TRUE"><xsl:apply-templates select="@_CourtName"/>&#160;-&#160;<xsl:apply-templates select="@_DocketIdentifier"/></TD>
						<TD WIDTH="10%" NOWRAP="TRUE" CLASS="TDRED"><xsl:apply-templates select="@_FiledDate"/></TD>
						<TD WIDTH="10%" NOWRAP="TRUE"><xsl:apply-templates select="@_SettledDate"/></TD>
						<TD WIDTH="5%" NOWRAP="TRUE"><xsl:apply-templates select="@_BankruptcyLiabilitiesAmount"/></TD>
						<TD WIDTH="15%" NOWRAP="TRUE"><xsl:apply-templates select="@_PlaintiffName"/></TD>
					</TR>
					<TR><TD COLSPAN="9">&#160;</TD></TR>					
			    	</xsl:for-each>	
					<xsl:if test="count(//CREDIT_PUBLIC_RECORD) = 0"><TR><TD COLSPAN="4"><CENTER>NO RECORDS FOUND</CENTER></TD></TR></xsl:if>   
			    	<TR><TD COLSPAN="9"></TD></TR>
			    </TABLE>
  
				
				
				<!---  CREDIt INQUIRIES INFO -->
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>CREDIT INQUIRIES</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE BORDER="0" CELLPADDING="1" CELLSPACING="1" WIDTH="100%">
					<TR>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="25%">NAME</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="25%">BORR / COBORR</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="25%">DATE</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="25%">REPOSITORY</TD>
					</TR>
				</TABLE>
				<TABLE WIDTH="100%">
					<xsl:for-each select="//CREDIT_INQUIRY">
					<TR>
						<TD WIDTH="25%" NOWRAP="TRUE"><xsl:value-of select="@_Name"/></TD>
						<TD WIDTH="25%" NOWRAP="TRUE"><xsl:value-of select="@CreditFileID"/></TD>
						<TD WIDTH="25%" NOWRAP="TRUE" CLASS="TDRED"><xsl:value-of select="@_Date"/></TD>
						<TD WIDTH="25%" NOWRAP="TRUE">
							<xsl:for-each select="CREDIT_REPOSITORY">
								&#160;<xsl:value-of select="@_SourceType"/>&#160;<xsl:value-of select="@_SubscriberCode"/>
							</xsl:for-each>
						</TD>
					
					</TR>
					</xsl:for-each>
					<xsl:if test="count(//CREDIT_INQUIRY) = 0"><TR><TD COLSPAN="4"><CENTER>NO RECORDS FOUND</CENTER></TD></TR></xsl:if>   
					<TR><TD COLSPAN="4">&#160;</TD></TR>	
				</TABLE>
				
				</xsl:otherwise>
			</xsl:choose>


				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>DISCLAIMER</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE BORDER="0" WIDTH="100%">
					<TR><TD >&#160;</TD></TR>
					<TR>
					    
						<TD WIDTH="96%">This is a report containing information supplied from the repositiories listed&#160;
						                 below. The merge process is automated and the report may contain duplications and/or&#160;
						                 omissions. Inquiries regarding any disputed items should be directed to the creditor&#160; 
						                 reporting the item, or to the appropriate repository service center.
						</TD>
						
					</TR>
				</TABLE>
				<TABLE WIDTH="100%">
				
				
				
				
					<TR><TD COLSPAN="3">&#160;</TD></TR>
					
					<TR>
						<TD>
							<xsl:if test="//CREDIT_REPOSITORY_INCLUDED/@_EquifaxIndicator">
							Equifax Information Svc. LLC<br/>
							P.O. Box 740341<br/>							
							Atlanta, GA 30374<br/>
							800-685-1111<br/>
							www.equifax.com
							</xsl:if>
						</TD>
						<TD>
							<xsl:if test="//CREDIT_REPOSITORY_INCLUDED/@_ExperianIndicator">
							Experian<br/>
							701 Experian Parkway<br/>
							P.O. Box 2002<br/>
							Allen, TX 75013<br/>
							888-397-3742<br/>
							www.experian.com/reportaccess
							</xsl:if>
						</TD>
						<TD>
							<xsl:if test="//CREDIT_REPOSITORY_INCLUDED/@_TransUnionIndicator">Trans Union<br/>
							P.O. Box 4000<br/>
							Chester, PA 19016<br/>
							866-887-2673<br/>
							www.transunion.com
							</xsl:if>
						</TD>
					</TR>
				</TABLE>




			  <xsl:if test="string-length(//RESPONSE_DATA/CREDIT_RESPONSE/CREDIT_COMMENT/_Text[.='COMPLIANCE DATA CENTER, INC - EQUIFAX']) != 0 or 
			  				string-length(//RESPONSE_DATA/CREDIT_RESPONSE/CREDIT_COMMENT/_Text[.='OFAC NAME MATCHING CENTER - EXPERIAN']) != 0 or
			  				string-length(//RESPONSE_DATA/CREDIT_RESPONSE/CREDIT_COMMENT/_Text[.='OFAC ADVISOR - TRANSUNION'])!=0">
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>OFAC</CENTER></TH>
					</TR>
				</TABLE>
				
				<TABLE WIDTH="100%" >

				<!-- THE DETAILS OF COMMENTS -->
					<xsl:for-each select="//RESPONSE_DATA/CREDIT_RESPONSE/CREDIT_COMMENT">
						<xsl:if test="_Text[.='COMPLIANCE DATA CENTER, INC - EQUIFAX']">
							<TR>
						   		<TD><xsl:value-of select="@_SourceType"/></TD>
						   		<TD>
						   			<xsl:for-each select="_Text">
										<xsl:value-of select="."/><br/>
									</xsl:for-each>
								</TD>
							</TR>
						</xsl:if>   
						<xsl:if test="_Text[.='OFAC NAME MATCHING CENTER - EXPERIAN']">
							<TR>
						   		<TD><xsl:value-of select="@_SourceType"/></TD>
						   		<TD>
						   			<xsl:for-each select="_Text">
										<xsl:value-of select="."/><br/>
									</xsl:for-each>
								</TD>
							</TR>
						</xsl:if>
						<xsl:if test="_Text[.='OFAC ADVISOR - TRANSUNION']">
							<TR>
						   		<TD><xsl:value-of select="@_SourceType"/></TD>
						   		<TD>
						   			<xsl:for-each select="_Text">
										<xsl:value-of select="."/><br/>
									</xsl:for-each>
								</TD>
							</TR>
						</xsl:if>

						
							
					</xsl:for-each>
					<TR><TD>&#160;</TD></TR>
				</TABLE>
			 </xsl:if>
			 
			<TABLE BORDER="1" WIDTH="100%" >
				<TR>
					<TD>
						The information is furnished in response to an inquiry for the purpose of evaluating credit risks. 
						It has been obtained from sources deemed reliable, the accuracy of which this organization does not 
						guarantee. The inquirer has agreed to indemnify that reporting bureau for any damage arising from 
						misuse of this information, and this report is furnished in reliance upon that indemnify. It must 
						be held in strict confidence and complies with the provisions of Public Law 91-508, the Fair Credit 
						Reporting Act. Reporting bureau certifies that all Residential Mortgage Credit Reports meet the 
						standards prescribed by FNMA, FHMC, FHA, VA and the Farmers Home Administration. 

					</TD>						
				</TR>
			</TABLE>


				
			</BODY>
			</FORM>
		</HTML>
	</xsl:template>
	
	
									
	<xsl:template name="display_trade_grayed">
		<xsl:param name="borrid"/>
		<xsl:param name="cobid"/>
		<xsl:param name="pid"/>
		<xsl:param name="crd"/>
		<xsl:param name="crcomment"/>
		<xsl:param name="aot"/>
		
				<TR>
					
	      			<TD CLASS="TDSHADED" WIDTH="2%" NOWRAP="TRUE" ><xsl:if test="../@_DerogatoryDataIndicator[.='Y']">&#160;*</xsl:if></TD>
					
					<TD CLASS="TDSHADED" WIDTH="2%" NOWRAP="TRUE">
						<xsl:choose>
							<xsl:when test="../@BorrowerID=$borrid">
								B
							</xsl:when>
							<xsl:when test="../@BorrowerID=$cobid">
								C
							</xsl:when>
							<xsl:otherwise>
								J
							</xsl:otherwise>
						</xsl:choose>
					</TD>
											
					
					<TD CLASS="TDSHADED" WIDTH="22%" NOWRAP="TRUE">
						<B><xsl:apply-templates select="../_CREDITOR/@_Name"/></B><br/>
						<xsl:choose>
							<xsl:when test="../@_AccountIdentifier='N/A'">
								<xsl:text/>
							</xsl:when>
							<xsl:otherwise>
								<xsl:apply-templates select="../@_AccountIdentifier"/>
							</xsl:otherwise>
						</xsl:choose>
						
					</TD>
					<TD CLASS="TDSHADED" WIDTH="9%" NOWRAP="TRUE"><center><xsl:value-of select="../@_AccountReportedDate"/>&#160;<br/><xsl:value-of select="substring($aot,1,14)"/>&#160;</center></TD>
					<TD CLASS="TDSHADED" WIDTH="9%" NOWRAP="TRUE"><center><xsl:value-of select="../@_AccountOpenedDate"/>&#160;<br/><xsl:value-of select="../@_LastActivityDate"/>&#160;</center></TD>
					<TD CLASS="TDSHADED" WIDTH="9%" NOWRAP="TRUE"><center><xsl:value-of select="../@_HighCreditAmount"/>&#160;<br/><xsl:value-of select="../@_AccountType"/>&#160;</center></TD>
					<TD CLASS="TDSHADED" WIDTH="9%" NOWRAP="TRUE"><center><xsl:value-of select="../@_UnpaidBalanceAmount"/>&#160;<br/><xsl:value-of select="../@_TermsDescription"/></center></TD>
					<TD CLASS="TDSHADED" WIDTH="9%" NOWRAP="TRUE"><center><xsl:value-of select="../@_PastDueAmount"/>&#160;</center></TD>
					<TD CLASS="TDSHADED" WIDTH="6%" NOWRAP="TRUE"><center><xsl:value-of select="../@_MonthsReviewedCount"/>&#160;</center></TD>                                   			
 					<TD CLASS="TDSHADED" WIDTH="3%" NOWRAP="TRUE"><center><xsl:value-of select="../_LATE_COUNT/@_30Days"/>&#160;</center></TD>
					<TD CLASS="TDSHADED" WIDTH="3%" NOWRAP="TRUE"><center><xsl:value-of select="../_LATE_COUNT/@_60Days"/>&#160;</center></TD>
					<TD CLASS="TDSHADED" WIDTH="3%" NOWRAP="TRUE"><center><xsl:value-of select="../_LATE_COUNT/@_90Days"/>&#160;</center></TD>
					<TD CLASS="TDSHADED" WIDTH="14%" NOWRAP="TRUE"><center><xsl:value-of select="../_CURRENT_RATING/@_Code"/>&#160;<br/>
						<xsl:for-each select="../CREDIT_REPOSITORY">
  					      <xsl:if test="@_SourceType[.='Equifax']">EFX&#160;</xsl:if>    
 					      <xsl:if test="@_SourceType[.='TransUnion']">TU&#160;</xsl:if>    
 					      <xsl:if test="@_SourceType[.='Experian']">XPN&#160;</xsl:if> 
						</xsl:for-each></center>
					</TD>
				</TR>
				<TR><TD CLASS="TDSHADED" COLSPAN="13">&#160;</TD></TR>	
				<TR>
					<TD CLASS="TDSHADED" COLSPAN="2">&#160;</TD>
					<TD CLASS="TDSHADED" COLSPAN="3"><B>COMMENTS:&#160;&#160;</B>
				        <xsl:for-each select="../CREDIT_COMMENT">
				        	<xsl:choose>
								<xsl:when test="@_TypeOtherDescription='UL'">
							    	<FONT CLASS="TDRED"><B>
									<xsl:value-of select="_Text"/><xsl:text>&#160;;&#160;</xsl:text>
									</B></FONT>
								</xsl:when>
								<xsl:otherwise>
									<xsl:value-of select="_Text"/><xsl:text>&#160;;&#160;</xsl:text>
								</xsl:otherwise>
							</xsl:choose>

                        </xsl:for-each>
         
					</TD>
					<TD CLASS="TDSHADED" COLSPAN="8"><B>PAY PATTERN:</B>&#160;&#160;  Start &#160;<xsl:value-of select="../_PAYMENT_PATTERN/@_StartDate"/>&#160;
															&#160;&#160;&#160;<xsl:value-of select="../_PAYMENT_PATTERN/@_Data"/>
					</TD>
				</TR>
				
				<TR><TD CLASS="TDSHADED" COLSPAN="13">&#160;</TD></TR>	
	
	</xsl:template>


	
	<xsl:template name="display_trade_normal">
		<xsl:param name="borrid"/>
		<xsl:param name="cobid"/>
		<xsl:param name="pid"/>
		<xsl:param name="crd"/>
		<xsl:param name="crcomment"/>
		<xsl:param name="aot"/>
		
				<TR>
		 			<TD WIDTH="2%" NOWRAP="TRUE" ><xsl:if test="../@_DerogatoryDataIndicator[.='Y']">&#160;*</xsl:if></TD>
						
					<TD WIDTH="2%" NOWRAP="TRUE">
						<xsl:choose>
							<xsl:when test="../@BorrowerID=$borrid">
								B
							</xsl:when>
							<xsl:when test="../@BorrowerID=$cobid">
								C
							</xsl:when>
							<xsl:otherwise>
								J
							</xsl:otherwise>
						</xsl:choose>
					</TD>
											
					
					<TD WIDTH="22%" NOWRAP="TRUE">
						<B><xsl:apply-templates select="../_CREDITOR/@_Name"/></B><br/>
						<xsl:choose>
							<xsl:when test="../@_AccountIdentifier='N/A'">
								<xsl:text/>
							</xsl:when>
							<xsl:otherwise>
								<xsl:apply-templates select="../@_AccountIdentifier"/>
							</xsl:otherwise>
						</xsl:choose>
					</TD>
					<TD WIDTH="9%" NOWRAP="TRUE"><center><xsl:value-of select="../@_AccountReportedDate"/>&#160;<br/><xsl:value-of select="substring($aot,1,14)"/>&#160;</center></TD>
					<TD WIDTH="9%" NOWRAP="TRUE"><center><xsl:value-of select="../@_AccountOpenedDate"/>&#160;<br/><xsl:value-of select="../@_LastActivityDate"/>&#160;</center></TD>
					<TD WIDTH="9%" NOWRAP="TRUE"><center><xsl:value-of select="../@_HighCreditAmount"/>&#160;<br/><xsl:value-of select="../@_AccountType"/>&#160;</center></TD>
					<TD WIDTH="9%" NOWRAP="TRUE"><center><xsl:value-of select="../@_UnpaidBalanceAmount"/>&#160;<br/><xsl:value-of select="../@_TermsDescription"/></center></TD>
					<TD WIDTH="9%" NOWRAP="TRUE"><center><xsl:value-of select="../@_PastDueAmount"/>&#160;</center></TD>
					<TD WIDTH="6%" NOWRAP="TRUE"><center><xsl:value-of select="../@_MonthsReviewedCount"/>&#160;</center></TD>                                   			
 					<TD WIDTH="3%" NOWRAP="TRUE"><center><xsl:value-of select="../_LATE_COUNT/@_30Days"/>&#160;</center></TD>
					<TD WIDTH="3%" NOWRAP="TRUE"><center><xsl:value-of select="../_LATE_COUNT/@_60Days"/>&#160;</center></TD>
					<TD WIDTH="3%" NOWRAP="TRUE"><center><xsl:value-of select="../_LATE_COUNT/@_90Days"/>&#160;</center></TD>
					<TD WIDTH="14%" NOWRAP="TRUE"><center><xsl:value-of select="../_CURRENT_RATING/@_Code"/>&#160;<br/>
						<xsl:for-each select="../CREDIT_REPOSITORY">
  					      <xsl:if test="@_SourceType[.='Equifax']">EFX&#160;</xsl:if>    
 					      <xsl:if test="@_SourceType[.='TransUnion']">TU&#160;</xsl:if>    
 					      <xsl:if test="@_SourceType[.='Experian']">XPN&#160;</xsl:if> 
						</xsl:for-each></center>
					</TD>
				</TR>
				<TR><TD COLSPAN="13">&#160;</TD></TR>	
								
				<TR>
					<TD COLSPAN="2">&#160;</TD>
					<TD COLSPAN="3"><B>COMMENTS:&#160;&#160;</B>
					
				        <xsl:for-each select="../CREDIT_COMMENT">
				        	<xsl:choose>
								<xsl:when test="@_TypeOtherDescription='UL'">
							    	<FONT CLASS="TDRED"><B>
									<xsl:value-of select="_Text"/><xsl:text>&#160;;&#160;</xsl:text>
									</B></FONT>
								</xsl:when>
								<xsl:otherwise>
									<xsl:value-of select="_Text"/><xsl:text>&#160;;&#160;</xsl:text>
								</xsl:otherwise>
							</xsl:choose>

                        </xsl:for-each>
         
					</TD>
 					<TD COLSPAN="8"><B>PAY PATTERN:</B>&#160;&#160;  Start &#160;<xsl:value-of select="../_PAYMENT_PATTERN/@_StartDate"/>&#160;
															&#160;&#160;&#160;<xsl:value-of select="../_PAYMENT_PATTERN/@_Data"/>
					</TD>
				</TR>
				
				<TR><TD COLSPAN="13">&#160;</TD></TR>	
		</xsl:template>
		
</xsl:stylesheet>