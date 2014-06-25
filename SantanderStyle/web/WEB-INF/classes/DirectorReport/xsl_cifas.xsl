<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  
    <xsl:template name="xsl_cifas"><xsl:variable name="additionalClass">
         <xsl:choose>
            <xsl:when test="count(DetailDirectorCIFAS) &lt; 1"></xsl:when>
            <xsl:when test="count(DetailDirectorCIFAS) &gt;= 1"> highlightedSection</xsl:when>
        </xsl:choose>
        </xsl:variable>
        <div class="section{$additionalClass}" id="cifas">
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
                    <xsl:with-param name="curValue" select="Address/*">
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
                    <xsl:with-param name="pValue" select="FraudCategory"/>
                </xsl:call-template>
        </div>
        </li>

        <li>
        <label>Date Supplied</label>
        <div class="dataValue">
            <xsl:value-of select="Supplier/DateSuppliedDd"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Supplier/DateSuppliedMm"/></span>&#xA0;<xsl:value-of select="Supplier/DateSuppliedYyyy"/>
        </div>
        </li>

        <li>
        <label>CIFAS Member</label>
        <div class="dataValue">
            <xsl:value-of select="Supplier/SupplierName"/>
        </div>
        </li>

        <li>
        <label>Expiry Date</label>
        <div class="dataValue">
            <xsl:call-template name="oneRowDate">
                    <xsl:with-param name="curValue" select="Supplier/ExpiryDate">
                    </xsl:with-param>
                    </xsl:call-template>
        </div>

        <!--<div class="dataValue">
            <xsl:value-of select="Supplier/ExpiryDateDd"/>&#xA0;<span class="toMonthName"><xsl:value-of select="Supplier/ExpiryDateMm"/></span>&#xA0;<xsl:value-of select="Supplier/ExpiryDateYyyy"/>
        </div>-->
        </li>
</ul>
</xsl:for-each>


</div>
</xsl:template>
</xsl:stylesheet>