<?xml version="1.0"?>

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
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
<HTML>
<HEAD>

<STYLE>
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
<script language="JavaScript"><![CDATA[
var openwindow = 0;
function phonehome(acctname,acctnumber)
{
   var frm = document.form;
   
 

      openwindow = window.open("","openwindow","WIDTH= 400 HEIGHT=300");
      
      var formstr = "<html><he" + "ad><title>GDS LINK update screen  " + acctname + " - " + acctnumber + "</title></he" + "ad>";
      formstr += "<bo" + "dy bgcolor=SILVER ><form name=\"upwindow\" action=\"http://www.mergepower.com\" method=\"POST\" >";

      formstr += "<BR><BR>";
      formstr += "<TABLE width=\"100%\"><tr>"
      formstr += "<td><center><input type=button value=\"Cancel \" onClick=\"self.close()\"/></center></td>";
      formstr += "</tr></TABLE>"
      formstr += "<BR><BR></form></bo" + "dy></html>";
      
      openwindow.document.write(formstr);
      
}


]]></script>			
					
</HEAD>
<FORM name="mpsample">
<BODY>

		<xsl:text disable-output-escaping="yes">&lt;input type="hidden" name="creditreportid" value="</xsl:text>  
			<xsl:value-of select="//CREDIT_RESPONSE/@CreditReportIdentifier"/>
		<xsl:text disable-output-escaping="yes">"/&gt;</xsl:text>  

		<BR/><BR/>
				
				
				
				
		<TABLE BORDER="0" WIDTH="100%">
			<TR><TD><FONT  size = "+1"><B>GDS LINK CREDIT REPORT</B></FONT></TD></TR>
			<TR><TH CLASS="NORMALBANNER" WIDTH="100%"></TH></TR>
		</TABLE>
				<!--  Page one header area -->
				<TABLE CELLPADDING="0" CELLSPACING="0" WIDTH="100%" >
				<xsl:for-each select="//CREDIT_RESPONSE">
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">CRED REF #</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;<xsl:value-of select="//RESPONSE_DATA/CREDIT_RESPONSE/@CreditReportIdentifier"/></TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">DATE COMPLETED</TD>
						<TD WIDTH="13%" NOWRAP="TRUE">&#160;<xsl:value-of select="@CreditReportLastUpdatedDate"/></TD>
						<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">REQUESTED BY</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;<xsl:value-of select="//RESPOND_TO_PARTY/CONTACT_DETAIL/@_Name"/></TD>
					</TR>
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">PREPARED FOR</TD>
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;<xsl:value-of select="//RESPOND_TO_PARTY/@_Name"/></TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">DATE ORDERED</TD>
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
							<xsl:apply-templates select="CREDIT_BUREAU/@_City"/>,&#xa0;
							<xsl:apply-templates select="CREDIT_BUREAU/@_State"/>&#xa0;
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
							<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/_RESIDENCE[@BorrowerResidencyType='Current']/@_StreetAddress"/>,&#xa0;						
							<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/_RESIDENCE[@BorrowerResidencyType='Current']/@_City"/>,&#xa0;
							<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/_RESIDENCE[@BorrowerResidencyType='Current']/@_State"/>&#xa0;
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
							<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/_RESIDENCE[@BorrowerResidencyType='Prior']/@_StreetAddress"/>,&#xa0;						
							<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/_RESIDENCE[@BorrowerResidencyType='Prior']/@_City"/>,&#xa0;
							<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/_RESIDENCE[@BorrowerResidencyType='Prior']/@_State"/>&#xa0;
							<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/_RESIDENCE[@BorrowerResidencyType='Prior']/@_PostalCode"/>
						
						</TD>
						
						<TD WIDTH="7%" NOWRAP="TRUE">&#160;</TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">LENGTH</TD>
						<TD WIDTH="13%" CLASS="BOLD8" NOWRAP="TRUE">&#160;</TD>
						
						<TD WIDTH="20%" NOWRAP="TRUE">&#160;</TD>
					</TR>
				</TABLE>
				<!---  EMPLOYMENT INFO -->
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>EMPLOYMENT INFO</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE CELLPADDING="0" CELLSPACING="0" WIDTH="100%" >
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">EMPLOYER</TD>
						<TD WIDTH="34%" NOWRAP="TRUE"><xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/EMPLOYER/@_Name"/></TD>
						<TD WIDTH="20%" CLASS="BOLD8" NOWRAP="TRUE">EMPLOYER</TD>
						<TD WIDTH="36%" NOWRAP="TRUE"><xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$cobid]/EMPLOYER/@_Name"/></TD>
					</TR>
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">POSITION</TD>
						<TD WIDTH="34%" NOWRAP="TRUE"><xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/EMPLOYER/@EmploymentPositionDescription"/></TD>
						<TD WIDTH="20%" CLASS="BOLD8" NOWRAP="TRUE">POSITION</TD>
						<TD WIDTH="36%" NOWRAP="TRUE"><xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$cobid]/EMPLOYER/@EmploymentPositionDescription"/></TD>
					</TR>
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">SINCE</TD>
						<TD WIDTH="34%" NOWRAP="TRUE"><xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/EMPLOYER/@CurrentEmploymentStartDate"/></TD>
						<TD WIDTH="20%" CLASS="BOLD8" NOWRAP="TRUE">SINCE</TD>
						<TD WIDTH="36%" NOWRAP="TRUE"><xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$cobid]/EMPLOYER/@CurrentEmploymentStartDate"/></TD>
					</TR>
					<TR>
					  	<TD WIDTH="10%" CLASS="BOLD8" NOWRAP="TRUE">INCOME</TD>
						<TD WIDTH="34%" NOWRAP="TRUE"><xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/EMPLOYER/@IncomeEmploymentMonthlyAmount"/></TD>
						<TD WIDTH="20%" CLASS="BOLD8" NOWRAP="TRUE">INCOME</TD>
						<TD WIDTH="36%" NOWRAP="TRUE"><xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$cobid]/EMPLOYER/@IncomeEmploymentMonthlyAmount"/></TD>
					</TR>
				</TABLE>
				<!---  SCORES INFO -->
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>CREDIT SCORES</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE CELLPADDING="0" CELLSPACING="0" WIDTH="100%" >
					<xsl:for-each select="//CREDIT_RESPONSE/CREDIT_SCORE">
					<TR><TD COLS="4">&#160;</TD></TR>
					<TR>
					  	<TD WIDTH="25%" NOWRAP="TRUE" CLASS="BOLD8">
					  		<xsl:choose>
								<xsl:when test="@_ModelNameType='Other'">
									<xsl:value-of select="@_ModelNameTypeOtherDescription"/>
								</xsl:when>
								<xsl:otherwise>
									<xsl:value-of select="@_ModelNameType"/>
								</xsl:otherwise>
							</xsl:choose>
					  	</TD>
						<!-- test for which borrname -->
						<xsl:if test="@BorrowerID[.=$borrid]">
							<TD WIDTH="25%" NOWRAP="TRUE" CLASS="BOLD8"><xsl:value-of select="$borrname"/></TD>
							<TD WIDTH="25%" NOWRAP="TRUE" CLASS="BOLD8"><xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/@_SSN"/></TD>
						</xsl:if>	
						<xsl:if test="@BorrowerID[.=$cobid]">
							<TD WIDTH="25%" NOWRAP="TRUE" CLASS="BOLD8"><xsl:value-of select="$cobname"/></TD>
							<TD WIDTH="25%" NOWRAP="TRUE" CLASS="BOLD8"><xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$cobid]/@_SSN"/></TD>
						</xsl:if>
						
						<xsl:if test="@_Value > 1">
						   <TD WIDTH="25%" NOWRAP="TRUE" CLASS="BOLD8"><xsl:value-of select="@_Value"/></TD>
						</xsl:if>    
						<xsl:if test="//CREDIT_RESPONSE/CREDIT_SCORE/@_ExclusionReasonType">
							<TR>
								<TD COLS="3" NOWRAP="TRUE" CLASS="BOLD8"><xsl:value-of select="@_ExclusionReasonType"/></TD>
							</TR>
						</xsl:if>    
						<xsl:for-each select="_FACTOR">
							<TR>
								<TD WIDTH="25%" NOWRAP="TRUE"><xsl:value-of select="@_Code"/></TD>
								<TD COLS="3" NOWRAP="TRUE"><xsl:value-of select="@_Text"/></TD>
							</TR>
						</xsl:for-each>
					</TR>
					
					</xsl:for-each>
					<TR><TD>&#160;</TD><TD>&#160;</TD></TR>
				</TABLE>
				
				<!---  TRADELINE INFO -->
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>TRADE LINES</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE BORDER="0" CELLPADDING="1" CELLSPACING="1" WIDTH="100%">
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
                <TABLE WIDTH="100%" >
					
					
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
				
										
					<TR>
						<TD WIDTH="2%" NOWRAP="TRUE" CLASS="BOLD18"><xsl:if test="../@_DerogatoryDataIndicator[.='Y']">*</xsl:if></TD>
						
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
							<xsl:text disable-output-escaping="yes">&lt;a href="javascript:phonehome('</xsl:text>  
							     <xsl:apply-templates select="../_CREDITOR/@_Name"/>
							     <xsl:text disable-output-escaping="yes">','</xsl:text>
							     <xsl:apply-templates select="../@_AccountIdentifier"/>
							     <xsl:text disable-output-escaping="yes">')"></xsl:text><xsl:apply-templates select="../_CREDITOR/@_Name"/><xsl:text disable-output-escaping="yes">&lt;</xsl:text>/a<xsl:text disable-output-escaping="yes">&gt;</xsl:text><BR/>
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
					<!--<TR><TD COLSPAN="13">&#160;</TD></TR>-->					
					<TR>
						<TD COLSPAN="2">&#160;</TD>
						<TD COLSPAN="3"><B>COMMENTS:&#160;&#160;</B>
					        <xsl:for-each select="../CREDIT_COMMENT">
			 			      <xsl:value-of select="_Text"/><xsl:text>&#160;;&#160;</xsl:text>
                            </xsl:for-each>
						</TD>
 						<TD COLSPAN="8"><B>PAY PATTERN:</B>&#160;&#160;  Start &#160;<xsl:value-of select="../_PAYMENT_PATTERN/@_StartDate"/>&#160;
																&#160;&#160;&#160;<xsl:value-of select="../_PAYMENT_PATTERN/@_Data"/>
						</TD>
					</TR>
					<TR><TD COLSPAN="13"><hr/></TD></TR>					
					
			    </xsl:for-each>	
			<xsl:if test="count(//CREDIT_LIABILITY) = 0"><TR><TD COLSPAN="13"><CENTER>NO RECORDS FOUND</CENTER></TD></TR></xsl:if>   
			    <TR><TD COLSPAN="13"></TD></TR>
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
						<TD WIDTH="10%" NOWRAP="TRUE"><xsl:apply-templates select="@_FiledDate"/></TD>
						<TD WIDTH="10%" NOWRAP="TRUE"><xsl:apply-templates select="@_SettledDate"/></TD>
						<TD WIDTH="5%" NOWRAP="TRUE"><xsl:apply-templates select="@_BankruptcyLiabilitiesAmount"/></TD>
						<TD WIDTH="15%" NOWRAP="TRUE"><xsl:apply-templates select="@_PlaintiffName"/></TD>
					</TR>
					<TR><TD COLSPAN="9">&#160;</TD></TR>					
			    	</xsl:for-each>	
					<xsl:if test="count(//CREDIT_PUBLIC_RECORD) = 0"><TR><TD COLSPAN="4"><CENTER>NO RECORDS FOUND</CENTER></TD></TR></xsl:if>   
			    	<TR><TD COLSPAN="9"></TD></TR>
			    </TABLE>
				
				
				<!---  CREDIT INQUIRIES INFO -->
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
						<TD WIDTH="25%" NOWRAP="TRUE"><xsl:value-of select="@_Date"/></TD>
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
				
				<!---  CREDIT ALERTS INFO -->
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>CREDIT ALERTS</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE BORDER="0" CELLPADDING="1" CELLSPACING="1" WIDTH="100%">
					<TR>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="20%">TYPE</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="25%">BORR / COBORR</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="55%">MESSAGE</TD>
					</TR>
				</TABLE>

				<TABLE WIDTH="100%">
					<xsl:for-each select="//CREDIT_FILE/_ALERT_MESSAGE">
					    <xsl:variable name="abor">
					       <xsl:value-of select="../@BorrowerID"/>
					    </xsl:variable>
				
						<TR>

							<TD WIDTH="20%">
								<xsl:choose>
									<xsl:when test="@_Type[.='Other']"><xsl:value-of select="@_CategoryType"/></xsl:when>
									<xsl:otherwise><xsl:value-of select="@_Type"/></xsl:otherwise>
								</xsl:choose>
							</TD>

							<TD  WIDTH="25%">
								<xsl:if test="../@BorrowerID[.=$borrid]">
									<xsl:value-of select="$borrname"/>&#160;&#160;<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$borrid]/@_SSN"/>
								</xsl:if>	
								<xsl:if test="../@BorrowerID[.=$cobid]">
									<xsl:value-of select="$cobname"/>&#160;&#160;<xsl:value-of select="//CREDIT_RESPONSE/BORROWER[@BorrowerID=$cobid]/@_SSN"/>
								</xsl:if>
							</TD>
							<TD  WIDTH="55%"><xsl:value-of select="_Text"/></TD>
						</TR>

					</xsl:for-each>
					<xsl:if test="count(//CREDIT_FILE/_ALERT_MESSAGE) = 0"><TR><TD COLSPAN="4"><CENTER>NO RECORDS FOUND</CENTER></TD></TR></xsl:if>   
					<TR><TD COLSPAN="3">&#160;</TD></TR>
				</TABLE>

				<!---  CREDIT FILE INFO 
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>CREDIT FILE</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE BORDER="0" CELLPADDING="1" CELLSPACING="1" WIDTH="100%">
					<TR>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="20%">NAME</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="15%">SSN</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="50%">BIRTHDATE</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="15%">CREDIT FILE ID</TD>
					</TR>
				</TABLE>


				<TABLE WIDTH="100%">
					<xsl:for-each select="//CREDIT_FILE">			
                        <xsl:if test="string-length(_BORROWER/@_UnparsedName)">							
							<TR>
								<TD WIDTH="20%"><xsl:value-of select="_BORROWER/@_UnparsedName"/></TD>
								<TD WIDTH="15%"><xsl:value-of select="_BORROWER/@_SSN"/></TD>
								<TD WIDTH="50%"><xsl:value-of select="_BORROWER/@_BirthDate"/></TD>
								<TD WIDTH="15%"><xsl:value-of select="@CreditFileID"/></TD>
							</TR>
							
						</xsl:if>
					</xsl:for-each>	
					<xsl:if test="count(//CREDIT_FILE) = 0"><TR><TD COLSPAN="4"><CENTER>NO RECORDS FOUND</CENTER></TD></TR></xsl:if>   
					<TR><TD COLSPAN="4">&#160;</TD></TR>
				</TABLE>
				-->

				<!---  CREDIT FILE VARIATIONS --> 
				<xsl:if test="count(//CREDIT_FILE/_BORROWER/_ALIAS) > 0">
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>NAME VARIATIONS</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE BORDER="0" CELLPADDING="1" CELLSPACING="1" WIDTH="100%">
					<TR>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="20%">SOURCE</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="65%">NAME</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="15%">CREDIT FILE ID</TD>
					</TR>
				</TABLE>


				<TABLE WIDTH="100%">
					<xsl:for-each select="//CREDIT_FILE">
						<xsl:if test="string-length(_BORROWER/_ALIAS/@_UnparsedName)">
							<TR>
								<TD WIDTH="20%"><xsl:value-of select="@CreditRepositorySourceType"/></TD>
								<TD WIDTH="65%"><xsl:value-of select="_BORROWER/_ALIAS/@_UnparsedName"/></TD>
								<TD WIDTH="15%"><xsl:value-of select="@CreditFileID"/></TD>
							</TR>
							
						</xsl:if>
					</xsl:for-each>	
				</TABLE>
				</xsl:if>   

				<!---  COMMENTS INFO -->
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>CREDIT COMMENTS</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE BORDER="0" CELLPADDING="1" CELLSPACING="1" WIDTH="100%">
					<TR>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="20%">SOURCE</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="80%">MESSAGE</TD>
					</TR>
				</TABLE>
				<TABLE WIDTH="100%">
					<xsl:for-each select="//RESPONSE_DATA/CREDIT_RESPONSE/CREDIT_FILE/CREDIT_COMMENT">
						<TR>
							<TD WIDTH="20%"><xsl:value-of select="@_SourceType"/></TD>
							<TD WIDTH="80%">
								<xsl:for-each select="_Text">
									<xsl:value-of select="."/><br/>
								</xsl:for-each>
							</TD>
						</TR>

					</xsl:for-each>	
					<xsl:if test="count(//RESPONSE_DATA/CREDIT_RESPONSE/CREDIT_FILE/CREDIT_COMMENT) = 0"><TR><TD COLSPAN="4"><CENTER>NO RECORDS FOUND</CENTER></TD></TR></xsl:if>   
					<TR><TD COLSPAN="2">&#160;</TD></TR>
				</TABLE>

				<!---  REGULATORY PRODUCT -->
				<xsl:if test="count(//REGULATORY_PRODUCT) > 0">
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>OFAC MESSAGE</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE BORDER="0" CELLPADDING="1" CELLSPACING="1" WIDTH="100%">
					<TR>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="10%">TYPE</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="10%">RESULT</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="15%">SOURCE</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="65%">MESSAGE</TD>
					</TR>
				</TABLE>
				<TABLE WIDTH="100%">
					<xsl:for-each select="//REGULATORY_PRODUCT">
						<TR>
							<TD WIDTH="10%"><xsl:value-of select="@_SourceType"/></TD>
							<TD WIDTH="10%"><xsl:value-of select="@_ResultStatusType"/></TD>
							<TD WIDTH="15%"><xsl:value-of select="@CreditRepositorySourceType"/></TD>
							<TD WIDTH="65%"><xsl:value-of select="@_ResultText"/><br/></TD>
						</TR>
						
					</xsl:for-each>	
				</TABLE>
				</xsl:if>   

				<!---  CREDIT ERROR MESSAGE -->
				<xsl:if test="count(//RESPONSE_DATA/CREDIT_RESPONSE/CREDIT_FILE/CREDIT_ERROR_MESSAGE) > 0">
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>CREDIT ERROR MESSAGES</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE BORDER="0" CELLPADDING="1" CELLSPACING="1" WIDTH="100%">
					<TR>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="20%">SOURCE</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="80%">MESSAGE</TD>
					</TR>
				</TABLE>
				<TABLE WIDTH="100%">
					<xsl:for-each select="//RESPONSE_DATA/CREDIT_RESPONSE/CREDIT_FILE/CREDIT_ERROR_MESSAGE">
						<TR>
							<TD WIDTH="20%"><xsl:value-of select="@_SourceType"/></TD>
							<TD WIDTH="80%">
								<xsl:for-each select="_Text">
									<xsl:value-of select="."/><br/>
								</xsl:for-each>
							</TD>
						</TR>
						
					</xsl:for-each>	
				</TABLE>
				</xsl:if>   

				<!---  SUBSCRIBER INFO -->
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>SUBSCRIBER INFO</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE BORDER="0" CELLPADDING="1" CELLSPACING="1" WIDTH="100%">
					<TR>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="20%">NAME</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="20%">ACCOUNT</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="20%">ADDRESS</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="20%">PHONE</TD>
						<TD CLASS="TRADEBANNERCENTER" WIDTH="20%">SUBSCRIBER NUMBER</TD>
					</TR>
				</TABLE>
				<TABLE WIDTH="100%">
		   			<xsl:for-each select="//CREDIT_TRADE_REFERENCE/@_Name">
				   		<xsl:sort  data-type = "text" order = "ascending"/>
				        <xsl:variable name="ctid" select="../@CreditTradeReferenceID"/>
						<TR>
							<TD WIDTH="20%"><xsl:value-of select="../@_Name"/></TD>
							<TD WIDTH="20%"><xsl:value-of select="//CREDIT_LIABILITY[@CreditTradeReferenceID = $ctid]/@_AccountIdentifier"/></TD>
							<TD WIDTH="20%"><xsl:value-of select ="concat(../@_StreetAddress, ' ', ../@_City, ' ', ../@_State, ' ', ../@_PostalCode)"/></TD>
							<TD WIDTH="20%"><xsl:value-of select="../CONTACT_DETAIL/CONTACT_POINT/@_Value"/></TD>
							<TD WIDTH="20%"><xsl:value-of select="//CREDIT_LIABILITY[@CreditTradeReferenceID = $ctid]/CREDIT_REPOSITORY/@_SubscriberCode"/></TD>
						</TR>
					</xsl:for-each>	
					<xsl:if test="count(//CREDIT_TRADE_REFERENCE/@_Name) = 0"><TR><TD COLSPAN="4"><CENTER>NO RECORDS FOUND</CENTER></TD></TR></xsl:if>   
					<TR><TD COLSPAN="5">&#160;</TD></TR>
				</TABLE>
				
				<TABLE BORDER="0" WIDTH="100%">
					<TR>
						<TH CLASS="NORMALBANNER" WIDTH="100%"><CENTER>ATTRIBUTE SUMMARY</CENTER></TH>
					</TR>
				</TABLE>
				<TABLE WIDTH="100%">
				
					<TR><TD CLASS="TRADEBANNERCENTER" WIDTH="20%">NAME</TD><TD CLASS="TRADEBANNERCENTER" WIDTH="45%">ATTRIBUTE </TD><TD CLASS="TRADEBANNERCENTER" WIDTH="12%">VALUE</TD><TD CLASS="TRADEBANNERCENTER" WIDTH="23%">&#160;</TD></TR>
					<TR>
					
						<xsl:if test="//CREDIT_SUMMARY/@BorrowerID[.=$borrid] and //CREDIT_SUMMARY/@_Name[.='Attributes']">
							<TD WIDTH="20%" NOWRAP="TRUE" CLASS="BOLD8"><xsl:value-of select="$borrname"/></TD>
							<TD WIDTH="45%">&#160;</TD>
							<TD WIDTH="12%">&#160;</TD>
							<TD WIDTH="23%">&#160;</TD>
						</xsl:if>
				
						<xsl:for-each select="//CREDIT_SUMMARY[@BorrowerID=$borrid]/_DATA_SET">
							<xsl:if test="../@_Name[.='Attributes']">
							<TR>
				   				<TD WIDTH="20%">&#160;</TD>
				   				<TD WIDTH="45%"><xsl:value-of select="@_Name"/></TD>
								<TD WIDTH="12%"><xsl:value-of select="@_Value"/></TD>
								<TD WIDTH="23%">&#160;</TD>
							</TR>
							</xsl:if>
						</xsl:for-each>	
						
						<xsl:if test="//CREDIT_SUMMARY/@BorrowerID[.=$borrid] and //CREDIT_SUMMARY/@_Name[.='Programs']">
							<TR>
				   				<TD WIDTH="20%"><B>PROGRAMS</B></TD>
				   				<TD WIDTH="45%">&#160;</TD>
								<TD WIDTH="12%">&#160;</TD>
								<TD WIDTH="23%">&#160;</TD>
							</TR>
							
							<xsl:for-each select="//CREDIT_SUMMARY[@BorrowerID=$borrid]/_DATA_SET">
								<xsl:if test="../@_Name[.='Programs']">
								<TR>
				   					<TD WIDTH="20%">&#160;</TD>
				   					<TD WIDTH="45%"><xsl:value-of select="@_Name"/></TD>
									<TD WIDTH="12%"><xsl:value-of select="@_Value"/></TD>
									<TD WIDTH="23%">&#160;</TD>
								</TR>
								</xsl:if>
							</xsl:for-each>	
						
						</xsl:if>
						<xsl:if test="//CREDIT_SUMMARY/@BorrowerID[.=$borrid] and //CREDIT_SUMMARY/@_Name[.='Experian Credit Summary']">
							<TR>
				   				<TD WIDTH="20%"><B>Experian Credit Summary</B></TD>
								<TD WIDTH="45%"><B>Borrower</B>&#160;</TD>
								<TD WIDTH="12%">&#160;</TD>
								<TD WIDTH="23%">&#160;</TD>
							</TR>
							
							<xsl:for-each select="//CREDIT_SUMMARY[@BorrowerID=$borrid]/_DATA_SET">
								<xsl:if test="../@_Name[.='Experian Credit Summary']">
								<TR>
				   					<TD WIDTH="20%">&#160;</TD>
				   					<TD WIDTH="45%"><xsl:value-of select="@_Name"/></TD>
									<TD WIDTH="12%"><xsl:value-of select="@_Value"/></TD>
									<TD WIDTH="23%">&#160;</TD>
								</TR>
								</xsl:if>
							</xsl:for-each>	
						</xsl:if>
					
						<xsl:if test="//CREDIT_SUMMARY/@BorrowerID[.=$borrid] and //CREDIT_SUMMARY/@_Name[.='TransUnion Credit Summary']">
							<TR>
				   				<TD WIDTH="20%"><B>TransUnion Credit Summary</B></TD>
								<TD WIDTH="45%"><B>Borrower</B>&#160;</TD>
								<TD WIDTH="12%">&#160;</TD>
								<TD WIDTH="23%">&#160;</TD>
							</TR>
							
							<xsl:for-each select="//CREDIT_SUMMARY[@BorrowerID=$borrid]/_DATA_SET">
								<xsl:if test="../@_Name[.='TransUnion Credit Summary']">
								<TR>
				   					<TD WIDTH="20%">&#160;</TD>
				   					<TD WIDTH="45%"><xsl:value-of select="@_Name"/></TD>
									<TD WIDTH="12%"><xsl:value-of select="@_Value"/></TD>
									<TD WIDTH="23%">&#160;</TD>
								</TR>
								</xsl:if>
							</xsl:for-each>	
						</xsl:if>
					
						<xsl:if test="//CREDIT_SUMMARY/@BorrowerID[.=$cobid] and //CREDIT_SUMMARY/@_Name[.='Attributes']">
							<TD WIDTH="20%" NOWRAP="TRUE" CLASS="BOLD8"><xsl:value-of select="$cobname"/></TD>
							<TD WIDTH="45%">&#160;</TD>
							<TD WIDTH="12%">&#160;</TD>
							<TD WIDTH="23%">&#160;</TD>
						</xsl:if>
							
					
						<xsl:for-each select="//CREDIT_SUMMARY[@BorrowerID=$cobid]/_DATA_SET">
							<xsl:if test="../@_Name[.='Attributes']">
							<TR>
				   				<TD WIDTH="20%">&#160;</TD>
				   				<TD WIDTH="45%"><xsl:value-of select="@_Name"/></TD>
								<TD WIDTH="12%"><xsl:value-of select="@_Value"/></TD>
								<TD WIDTH="23%">&#160;</TD>
							</TR>
							</xsl:if>
						</xsl:for-each>	
						
						<xsl:if test="//CREDIT_SUMMARY/@BorrowerID[.=$cobid] and //CREDIT_SUMMARY/@_Name[.='Programs']">
							<TR>
				   				<TD WIDTH="20%"><B>PROGRAMS</B></TD>
				   				<TD WIDTH="45%">&#160;</TD>
								<TD WIDTH="12%">&#160;</TD>
								<TD WIDTH="23%">&#160;</TD>
							</TR>
							
							<xsl:for-each select="//CREDIT_SUMMARY[@BorrowerID=$cobid]/_DATA_SET">
								<xsl:if test="../@_Name[.='Programs']">
								<TR>
				   					<TD WIDTH="20%">&#160;</TD>
				   					<TD WIDTH="45%"><xsl:value-of select="@_Name"/></TD>
									<TD WIDTH="12%"><xsl:value-of select="@_Value"/></TD>
									<TD WIDTH="23%">&#160;</TD>
								</TR>
								</xsl:if>
							</xsl:for-each>	
						
						</xsl:if>
						<xsl:if test="//CREDIT_SUMMARY/@BorrowerID[.=$cobid] and //CREDIT_SUMMARY/@_Name[.='Experian Credit Summary']">
							<TR>
				   				<TD WIDTH="20%"><B>Experian Credit Summary</B></TD>
								<TD WIDTH="45%"><B>Coborrower</B>&#160;</TD>
								<TD WIDTH="12%">&#160;</TD>
								<TD WIDTH="23%">&#160;</TD>
							</TR>
							
							<xsl:for-each select="//CREDIT_SUMMARY[@BorrowerID=$cobid]/_DATA_SET">
								<xsl:if test="../@_Name[.='Experian Credit Summary']">
								<TR>
				   					<TD WIDTH="20%">&#160;</TD>
				   					<TD WIDTH="45%"><xsl:value-of select="@_Name"/></TD>
									<TD WIDTH="12%"><xsl:value-of select="@_Value"/></TD>
									<TD WIDTH="23%">&#160;</TD>
								</TR>
								</xsl:if>
							</xsl:for-each>	
						</xsl:if>
						<xsl:if test="//CREDIT_SUMMARY/@BorrowerID[.=$cobid] and //CREDIT_SUMMARY/@_Name[.='TransUnion Credit Summary']">
							<TR>
				   				<TD WIDTH="20%"><B>TransUnion Credit Summary</B></TD>
								<TD WIDTH="45%"><B>Coborrower</B>&#160;</TD>
								<TD WIDTH="12%">&#160;</TD>
								<TD WIDTH="23%">&#160;</TD>
							</TR>
							
							<xsl:for-each select="//CREDIT_SUMMARY[@BorrowerID=$cobid]/_DATA_SET">
								<xsl:if test="../@_Name[.='TransUnion Credit Summary']">
								<TR>
				   					<TD WIDTH="20%">&#160;</TD>
				   					<TD WIDTH="45%"><xsl:value-of select="@_Name"/></TD>
									<TD WIDTH="12%"><xsl:value-of select="@_Value"/></TD>
									<TD WIDTH="23%">&#160;</TD>
								</TR>
								</xsl:if>
							</xsl:for-each>	
						</xsl:if>
					        <xsl:if test="count(//CREDIT_SUMMARY) = 0"><TR><TD COLSPAN="4"><CENTER>NONE</CENTER></TD></TR></xsl:if>   
			    	<TR><TD COLSPAN="9"></TD></TR>
					</TR>
				</TABLE>

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

</xsl:stylesheet>
