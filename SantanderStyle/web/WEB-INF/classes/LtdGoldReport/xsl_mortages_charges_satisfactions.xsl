<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">


    <xsl:template name="partialSatisfactionDetails">
        <xsl:choose>
            <xsl:when test="NaturePartialSatisfaction/PartialSatisfactionDetails='P'">Partial satisfaction</xsl:when>
            <xsl:when test="NaturePartialSatisfaction/PartialSatisfactionDetails='X'">Partial satisfaction</xsl:when>
            <xsl:when test="NaturePartialSatisfaction/PartialSatisfactionDetails='R'">Partial property release</xsl:when>
            <xsl:when test="NaturePartialSatisfaction/PartialSatisfactionDetails='B'">Property ceasing to belong</xsl:when>
        </xsl:choose>
    </xsl:template>

    <xsl:template name="xsl_mortages_charges_satisfactions">
        <div class="section" id="mortages_charges_and_satisfactions">
            <h2>mortgages, charges and satisfactions</h2>
            
            <xsl:for-each select="Mortgages/MortgageDetail">
                
                <div class="dataLabel">Number of Partial Satisfactions</div>
                <div class="dataValue">
                    <xsl:value-of select="NumberPartialSatisfactionDataItems"/>
                </div>
                <div class="dataLabel" style="clear:both">Partial Satisfaction Details</div>
                <div class="dataValue">
                    <xsl:call-template name="partialSatisfactionDetails"></xsl:call-template>
                </div>
                <div class="dataLabel" style="clear:both">date charge registred</div>
                <div class="dataValue">
                    <xsl:value-of select="RegistrationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="RegistrationDate/MM"/></span>&#xA0;<xsl:value-of select="RegistrationDate/CCYY"/>
                </div>
                <div class="dataLabel" style="clear:both">charge type</div>
                <div class="dataValue">
                    <xsl:value-of select="ChargeType"/>
                </div>
            <br style="clear:both"/>
           
            <div class="dataLabel">latest form type</div>
                    
                <div class="dataValue">
                     <xsl:call-template name="mortgageFormTypes"><xsl:with-param name="curValue" select="FormType"/></xsl:call-template>
                   
                </div>
                <div class="dataLabel" style="clear:both">date charge created</div>
                <div class="dataValue">
                    <xsl:value-of select="CreationDate/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="CreationDate/MM"/></span>&#xA0;<xsl:value-of select="CreationDate/CCYY"/>
                </div>
                <div class="dataLabel" style="clear:both">lender</div>
                <div class="dataValue"> 
                    <xsl:value-of select="LenderDetails/LenderName"/>
                </div>
                
                <div class="dataLabel" style="clear:both">date fully satisfied</div>
                <div class="dataValue">
                    <xsl:value-of select="DateFullySatisfied/DD"/>&#xA0;<span class="toMonthName"><xsl:value-of select="DateFullySatisfied/MM"/></span>&#xA0;<xsl:value-of select="DateFullySatisfied/CCYY"/>
                </div>
                <div class="dataLabel" style="clear:both">satisfactions</div>
                <div class="dataValue">
                    <xsl:value-of select="NumberPartialSatisfactionDates"/>&#xA0;
                </div>
                <br style="clear:both"/>
                
            <div class="dataLabel">secured on</div>
                <div class="dataValue" style="width:600px;font-size:10px"> 
                    <xsl:value-of select="AmountSecured"/>
                </div>
                
                <div class="dataLabel" style="clear:both">details</div>
                <div class="dataValue" style="width:600px;font-size:10px"> 
                    <xsl:value-of select="PropertyDetails"/>
                </div>
                
                <br style="clear:both"/>
                
                <div style="width:100%;border-bottom:1px solid #EEE;margin:5px 0px 10px 0px"></div>
            
            </xsl:for-each>
            
        </div>
    </xsl:template>
</xsl:stylesheet>
