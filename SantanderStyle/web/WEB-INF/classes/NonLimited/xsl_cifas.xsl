<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template name="xsl_cifas">
        <xsl:variable name="additionalClass">
           <xsl:choose>
            <xsl:when test="count(NonLimitedCompanyCIFAS/CIFASDetails) &lt; 1"></xsl:when>
            <xsl:when test="count(NonLimitedCompanyCIFAS/CIFASDetails) &gt;= 1"> highlightedSection</xsl:when>
        </xsl:choose>
    </xsl:variable>

    <div class="section{$additionalClass}" id="cifas">
        <h2>cifas details</h2>
        <h4>Number of CIFAS records : <xsl:value-of select="NonLimitedCompanyCIFAS/CIFASSummary/NumCIFASRecords"/></h4>
        <br/>
        <xsl:for-each select="NonLimitedCompanyCIFAS/CIFASDetails">

            <div class="dataLabel">Reference</div>
            <div class="dataValue">
                <xsl:value-of select="Reference"/>
            </div>


            <div class="dataLabel" style="clear:both">fraud category</div>
            <div class="dataValue">
                <xsl:call-template name="fraudCategories">
                    <xsl:with-param name="pValue" select="FraudCategory"/>
                </xsl:call-template>
            </div>

            <div class="dataLabel">Supplier Name</div>
            <div class="dataValue">
                <xsl:value-of select="SupplierName"/>
            </div>

            <div class="dataLabel alwaysVisible">Date Supplied</div>
            <div class="dataValue">
                <xsl:value-of select="DateSuppliedDd"/>&#xA0;<span class="toMonthName"><xsl:value-of select="DateSuppliedMm"/></span>&#xA0;<xsl:value-of select="DateSuppliedYyyy"/>

            </div>

            <div class="dataLabel alwaysVisible">Expiry Date</div>
            <div class="dataValue">
                <xsl:value-of select="ExpiryDateDd"/>&#xA0;<span class="toMonthName"><xsl:value-of select="ExpiryDateMm"/></span>&#xA0;<xsl:value-of select="ExpiryDateYyyy"/>
            </div>

            <div class="dataLabel" style="clear:both">other address flag</div>
            <div class="dataValue">
                <xsl:choose>
                    <xsl:when test="OtherAddressFlag='Y'">
                        Fraud has occurred at other addresses
                    </xsl:when>
                    <xsl:when test="OtherAddressFlag='N'">
                        No
                    </xsl:when>
                    <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="OtherAddressFlag" /></xsl:when>
                </xsl:choose>
            </div>

            <div class="dataLabel">Name</div>
            <div class="dataValue">
                <xsl:value-of select="Name"/>
            </div>

            <div class="dataLabel" style="clear:both">Address Of Subject</div>
            <div class="dataValue removeUselessCommas" style="overflow:auto">
                
                <xsl:value-of select="Address1"/>,&#xA0;<xsl:value-of select="Address2"/>,&#xA0;<xsl:value-of select="Address3"/>,&#xA0;<xsl:value-of select="Address4"/>,&#xA0;<xsl:value-of select="Address5"/>,&#xA0;<xsl:value-of select="Postcode"/>
            </div>

                
               


                
                <br style="clear:both"/>
                <br style="clear:both"/>

            </xsl:for-each>
    </div>
</xsl:template>
</xsl:stylesheet>
