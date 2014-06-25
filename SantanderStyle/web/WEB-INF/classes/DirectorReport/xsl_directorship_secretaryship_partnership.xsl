<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="appointedTemplateTitle">
       <xsl:choose>
                <xsl:when test="AppointmentIndicator = 'P'">
                    Appointed Prior To
                </xsl:when>
               <xsl:when test="AppointmentIndicator = 'E'">
                    Date Appointed
                 </xsl:when>
                 <xsl:when test="/RawBureauData/IsPATHSViewReport = 1"><xsl:value-of select="AppointmentIndicator" /></xsl:when>
                </xsl:choose>
    </xsl:template>

    <xsl:template name="latestEventTemplate">
        <xsl:param name="isDissolution" select="0">
            
        </xsl:param>
        <xsl:if test="LatestEventCode!=''">
                        <div style="float:left;margin-left:60px">
                            <b> Latest Event
                                <xsl:if test="$isDissolution=1">
                                    &#xA0;Prior to Dissolution
                                </xsl:if>
                            </b>
                            <br/>
                             <xsl:choose>
                            <xsl:when test="LatestEventCode = '05'">Compulsory Liquidation</xsl:when>
                            <xsl:when test="LatestEventCode = '10'">Creditors Voluntary Liquidation</xsl:when>
                            <xsl:when test="LatestEventCode = '15'">Members Voluntary Liquidation</xsl:when>
                            <xsl:when test="LatestEventCode = '20'">Liquidation of Unknown Type</xsl:when>
                            <xsl:when test="LatestEventCode = '25'">Winding up Order</xsl:when>
                            <xsl:when test="LatestEventCode = '30'">Administrator Appointed</xsl:when>
                            <xsl:when test="LatestEventCode = '35'">Administration Order Discharged</xsl:when>
                            <xsl:when test="LatestEventCode = '40'">Administrative Receiver Appointed</xsl:when>
                            <xsl:when test="LatestEventCode = '45'">Receiver Appointment</xsl:when>
                            <xsl:when test="LatestEventCode = '50'">Administrative Receiver Cessation</xsl:when>
                            <xsl:when test="LatestEventCode = '55'">Receiver Cessation</xsl:when>
                            <xsl:when test="LatestEventCode = '60'">Voluntary Arrangement Approved</xsl:when>
                            <xsl:when test="LatestEventCode = '65'">Voluntary Arrangement Completed</xsl:when>
                            <xsl:when test="LatestEventCode = '70'">Voluntary Arrangement Revoked</xsl:when>
                            <xsl:when test="LatestEventCode = '75'">Voluntary Arrangement Suspended</xsl:when>
                            <xsl:when test="LatestEventCode = '80'">Company Reinstated</xsl:when>
                             </xsl:choose>
                             <br/>
                             (<xsl:call-template name="oneRowDate">
                                <xsl:with-param name="curValue" select="LatestEvent">
                                </xsl:with-param>
                            </xsl:call-template>)
                         </div>



                        </xsl:if>
    </xsl:template>

    <xsl:template name="xsl_directorship_secretaryship_partnership">
        <div class="section" id="directorship_secretaryship_partnership">
            <h2>directorship secretaryship partnership</h2>
            <h3>Current Directorships</h3>
            
            <xsl:for-each select="Directorships/CurrentDirector">
            <ul>
                <li>
                    <label>Company Name</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/Name"/>  
                    </div>
                </li>

                <li>
                    <label>Registered number</label>
                    <div class="dataValue" style="position:relative">
                        <div style="float:left">
                          <xsl:value-of select="CommercialDetail/RegNumber"/>
                        </div>
                        <xsl:call-template name="latestEventTemplate">
                            
                        </xsl:call-template>
                    </div>
                </li>

                <li>
                    <label> <xsl:call-template name="appointedTemplateTitle"></xsl:call-template></label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="AppointmentDate">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>
                
            </ul>
            </xsl:for-each>          
           

            <h3>Current Secretaryships</h3>
           
                <xsl:for-each select="Secretaryships/CurrentSecretary">
                   <ul>  
                <li>
                    <label>Company Name</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/Name"/>  
                    </div>
                </li>

                <li>
                    <label>Registered number</label>
                    <div class="dataValue" style="position:relative">
                        <div style="float:left">
                          <xsl:value-of select="CommercialDetail/RegNumber"/>
                        </div>
                        <xsl:call-template name="latestEventTemplate">
                            
                        </xsl:call-template>
                    </div>
                </li>

                <li>
                    <label><xsl:call-template name="appointedTemplateTitle"></xsl:call-template></label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="AppointmentDate">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>
            </ul>
                </xsl:for-each>
           

            <h3>Previous Directorships</h3>
           
                <xsl:for-each select="Directorships/PreviousDirector">
                 <ul>
                <li>
                    <label>Company Name</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/Name"/>  
                    </div>
                </li>

               <li>
                    <label>Registered number</label>
                    <div class="dataValue" style="position:relative">
                        <div style="float:left">
                          <xsl:value-of select="CommercialDetail/RegNumber"/>
                        </div>
                        <xsl:call-template name="latestEventTemplate">
                            
                        </xsl:call-template>
                    </div>
                </li>

                <li>
                    <label><xsl:call-template name="appointedTemplateTitle"></xsl:call-template></label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="AppointmentDate">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>
                <li>
                    <label>Date Resigned</label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="ResignationDate">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>         
            </ul>
                </xsl:for-each>          
          

            <h3>Previous Secretaryships</h3>
           
                <xsl:for-each select="Secretaryships/PreviousSecretary">
 <ul>
                <li>
                    <label>Company Name</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/Name"/>  
                    </div>
                </li>

                <li>
                    <label>Registered number</label>
                    <div class="dataValue" style="position:relative">
                        <div style="float:left">
                          <xsl:value-of select="CommercialDetail/RegNumber"/>
                        </div>
                        <xsl:call-template name="latestEventTemplate">
                            
                        </xsl:call-template>
                    </div>
                </li>

                <li>
                    <label><xsl:call-template name="appointedTemplateTitle"></xsl:call-template></label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="AppointmentDate">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>
                <li>
                    <label>Date Resigned</label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="ResignationDate">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>          
            </ul>
                </xsl:for-each>

            <h3>Dissolved Current Directorships</h3>
                <xsl:for-each select="Directorships/CurrentDissolvedDirector">

            <ul>
                <li>
                    <label>Company Name</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/Name"/>  
                    </div>
                </li>

                <li>
                    <label>Registered number</label>
                    <div class="dataValue" style="position:relative">
                        <div style="float:left">
                          <xsl:value-of select="CommercialDetail/RegNumber"/>
                        </div>
                        <xsl:call-template name="latestEventTemplate">
                            <xsl:with-param name="isDissolution" select="1">
                                
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>

                <li>
                    <label><xsl:call-template name="appointedTemplateTitle"></xsl:call-template></label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="AppointmentDate">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li> 

                <li>
                    <label>Dissolution Date</label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="DissolutionDate">
                            </xsl:with-param> 
                        </xsl:call-template>
                    </div>
                </li>       
            </ul>
                </xsl:for-each>

            <h3>Dissolved Current Secretaryships</h3>
            
                <xsl:for-each select="Secretaryships/CurrentDissolvedSecretary">
                  <ul>  
                <li>
                    <label>Company Name</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/Name"/>  
                    </div>
                </li>

                <li>
                    <label>Registered number</label>
                    <div class="dataValue" style="position:relative">
                        <div style="float:left">
                          <xsl:value-of select="CommercialDetail/RegNumber"/>
                        </div>
                        <xsl:call-template name="latestEventTemplate">
                            <xsl:with-param name="isDissolution" select="1">
                                
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>

                <li>
                    <label><xsl:call-template name="appointedTemplateTitle"></xsl:call-template></label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="AppointmentDate">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>

                <li>
                    <label>Dissolution Date</label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="DissolutionDate">
                            </xsl:with-param> 
                        </xsl:call-template>
                    </div>
                </li>  

            </ul>
                </xsl:for-each>

            <h3>Dissolved Previous Directorships</h3>
            
                <xsl:for-each select="Directorships/PreviousDissolvedDirector">
<ul>
                <li>
                    <label>Company Name</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/Name"/>  
                    </div>
                </li>

                <li>
                    <label>Registered number</label>
                    <div class="dataValue" style="position:relative">
                        <div style="float:left">
                          <xsl:value-of select="CommercialDetail/RegNumber"/>
                        </div>
                        <xsl:call-template name="latestEventTemplate">
                            <xsl:with-param name="isDissolution" select="1">
                                
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>

                <li>
                    <label><xsl:call-template name="appointedTemplateTitle"></xsl:call-template></label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="AppointmentDate">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>
                <li>
                    <label>Date Resigned</label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="ResignationDate">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>
                <li>
                    <label>Dissolution Date</label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="DissolutionDate">
                            </xsl:with-param> 
                        </xsl:call-template>
                    </div>
                </li>


            </ul>
                </xsl:for-each>

            <h3>Dissolved Previous Secretaryships</h3>
                <xsl:for-each select="Secretaryships/PreviousDissolvedSecretary">
                    
            <ul>
                <li>
                    <label>Company Name</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/Name"/>  
                    </div>
                </li>

                <li>
                    <label>Registered number</label>
                    <div class="dataValue" style="position:relative">
                        <div style="float:left">
                          <xsl:value-of select="CommercialDetail/RegNumber"/>
                        </div>
                        <xsl:call-template name="latestEventTemplate">
                            <xsl:with-param name="isDissolution" select="1">
                                
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>

                <li>
                    <label><xsl:call-template name="appointedTemplateTitle"></xsl:call-template></label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="AppointmentDate">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li>
                <li>
                    <label>Date Resigned</label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="ResignationDate">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li> 

                <li>
                    <label>Dissolution Date</label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="DissolutionDate">
                            </xsl:with-param> 
                        </xsl:call-template>
                    </div>
                </li>        
            </ul>
                </xsl:for-each> 
        </div>
    </xsl:template>
</xsl:stylesheet>