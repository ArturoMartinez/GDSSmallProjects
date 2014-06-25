<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
   
    <xsl:template name="xsl_cifas"><xsl:variable name="additionalClass">
         <xsl:choose>
            <xsl:when test="count(ConsumerOutput/FullConsumerData/ConsumerData/CIFAS) &lt; 1"></xsl:when>
            <xsl:when test="count(ConsumerOutput/FullConsumerData/ConsumerData/CIFAS) &gt;= 1"> highlightedSection</xsl:when>
        </xsl:choose>
        </xsl:variable>
        <div class="section{$additionalClass}" id="cifas">
            <h2>cifas</h2>
            
            
        <xsl:for-each select="ConsumerOutput/FullConsumerData/ConsumerData/CIFAS">
            <h4>CIFAS Details</h4>

            <ul>
                <li>
                    <label>Type of Address</label>
                    <div class="dataValue">
                       <xsl:choose>
                           <xsl:when test="LocationIndicator = 'C'">
                               Current
                           </xsl:when>
                           <xsl:when test="LocationIndicator = 'P'">
                               Previous
                           </xsl:when>
                           <xsl:when test="LocationIndicator = '3'">
                               Pre-Previous
                           </xsl:when>

                            <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="LocationIndicator" /></xsl:when>
                       </xsl:choose>
                   </div>
               </li>
               <xsl:for-each select="CIFASDetails">


                 <li>
                    <label>Address</label>
                    <div class="dataValue">
                     <xsl:call-template name="commaSeparatedValue">
                        <xsl:with-param name="curValue" select="Location/*">
                        </xsl:with-param>
                    </xsl:call-template>
                    </div>
                </li>

                <li>
                    <label>Name Used</label>
                    <div class="dataValue">
                     <xsl:call-template name="commaSeparatedValue">
                        <xsl:with-param name="curValue" select="Name/*">
                        </xsl:with-param>
                    </xsl:call-template>
                    </div>
                </li>

               <!-- required to be removed on 03/03/2014
               <li>
                    <label>Address Used</label>
                    <div class="dataValue">
                     <xsl:call-template name="commaSeparatedValue">
                        <xsl:with-param name="curValue" select="Location/*">
                        </xsl:with-param>
                    </xsl:call-template>
                    </div>
                </li>-->
                <li>
                    <label>Date of Birth</label>
                    <div class="dataValue">
                    <xsl:value-of select="DateOfBirth/DD"/>/<xsl:value-of select="DateOfBirth/MM"/>/<xsl:value-of select="DateOfBirth/CCYY"/>

                    </div>
                </li>
                <li>
                    <label>Fraud Type</label>
                    <div class="dataValue">
                     <xsl:call-template name="fraudCategories">
                    <xsl:with-param name="pValue" select="FraudCategory"/>
                </xsl:call-template>
                   
                    </div>
                </li>

                <li>
                    <label>CIFAS Reference</label>
                    <div class="dataValue">
                     <xsl:value-of select="CIFASReference" />
                    </div>
                </li>

                <li>
                    <label>Information Date</label>
                    <div class="dataValue">
                     <xsl:value-of select="SupplyDate/DD"/>/<xsl:value-of select="SupplyDate/MM"/>/<xsl:value-of select="SupplyDate/CCYY"/>
                    </div>
                </li>

                <li>
                    <label>More Info From</label>
                    <div class="dataValue">
                     <xsl:value-of select="SupplyCompanyName" />
                    </div>
                </li>

                <li>
                    <label>Product Code</label>
                    <div class="dataValue">
                     <xsl:value-of select="Product" />
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
            <!--<xsl:value-of select="DateSupplied-Dd"/>&#xA0;<span class="toMonthName"><xsl:value-of select="DateSupplied-Mm"/></span>&#xA0;<xsl:value-of select="DateSupplied-Yyyy"/>-->
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
        </li>

        </xsl:for-each>
</ul>
</xsl:for-each>


</div>
</xsl:template>
</xsl:stylesheet>