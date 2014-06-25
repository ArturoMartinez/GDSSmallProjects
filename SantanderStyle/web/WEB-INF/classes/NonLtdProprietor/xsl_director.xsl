<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template name="addressCode" >
        <xsl:choose>
         <xsl:when test="ConsumerOutput/Residency/LocationCode ='01'"> Current</xsl:when>
         <xsl:when test="ConsumerOutput/Residency/LocationCode ='02'"> 1st Previous Location</xsl:when>
         <xsl:when test="ConsumerOutput/Residency/LocationCode ='03'"> 2nd  Previous Location</xsl:when>
         <xsl:when test="ConsumerOutput/Residency/LocationCode ='04'"> 3rd Previous Location </xsl:when>
         <xsl:when test="ConsumerOutput/Residency/LocationCode ='05'"> 4th Previous Location </xsl:when>
         <xsl:when test="ConsumerOutput/Residency/LocationCode ='06'"> 5th Previous Location </xsl:when>
         <xsl:when test="ConsumerOutput/Residency/LocationCode ='07'"> 6th Previous Location </xsl:when>
         <xsl:when test="ConsumerOutput/Residency/LocationCode ='08'"> 7th Previous Location </xsl:when>
         <xsl:when test="ConsumerOutput/Residency/LocationCode ='09'"> 8th Previous Location</xsl:when>
         <xsl:when test="ConsumerOutput/Residency/LocationCode ='C_'"> Correspondence Location</xsl:when>
         <xsl:when test="ConsumerOutput/Residency/LocationCode ='E_'"> Employment Location</xsl:when>
         <xsl:when test="ConsumerOutput/Residency/LocationCode ='D_'"> Delivery Location</xsl:when>
         <xsl:when test="ConsumerOutput/Residency/LocationCode ='O_'"> Other Location / Not Known</xsl:when>

         <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="ConsumerOutput/Residency/LocationCode" /></xsl:when>
     </xsl:choose>
     
 </xsl:template>

 <xsl:template name="xsl_director">
    <div class="section" id="director" style="white-space:nowrap">
        <h2>Director</h2>
        <div class="dataLabel" style="background:#dde;padding:2px;margin-bottom:0px"><xsl:call-template name="addressCode"/></div>
        <div class="dataValue" style="background:#dde;padding:2px;margin-bottom:0px">
            <xsl:if test="ConsumerOutput/Residency/LocationCode ='01'">
                <xsl:variable name="LocId" select="ConsumerOutput/Residency/LocationIdentifier"/>
                <xsl:for-each select="ConsumerOutput/LocationDetails">
                    <xsl:if test="LocationIdentifier = '1' ">
                        <xsl:value-of select="FormattedLocation" />
                    </xsl:if>
                </xsl:for-each>
            </xsl:if>
        </div>
        <br style="clear:both"/>
        <div class="dataLabel" >
           <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="ConsumerOutput/Applicant/Name/*"/><xsl:with-param name="separator" select="' '"/></xsl:call-template>
       </div>
       <div class="dataValue">
        <xsl:value-of select="ConsumerOutput/LocationDetails/FormattedLocation"/>
        
    </div>
    
    

</div>
</xsl:template>
</xsl:stylesheet>
