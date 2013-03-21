<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_mortages_charges_satisfactions">
        <div class="section" id="mortages_charges_and_satisfactions">
            <h2>mortages, charges and satisfactions</h2>
            
            <xsl:for-each select="Mortgages/MortgageDetail">
                
                <div class="dataLabel">charge type</div>
                <div class="dataValue">
                    <xsl:value-of select="ChargeType"/>
                </div>
                
                <br style="clear:both"/>
            <div class="dataLabel">date charge registred</div>
                <div class="dataValue"> 
                    <xsl:value-of select="RegistrationDate/CCYY"/> / 
                    <xsl:value-of select="RegistrationDate/MM"/> /
                    <xsl:value-of select="RegistrationDate/DD"/>
                </div>
            <br style="clear:both"/>
           
            <div class="dataLabel">latest form type</div>
                <div class="dataValue">
                    <xsl:value-of select="FormType"/>
                </div>
                
                <br style="clear:both"/>
            <div class="dataLabel">lender</div>
                <div class="dataValue"> 
                    <xsl:value-of select="LenderDetails/LenderName"/>
                </div>
                
                <br style="clear:both"/>
            <div class="dataLabel">secured on</div>
                <div class="dataValue" style="width:600px;font-size:10px"> 
                    <xsl:value-of select="AmountSecured"/>
                </div>
                
                <br style="clear:both"/>
            <div class="dataLabel">details</div>
                <div class="dataValue" style="width:600px;font-size:10px"> 
                    <xsl:value-of select="PropertyDetails"/>
                </div>
                
                <br style="clear:both"/>
                
                <div style="width:100%;border-bottom:1px solid #EEE;margin:5px 0px 10px 0px"></div>
            
            </xsl:for-each>
            
        </div>
    </xsl:template>
</xsl:stylesheet>
