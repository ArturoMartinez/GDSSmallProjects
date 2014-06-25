<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_payment_analysis">
        <div class="section" id="payment_analysis">
            <h2>payment analysis</h2>
            <h3>Payment Performance Days Beyond Terms By Different Terms</h3>
            <div class="dataLabel" >Less than £100 </div><div class="dataValue" > <xsl:value-of select="PaymentPerformance/PaymentFull/NumberDBT0-100"/> </div><br style="clear:both"/>
            <div class="dataLabel" >£101 to £1,000  0 </div><div class="dataValue" ><xsl:value-of select="PaymentPerformance/PaymentFull/NumberDBT101-1000"/> </div><br style="clear:both"/>
            <div class="dataLabel" > £1,001 to £10,000 </div><div class="dataValue" ><xsl:value-of select="PaymentPerformance/PaymentFull/NumberDBT1001-10000"/> </div><br style="clear:both"/>
            <div class="dataLabel" > More than £10,000</div><div class="dataValue" ><xsl:value-of select="PaymentPerformance/PaymentFull/NumberDBT10kPlus"/> </div><br style="clear:both"/>
            
            <h3>Payment Performance Days Beyond Terms By Different Terms</h3>
            <div class="dataValue" > 
               
               <xsl:for-each select="PaymentPerformance/PaymentFull/CommonTerms">
                    <div class="dataLabel" ><xsl:value-of select="CommonTermsText"/> </div>
                    <div class="dataValue" > <xsl:value-of select="CommonTermsDBT"/> </div><br style="clear:both"/>
               </xsl:for-each>
            </div>
           
        </div>
    </xsl:template>
</xsl:stylesheet>
