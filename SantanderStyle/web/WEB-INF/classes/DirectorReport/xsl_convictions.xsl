<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_convictions">
        <div class="section" id="convictions">
            <h2>convictions</h2>
            
            <ul>
                <li>
                    <label>Company Name</label>
                    <div class="dataValue">
                       <xsl:value-of select="Convictions/ConvictionDetails/CompanyName"/>
                   </div>
               </li>

               <li>
                <label>Registered Number</label>
                <div class="dataValue">
                   <xsl:value-of select="Convictions/ConvictionDetails/RegNumber"/>
               </div>
           </li>

           <li>
            <label>Date</label>
            <div class="dataValue">
                <xsl:call-template name="oneRowDate">
                    <xsl:with-param name="curValue" select="Convictions/ConvictionDetails/Date">
                    </xsl:with-param>
                </xsl:call-template>
            </div>
        </li>

        <li>
            <label>Reason</label>
            <div class="dataValue">

               <xsl:value-of select="Convictions/ConvictionDetails/Reason"/>
           </div>

       </li>

       <li>
        <label>Costs</label>
        <div class="dataValue num">
           <xsl:value-of select="Convictions/ConvictionDetails/Costs"/>
       </div>

   </li>

   <li>
    <label>Fine</label>
    <div class="dataValue num">
       <xsl:value-of select="Convictions/ConvictionDetails/Fine"/>
   </div>

</li>


</ul>

</div>
</xsl:template>
</xsl:stylesheet>