<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

<xsl:template name="fraudCategories">
        <xsl:choose>
            <xsl:when test="FraudCategory='01'">Providing a false name and a true address.</xsl:when>
 <xsl:when test="FraudCategory='02'">Providing or using the name and particulars of another person.</xsl:when>
 <xsl:when test="FraudCategory='03'">Providing or using a genuine name and address, but one or more material falsehoods in personal details followed by a serious misuse of the credit or other facility and/or non-payment.</xsl:when>
 <xsl:when test="FraudCategory='04'">Providing or using a genuine name and address, but one or more material falsehoods in personal details.</xsl:when>
 <xsl:when test="FraudCategory='05'">Disposal/selling on of goods obtained on credit and failing to settle the finance agreement.</xsl:when>
 <xsl:when test="FraudCategory='06'">Opening an account for the purpose of fraud.</xsl:when>
        </xsl:choose>
    </xsl:template>





    <xsl:template name="xsl_cifas">
        <div class="section" id="cifas">
            <h2>cifas details</h2>
            <xsl:for-each select="NonLimitedCompanyCIFAS/CIFASDetails">
                
                <div class="dataLabel">Reference</div>
                <div class="dataValue">
                    <xsl:value-of select="Reference"/>
                </div>


                <div class="dataLabel" style="clear:both">fraud category</div>
                <div class="dataValue">
                    <xsl:call-template name="fraudCategories"/>
                </div>

                <div class="dataLabel">Supplier Name</div>
                <div class="dataValue">
                    <xsl:value-of select="SupplierName"/>
                </div>

                <div class="dataLabel alwaysVisible">Date Supplied</div>
                <div class="dataValue">
                    <xsl:value-of select="DateSupplied-Dd"/>&#xA0;<span class="toMonthName"><xsl:value-of select="DateSupplied-Mm"/></span>&#xA0;<xsl:value-of select="DateSupplied-Yyyy"/>
          
                </div>

                <div class="dataLabel alwaysVisible">Expiry Date</div>
                <div class="dataValue">
                    <xsl:value-of select="ExpiryDate-Dd"/>&#xA0;<span class="toMonthName"><xsl:value-of select="ExpiryDate-Mm"/></span>&#xA0;<xsl:value-of select="ExpiryDate-Yyyy"/>
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
                    </xsl:choose>
                </div>

                <div class="dataLabel">Name</div>
                <div class="dataValue">
                    <xsl:value-of select="Name"/>
                </div>

                <div class="dataLabel" style="clear:both">Address Of Subject</div>
                <div class="dataValue" style="overflow:auto">
                    <xsl:value-of select="Address1"/>
                    <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="Address2"/></xsl:call-template>
                    <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="Address3"/></xsl:call-template>
                    <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="Address4"/></xsl:call-template>
                    <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="Address5"/></xsl:call-template>
                    <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="Postcode"/></xsl:call-template>

                </div>

                <div class="dataLabel">#</div>
                <div class="dataValue">
                        (<xsl:value-of select="NumCIFASRecords"/> of <xsl:value-of select="count(NonLimitedCompanyCIFAS/CIFASDetails)"/>)
                   
                </div>
                
               


                
                <br style="clear:both"/>
                <br style="clear:both"/>

            </xsl:for-each>
            
        </div>
    </xsl:template>
</xsl:stylesheet>
