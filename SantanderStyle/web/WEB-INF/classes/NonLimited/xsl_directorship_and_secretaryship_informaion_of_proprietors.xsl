<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_directorship_and_secretaryship_informaion_of_proprietors">
        <div class="section" id="directorship_and_secretaryship_information_of_proprietors">


            <h2>directorship and secretaryship information of proprietors</h2>
            <h3>director details</h3>
            
            <div class="dataLabel">name</div>
            <div class="dataValue">
                <xsl:value-of select="DirectorData/DirectorDetails/Name"/>
            </div>
            
            <div class="dataLabel">date of birth</div>
            <div class="dataValue">
                <xsl:value-of select="DirectorData/DirectorDetails/DateOfBirth/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="DirectorData/DirectorDetails/DateOfBirth/MM"/></span>&#160;<xsl:value-of select="DirectorData/DirectorDetails/DateOfBirth/CCYY"/>
            </div>
            
            <div class="dataLabel">latest filed address</div>
            <div class="dataValue">
                 <xsl:call-template name="commaSeparatedValue"><xsl:with-param name="curValue" select="DirectorData/DirectorDetails/Location/*"/><xsl:with-param name="separator" select="' '"/><xsl:with-param name="ignoredNode" select="'RMC'"/></xsl:call-template>
                
            </div>
            
            <h3>current directorships</h3>
            <xsl:for-each select="DirectorData/Directorships/CurrentDirector">
                <div class="dataLabel">company name</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/Name"/>
                </div>
                <div class="dataLabel">registered number</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/RegNumber"/>
                </div>
                <div class="dataLabel">date appointed</div>
                <div class="dataValue">
                    <xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
                </div>
            </xsl:for-each>
            

            <h3>current secretaryships</h3>
            <xsl:for-each select="DirectorData/Secretaryships/CurrentSecretary">
                <div class="dataLabel">company name</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/Name"/>
                </div>
                <div class="dataLabel">registered number</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/RegNumber"/>
                </div>
                <div class="dataLabel">date appointed</div>
                <div class="dataValue">
                    <xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
                </div>
            </xsl:for-each>
            <h3>previous directorships</h3>
            <xsl:for-each select="DirectorData/Directorships/PreviousDirector">
                <div class="dataLabel">company name</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/Name"/>
                </div>
                <div class="dataLabel">registered number</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/RegNumber"/>
                </div>
                <div class="dataLabel">date appointed</div>
                <div class="dataValue">
                    <xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
                </div>
                <div class="dataLabel">date resigned</div>
                <div class="dataValue">
                    <xsl:value-of select="ResignationDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="ResignationDate/MM"/></span>&#160;<xsl:value-of select="ResignationDate/CCYY"/>
                </div>
            </xsl:for-each>
            <h3>previous secretaryships</h3>
            <xsl:for-each select="DirectorData/Secretaryships/PreviousSecretary">
                <div class="dataLabel">company name</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/Name"/>
                </div>
                <div class="dataLabel">registered number</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/RegNumber"/>
                </div>
                <div class="dataLabel">date appointed</div>
                <div class="dataValue">
                    <xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
                </div>
                <div class="dataLabel">date resigned</div>
                <div class="dataValue">
                    <xsl:value-of select="ResignationDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="ResignationDate/MM"/></span>&#160;<xsl:value-of select="ResignationDate/CCYY"/>
                </div>
            </xsl:for-each>
            <h3>dissolved current directorships</h3>
            <xsl:for-each select="DirectorData/Directorships/CurrentDissolvedDirector">
                <div class="dataLabel">company name</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/Name"/>
                </div>
                <div class="dataLabel">registered number</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/RegNumber"/>
                </div>
                <div class="dataLabel">date appointed</div>
                <div class="dataValue"><xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
            </div>
            <div class="dataLabel">dissolution date</div>
            <div class="dataValue">
                <xsl:value-of select="DissolutionDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="DissolutionDate/MM"/></span>&#160;<xsl:value-of select="DissolutionDate/CCYY"/>
            </div>
        </xsl:for-each>
        <h3>dissolved current secretaryships</h3>
        <xsl:for-each select="DirectorData/Secretaryships/CurrentDissolvedSecretary">
            <div class="dataLabel">company name</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/Name"/>
            </div>
            <div class="dataLabel">registered number</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/RegNumber"/>
            </div>
            <div class="dataLabel">date appointed</div>
            <div class="dataValue">
                <xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
            </div>
            <div class="dataLabel">dissolution date</div>
            <div class="dataValue">
                <xsl:value-of select="DissolutionDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="DissolutionDate/MM"/></span>&#160;<xsl:value-of select="DissolutionDate/CCYY"/>
            </div>
        </xsl:for-each>
        <h3>dissolved previous directorships</h3>
        <xsl:for-each select="DirectorData/Directorships/PreviousDissolvedDirector">
            <div class="dataLabel">company name</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/Name"/>
            </div>
            <div class="dataLabel">registered number</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/RegNumber"/>
            </div>
            <div class="dataLabel">date appointed</div>
            <div class="dataValue">
                <xsl:value-of select="AppointmentDate"/>
            </div>
            <div class="dataLabel">dissolution date</div>
            <div class="dataValue">
                <xsl:value-of select="DissolutionDate"/>
            </div>
        </xsl:for-each>
        <h3>dissolved previous secretaryships</h3>
        <xsl:for-each select="DirectorData/Secretaryships/PreviousDissolvedSecretary">
            <div class="dataLabel">company name</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/Name"/>
            </div>
            <div class="dataLabel">registered number</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/RegNumber"/>
            </div>
            <div class="dataLabel">date appointed</div>
            <div class="dataValue">
                <xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
            </div>
            <div class="dataLabel">dissolution date</div>
            <div class="dataValue">
                <xsl:value-of select="DissolutionDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="DissolutionDate/MM"/></span>&#160;<xsl:value-of select="DissolutionDate/CCYY"/>
            </div>
        </xsl:for-each>

        <h3>dissolved current directorships</h3>
        <xsl:for-each select="DirectorData/Directorships/CurrentDissolvedDirector">
            <div class="dataLabel">company name</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/Name"/>
            </div>
            <div class="dataLabel">registered number</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/RegNumber"/>
            </div>
            <div class="dataLabel">date appointed</div>
            <div class="dataValue">
                <xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
            </div>
            <div class="dataLabel">dissolution date</div>
            <div class="dataValue">
                <xsl:value-of select="DissolutionDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="DissolutionDate/MM"/></span>&#160;<xsl:value-of select="DissolutionDate/CCYY"/>
            </div>
        </xsl:for-each>
        <h3>convictions</h3>
        <xsl:for-each select="DirectorData/Convictions">
            <div class="dataLabel">company name</div>
            <div class="dataValue">
                <xsl:value-of select="ConvictionDetails/CompanyName"/>
            </div>
            <div class="dataLabel">registered number</div>
            <div class="dataValue">
                <xsl:value-of select="ConvictionDetails/RegNumber"/>
            </div>
            <div class="dataLabel">date</div>
            <div class="dataValue">
                <xsl:value-of select="ConvictionDetails/Date"/>
                <xsl:value-of select="ConvictionDetails/Date/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="ConvictionDetails/Date/MM"/></span>&#160;<xsl:value-of select="ConvictionDetails/Date/CCYY"/>
            </div>
            <div class="dataLabel">Reason</div>
            <div class="dataValue">
                <xsl:value-of select="ConvictionDetails/Reason"/>
            </div>
            <div class="dataLabel">costs</div>
            <div class="dataValue">
                <xsl:value-of select="ConvictionDetails/Costs"/>
            </div>
        </xsl:for-each>

        
    </div>
</xsl:template>

</xsl:stylesheet>
