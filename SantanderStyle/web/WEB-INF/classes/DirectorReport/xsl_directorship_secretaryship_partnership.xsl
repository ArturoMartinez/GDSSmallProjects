<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
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
                    <label>Registred number</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/RegNumber"/>  
                    </div>
                </li>

                <li>
                    <label>Date Appointed</label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="AppointmentDate">
                            </xsl:with-param>
                        </xsl:call-template>
                    </div>
                </li> </ul>
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
                    <label>Registred number</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/RegNumber"/>  
                    </div>
                </li>

                <li>
                    <label>Date Appointed</label>
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
                    <label>Registred number</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/RegNumber"/>  
                    </div>
                </li>

                <li>
                    <label>Date Appointed</label>
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
                    <label>Registred number</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/RegNumber"/>  
                    </div>
                </li>

                <li>
                    <label>Date Appointed</label>
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
                    <label>Registred number</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/RegNumber"/>  
                    </div>
                </li>

                <li>
                    <label>Date Appointed</label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="AppointmentDate">
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
                    <label>Registred number</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/RegNumber"/>  
                    </div>
                </li>

                <li>
                    <label>Date Appointed</label>
                    <div class="dataValue">     
                          <xsl:call-template name="oneRowDate">
                            <xsl:with-param name="curValue" select="AppointmentDate">
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
                    <label>Registred number</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/RegNumber"/>  
                    </div>
                </li>

                <li>
                    <label>Date Appointed</label>
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
                    <label>Registred number</label>
                    <div class="dataValue">     
                          <xsl:value-of select="CommercialDetail/RegNumber"/>  
                    </div>
                </li>

                <li>
                    <label>Date Appointed</label>
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
        </div>
    </xsl:template>
</xsl:stylesheet>