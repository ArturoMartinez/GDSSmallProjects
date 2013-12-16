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
            <h2>cifas</h2>
            
            <ul>
                <li>
                    <label>Number of CIFAS Records</label>
                    <div class="dataValue">
                       <xsl:value-of select="SummaryDirectorCIFAS/NumCifasRecs"/>
                   </div>
               </li>
               <li>
                <label>Notice of correction flag</label>
                <div class="dataValue">
                    <xsl:value-of select="SummaryDirectorCIFAS/NocFlag"/>
                </div>
            </li>
        </ul>

        <xsl:for-each select="DetailDirectorCIFAS">
            <h4>CIFAS Details</h4>
            <ul>
                <li>
                    <label>Name of Subject</label>
                    <div class="dataValue">
                       <xsl:value-of select="Name"/>
                   </div>
               </li>
               <li>
                <label>Address Of Subject</label>
                <div class="dataValue">
                   <xsl:call-template name="commaSeparatedValue">
                    <xsl:with-param name="curValue" select="Supplier/*">
                    </xsl:with-param>
                </xsl:call-template>
            </div>
        </li>

        <li>
            <label>Reference</label>
            <div class="dataValue">
               <xsl:value-of select="Reference"/>
           </div>
       </li>

        <li>
        <label>CIFAS Category</label>
        <div class="dataValue">
            <xsl:value-of select="FraudCategory"/>
        </div>
        </li>

        <li>
        <label>Category description</label>
        <div class="dataValue">
            <xsl:call-template name="fraudCategories">
                
            </xsl:call-template>
        </div>
        </li>

        <li>
        <label>Date Supplied</label>
        <div class="dataValue">
            <xsl:value-of select="DateSupplied-Dd"/>&#xA0;<span class="toMonthName"><xsl:value-of select="DateSupplied-Mm"/></span>&#xA0;<xsl:value-of select="DateSupplied-Yyyy"/>
        </div>
        </li>

        <li>
        <label>CIFAS Member</label>
        <div class="dataValue">
            <xsl:value-of select="SupplierName"/>
        </div>
        </li>

        <li>
        <label>Expiry Date</label>
        <div class="dataValue">
            <xsl:call-template name="oneRowDate">
                    <xsl:with-param name="curValue" select="SupplierName/ExpiryDate">
                    </xsl:with-param>
                    </xsl:call-template>
        </div>
        </li>
</ul>
</xsl:for-each>


</div>
</xsl:template>
</xsl:stylesheet>