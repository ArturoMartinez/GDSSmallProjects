<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
    version="1.0">
    <xsl:template name="xsl_payment_summary">
        <div class="section" id="payment_summary"  >
        <h2>payment profile</h2>
           
           
            <div style="padding-left:15px;font:italic normal normal 13px MS Serif">
                <div id="notFound">This company pays ???
                    <xsl:value-of select="PaymentPerformance/PaymentFull/PaymentToTerms"/>
                </div>
                <div id="notFound">There is ??? payment pattern
                    <xsl:value-of select="PaymentPerformance/PaymentFull/PaymentPattern"/>
                </div>
                <div  class="doubt">This company has <xsl:value-of select="PaymentPerformance/PaymentFull/NumberCollection"/> accounts placed for collection.
                    
                </div>
                <div class="doubt">This company has <xsl:value-of select="PaymentPerformance/PaymentFull/UnpaidAccountsDetails/UnpaidAccounts"/> outstanding unpaid accounts.
                    
                </div>
                <div id="notFound">This company pays 
                    <xsl:value-of select="PaymentPerformance/PaymentFull/PaymentToTerms"/>
                     its terms.</div>
            </div>
    </div>
    </xsl:template>
</xsl:stylesheet>