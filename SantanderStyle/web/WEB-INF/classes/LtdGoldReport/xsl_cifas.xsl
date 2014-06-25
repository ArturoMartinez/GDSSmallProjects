<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

<xsl:template name="fraudCategories">
        <xsl:choose>
            <xsl:when test="FraudCategory=0">Protective Registration</xsl:when>
            <xsl:when test="FraudCategory=1">False Identify Fraud</xsl:when>
 <xsl:when test="FraudCategory=2">Victim of Impersonation</xsl:when>
 <xsl:when test="FraudCategory=3">Application Fraud (Facility Granted)</xsl:when>
 <xsl:when test="FraudCategory=4">Application Fraud (Facility Refused)</xsl:when>
 <xsl:when test="FraudCategory=5">Conversion</xsl:when>
 <xsl:when test="FraudCategory=6">First Party Fraud</xsl:when>
 <xsl:when test="FraudCategory=7">Aiding &amp; Abetting</xsl:when>
 <xsl:when test="FraudCategory=8">Insurance Claims Fraud</xsl:when>
            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="FraudCategory" /></xsl:when>
        </xsl:choose>
    </xsl:template>




    <xsl:template name="xsl_cifas">
        <xsl:variable name="additionalClass">
        <xsl:choose>
            <xsl:when test="count(LimitedCompanyCIFAS/LimitedCompanyCIFASDetails) &lt; 1"></xsl:when>
            <xsl:when test="count(LimitedCompanyCIFAS/LimitedCompanyCIFASDetails) &gt;= 1"> highlightedSection</xsl:when>
        </xsl:choose>
        </xsl:variable>
        <div class="section{$additionalClass}" id="cifas">
            <h2>cifas details</h2>
            <h4>Number of CIFAS records : <xsl:value-of select="LimitedCompanyCIFAS/LimitedCompanyCIFASSummary/NumCIFASRecords"/></h4>
            <br/>
            <xsl:for-each select="LimitedCompanyCIFAS/LimitedCompanyCIFASDetails">
                
                <div style="float:left;position:absolute;margin-left:5px">&#8226;</div><div class="dataLabel"> Name of Subject </div>
                <div class="dataValue">
                    <xsl:value-of select="Name"/>
                </div>
                <div class="dataLabel" style="clear:both">Address Of Subject</div>
                <div class="dataValue" style="overflow:auto">
                   <xsl:if test="Address1!=''"><xsl:value-of select="Address1"/>&#xA0;</xsl:if>
                   <xsl:if test="Address2!=''"><xsl:value-of select="Address2"/>&#xA0;</xsl:if>
                   <xsl:if test="Address3!=''"><xsl:value-of select="Address3"/>&#xA0;</xsl:if>
                   <xsl:if test="Address4!=''"><xsl:value-of select="Address4"/>&#xA0;</xsl:if>
                    <xsl:if test="Postcode!=''"><xsl:value-of select="Postcode"/></xsl:if>
                </div>
                <div class="dataLabel" style="clear:both">Reference</div>
                <div class="dataValue">
                    <xsl:value-of select="Reference"/>
                </div>
                <div class="dataLabel" style="clear:both">CIFAS Category</div>
                <div class="dataValue">
                    <xsl:value-of select="FraudCategory"/>
                </div>
                <div class="dataLabel" style="clear:both">Category Description</div>
                <div class="dataValue">
                    <xsl:call-template name="fraudCategories"/>
                </div>
                <br style="clear:both"/>

                <div class="dataLabel alwaysVisible">Date Supplied  </div>
                <div class="dataValue">
                    <xsl:value-of select="Date/DateSuppliedDd"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Date/DateSuppliedMm"/></span>&#xA0;<xsl:value-of select="Date/DateSuppliedYyyy"/>
          
                </div>
                <div class="dataLabel" style="clear:both">CIFAS Member </div>
                <div class="dataValue">
                    <xsl:value-of select="SupplierName"/>
                </div>
                <br style="clear:both"/>

                <div class="dataLabel alwaysVisible">Expiry Date</div>
                <div class="dataValue">
                    <xsl:value-of select="Date/ExpiryDateDd"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Date/ExpirydateMm"/></span>&#xA0;<xsl:value-of select="Date/ExpiryDateYyyy"/>
          </div>
                <br style="clear:both"/>
                <br style="clear:both"/>

            </xsl:for-each>
            
        </div>
    </xsl:template>
</xsl:stylesheet>
