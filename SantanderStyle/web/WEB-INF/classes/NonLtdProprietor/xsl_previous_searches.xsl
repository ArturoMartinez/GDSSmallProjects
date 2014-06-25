<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
 <xsl:template name="applicationType">
        <xsl:param name="curVal" />
   <xsl:choose>
      <xsl:when test="$curVal='AC'">Agent’s Customer Mail Order </xsl:when>
      <xsl:when test="$curVal='AG'">Agency Account</xsl:when>
      <xsl:when test="$curVal='AO'">Customer Address Authenticity</xsl:when>
      <xsl:when test="$curVal='BK'">Broker</xsl:when>
      <xsl:when test="$curVal='CA'">Current Account </xsl:when>
      <xsl:when test="$curVal='CAPS &amp; EQ'">Shared for credit – searches carried out in the name of the consumer </xsl:when>
      <xsl:when test="$curVal='CAPS &#38; EQ'">Shared for credit – searches carried out in the name of the consumer </xsl:when>
      <xsl:when test="$curVal='CC'">Credit Card </xsl:when>
      <xsl:when test="$curVal='CD'">Debt Consolidation Loan </xsl:when>
      <xsl:when test="$curVal='CH'">Charge Card </xsl:when>
      <xsl:when test="$curVal='CL'">Credit Limit Change or Authorisation </xsl:when>
      <xsl:when test="$curVal='CM'">Customer Management </xsl:when>
      <xsl:when test="$curVal='CN'">Card Not Present </xsl:when>
      <xsl:when test="$curVal='CO'">Communications (Catch All)</xsl:when>
      <xsl:when test="$curVal='CR'">Catalogue Request only</xsl:when>
      <xsl:when test="$curVal='CS'">Credit Sale </xsl:when>
      <xsl:when test="$curVal='CT'">Collections Strategy </xsl:when>
      <xsl:when test="$curVal='CU'">Credit Union </xsl:when>
      <xsl:when test="$curVal='DC'">Direct Credits</xsl:when>
      <xsl:when test="$curVal='DD'">Direct Debit </xsl:when>
      <xsl:when test="$curVal='DM'">Direct Mail Order Account</xsl:when>
      <xsl:when test="$curVal='DR'">Debt Recovery</xsl:when>
      <xsl:when test="$curVal='EI'">International Reports</xsl:when>
      <xsl:when test="$curVal='EM'">Employment Check </xsl:when>
      <xsl:when test="$curVal='EQ'">Enquiry, not an application – general bucket type – non product specific </xsl:when>
      <xsl:when test="$curVal='FB'">Fraud Investigation – Benefit Fraud </xsl:when>
      <xsl:when test="$curVal='FG'">Fraud Investigation - Generic</xsl:when>
      <xsl:when test="$curVal='FI'">Fraud Investigation </xsl:when>
      <xsl:when test="$curVal='FP'">Fraud Investigation - Prescription</xsl:when>
      <xsl:when test="$curVal='FT'">Fraud Investigation – Tax or Duty</xsl:when>
      <xsl:when test="$curVal='GA'">Guarantor</xsl:when>
      <xsl:when test="$curVal='GB'">Government Sector Authenticate or Enquiry</xsl:when>
      <xsl:when test="$curVal='GF'">Generic Search by Financial Services provider for Authentication purposes</xsl:when>
      <xsl:when test="$curVal='HC'">Home Credit Provider </xsl:when>
      <xsl:when test="$curVal='HP'">Hire Purchase / Conditional Sale </xsl:when>
      <xsl:when test="$curVal='IA'">Identification: Age Authentication</xsl:when>
      <xsl:when test="$curVal='IC'">Insurance Collection </xsl:when>
      <xsl:when test="$curVal='IF'">Identification: Generic Financial</xsl:when>
      <xsl:when test="$curVal='IG'">Identification: Generic Check</xsl:when>
      <xsl:when test="$curVal='IM'">Identification: Prevention of Money Laundering</xsl:when>
      <xsl:when test="$curVal='IN'">Insurance Provider</xsl:when>
      <xsl:when test="$curVal='IP'">Internet/Media Services Provider </xsl:when>
      <xsl:when test="$curVal='IT'">Identification: Transaction (Card Not Present)</xsl:when>
      <xsl:when test="$curVal='MB'">Mortgage Buy to Let </xsl:when>
      <xsl:when test="$curVal='MG'">First Mortgage</xsl:when>
      <xsl:when test="$curVal='MH'">Mortgage High LTV</xsl:when>
      <xsl:when test="$curVal='ML'">Money Laundering Batch</xsl:when>
      <xsl:when test="$curVal='MU'">Mortgage and Unsecured Loan </xsl:when>
      <xsl:when test="$curVal='MX'">Mortgage Multiple Product</xsl:when>
      <xsl:when test="$curVal='OA'">Overdraft Account</xsl:when>
      <xsl:when test="$curVal='PI'">Premium Instalment</xsl:when>
      <xsl:when test="$curVal='PL'">Personal Loan</xsl:when>
      <xsl:when test="$curVal='QC'">Credit Card Quotation</xsl:when>
      <xsl:when test="$curVal='QI'">Insurance Quotation </xsl:when>
      <xsl:when test="$curVal='QL'">Personal Loan Quotation </xsl:when>
      <xsl:when test="$curVal='QM'">Mortgage Quotation</xsl:when>
      <xsl:when test="$curVal='QP'">Quotation Provider of Communications or Media Services</xsl:when>
      <xsl:when test="$curVal='QS'">Store Card Quotation </xsl:when>
      <xsl:when test="$curVal='QT'">Telco Quotation </xsl:when>
      <xsl:when test="$curVal='QU'">Utility Quotation</xsl:when>
      <xsl:when test="$curVal='QX'">Multiple Product Quotation</xsl:when>
      <xsl:when test="$curVal='RA'">Rental Agreement </xsl:when>
      <xsl:when test="$curVal='RC'">Revolving Credit </xsl:when>
      <xsl:when test="$curVal='RE'">Reprocess</xsl:when>
      <xsl:when test="$curVal='RS'">Debt Recovery – Sundry Debt </xsl:when>
      <xsl:when test="$curVal='RT'">Debt Recovery – Tax or Duty Debt </xsl:when>
      <xsl:when test="$curVal='SC'">Store Card</xsl:when>
      <xsl:when test="$curVal='SL'">Secured Loan </xsl:when>
      <xsl:when test="$curVal='ST'">Student Loan </xsl:when>
      <xsl:when test="$curVal='TB'">Debt Tracing – Benefit Debt </xsl:when>
      <xsl:when test="$curVal='TC'">Tenant / Home Rental </xsl:when>
      <xsl:when test="$curVal='TF'">Fixed Line Agreement </xsl:when>
      <xsl:when test="$curVal='TM'">Mobile Phone </xsl:when>
      <xsl:when test="$curVal='TS'">Debt Tracing – Sundry Debt</xsl:when>
      <xsl:when test="$curVal='TT'">Debt Tracing – Tax or Duty Debt </xsl:when>
      <xsl:when test="$curVal='UA'">Financial Partner Enquiry</xsl:when>
      <xsl:when test="$curVal='UC'">Consumer Credit Report</xsl:when>
      <xsl:when test="$curVal='UE'">Unregistered Enquiry </xsl:when>
      <xsl:when test="$curVal='US'">Undisclosed Address Search</xsl:when>
      <xsl:when test="$curVal='UT'">Utilities</xsl:when>
      <xsl:when test="$curVal='VG'">Residency Verification – Generic </xsl:when>
      <xsl:when test="$curVal='VH'">Housing Verification </xsl:when>
      <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="$curVal" /></xsl:when>
  </xsl:choose>
</xsl:template>


<xsl:template name="xsl_previous_searches">
 <div class="section" id="previous_application">
   <h2>previous Applications</h2>
   <xsl:for-each select="ConsumerOutput/FullConsumerData/ConsumerData/PreviousApplication">
       <div class="dataLabel">application type</div>
       <div class="dataValue">
        <xsl:call-template name="applicationType"> <xsl:with-param name="curVal" select="PrevApplnDetails/ApplicationType" /> </xsl:call-template>
           
       </div>


       <div class="dataLabel">application date</div>
       <div class="dataValue">
           <xsl:value-of select="PrevApplnDetails/ApplicationDate/DD"/>&#160;
           <span class="toMonthName"><xsl:value-of select="PrevApplnDetails/ApplicationDate/MM"/></span>&#160;
           <xsl:value-of select="PrevApplnDetails/ApplicationDate/CCYY"/>&#160;
       </div>


       <div class="dataLabel">company type</div>
       <div class="dataValue">
          <xsl:call-template name="companyTypeValues"> <xsl:with-param name="curValue" select="PrevApplnDetails/CompanyType" /> </xsl:call-template>

      </div>
      <br style="clear:both"/>

  </xsl:for-each>


</div>
</xsl:template>
</xsl:stylesheet>
