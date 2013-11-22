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

            <xsl:for-each select="LimitedCompanyCIFAS/LimitedCompanyCIFASDetails">
                
                <div class="dataLabel">Name of Subject </div>
                <div class="dataValue">
                    <xsl:value-of select="Name"/>
                </div>
                <div class="dataLabel" style="clear:both">Address Of Subject</div>
                <div class="dataValue">
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
                    <xsl:value-of select="Date/DateSupplied-Dd"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Date/DateSupplied-Mm"/></span>&#xA0;<xsl:value-of select="Date/DateSupplied-Yyyy"/>
          
                </div>
                <div class="dataLabel" style="clear:both">CIFAS Member </div>
                <div class="dataValue">
                    <xsl:value-of select="SupplierName"/>
                </div>
                <br style="clear:both"/>

                <div class="dataLabel alwaysVisible">Expiry Date</div>
                <div class="dataValue">
                    <xsl:value-of select="Date/ExpiryDate-Dd"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Date/ExpiryDate-Mm"/></span>&#xA0;<xsl:value-of select="Date/ExpiryDate-Yyyy"/>
          </div>
                <br style="clear:both"/>
                <br style="clear:both"/>

            </xsl:for-each>
            
        </div>
    </xsl:template>
</xsl:stylesheet>
