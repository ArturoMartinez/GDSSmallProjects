<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
  <xsl:template name="xsl_convictions">
    <div class="section" id="convictions">
      <h2>convictions</h2>
      <ul>
        <li>
          <label>Number of convictions</label>
          <div class="dataValue">
               <xsl:value-of select="Convictions/NumConvictions"/>
            
         </div>
       </li>
     </ul>
     <xsl:for-each select="Convictions/ConvictionDetails">


      <ul>
        <li>
          <label>Company Name</label>
          <div class="dataValue">
           <xsl:value-of select="CompanyName"/>
         </div>
       </li>

       <li>
        <label>Registered Number</label>
        <div class="dataValue">
         <xsl:value-of select="RegNumber"/>
       </div>
     </li>

     <li>
      <label>Date</label>
      <div class="dataValue">
        <xsl:call-template name="oneRowDate">
          <xsl:with-param name="curValue" select="Date">
          </xsl:with-param>
        </xsl:call-template>
      </div>
    </li>

    <li>
      <label>Reason</label>
      <div class="dataValue">
        <xsl:choose>
          <xsl:when test="Reason = 'A'">
            Accounts
          </xsl:when>
          <xsl:when test="Reason = 'R'">
            Returns
          </xsl:when>
          <xsl:when test="Reason = 'B'">
            Both
          </xsl:when>
          <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="Reason" /></xsl:when>
        </xsl:choose>

      </div>

    </li>

    <li>
      <label>Costs</label>
      <div class="dataValue num">
       <xsl:value-of select="Costs"/>
     </div>

   </li>

   <li>
    <label>Fine</label>
    <div class="dataValue num">
     <xsl:value-of select="Fine"/>
   </div>

 </li>


</ul>
</xsl:for-each>
</div>
</xsl:template>
</xsl:stylesheet>