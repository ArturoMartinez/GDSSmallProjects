<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_directorship_and_secretaryship_informaion_of_proprietors">
        <div class="section" id="directorship_and_secretaryship_information_of_proprietors">


            <h2>directorship and secretaryship information of proprietors</h2>
            <h3>director details</h3>
            
            <div class="dataLabel">name</div>
            <div class="dataValue">
                <xsl:value-of select="/NonLtdBusinessData/DirectorData/DirectorDetails/Name"/>
            </div>
            
            <br style="clear:both"/>
            <div class="dataLabel">date of birth</div>
            <div class="dataValue">
                <xsl:value-of select="/NonLtdBusinessData/DirectorData/DirectorDetails/DateOfBirth/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="/NonLtdBusinessData/DirectorData/DirectorDetails/DateOfBirth/MM"/></span>&#160;<xsl:value-of select="/NonLtdBusinessData/DirectorData/DirectorDetails/DateOfBirth/CCYY"/>
            </div>
            
            <br style="clear:both"/>
            <div class="dataLabel">latest filed address</div>
            <div class="dataValue">
                <xsl:value-of select="/NonLtdBusinessData/DirectorData/DirectorDetails/Location"/>
            </div>
            
            <br style="clear:both"/>
            <h3>current directorships</h3>
            <xsl:for-each select="/NonLtdBusinessData/DirectorData/Directorships/CurrentDirector">
                <div class="dataLabel">company name</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/Name"/>
                </div><br style="clear:both"/>
                <div class="dataLabel">registered number</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/RegNumber"/>
                </div><br style="clear:both"/>
                <div class="dataLabel">date appointed</div>
                <div class="dataValue">
                    <xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
                </div><br style="clear:both"/>
                <br style="clear:both"/>
            </xsl:for-each>
            

            <h3>current secretaryships</h3>
            <xsl:for-each select="/NonLtdBusinessData/DirectorData/Secretaryships/CurrentSecretary">
                <div class="dataLabel">company name</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/Name"/>
                </div><br style="clear:both"/>
                <div class="dataLabel">registered number</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/RegNumber"/>
                </div><br style="clear:both"/>
                <div class="dataLabel">date appointed</div>
                <div class="dataValue">
                    <xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
                </div><br style="clear:both"/>
                <br style="clear:both"/>
            </xsl:for-each>
            <h3>previous directorships</h3>
            <xsl:for-each select="/NonLtdBusinessData/DirectorData/Directorships/PreviousDirector">
                <div class="dataLabel">company name</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/Name"/>
                </div><br style="clear:both"/>
                <div class="dataLabel">registered number</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/RegNumber"/>
                </div><br style="clear:both"/>
                <div class="dataLabel">date appointed</div>
                <div class="dataValue">
                    <xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
                </div><br style="clear:both"/>
                <div class="dataLabel">date resigned</div>
                <div class="dataValue">
                    <xsl:value-of select="ResignationDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="ResignationDate/MM"/></span>&#160;<xsl:value-of select="ResignationDate/CCYY"/>
                </div>
                
                <br style="clear:both"/>
                <br style="clear:both"/>
            </xsl:for-each>
            <h3>previous secretaryships</h3>
            <xsl:for-each select="/NonLtdBusinessData/DirectorData/Secretaryships/PreviousSecretary">
                <div class="dataLabel">company name</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/Name"/>
                </div><br style="clear:both"/>
                <div class="dataLabel">registered number</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/RegNumber"/>
                </div><br style="clear:both"/>
                <div class="dataLabel">date appointed</div>
                <div class="dataValue">
                    <xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
                </div><br style="clear:both"/>
                <div class="dataLabel">date resigned</div>
                <div class="dataValue">
                    <xsl:value-of select="ResignationDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="ResignationDate/MM"/></span>&#160;<xsl:value-of select="ResignationDate/CCYY"/>
                </div>
                <br style="clear:both"/>
                <br style="clear:both"/>
                <br style="clear:both"/>
            </xsl:for-each>
            <h3>dissolved current directorships</h3>
            <xsl:for-each select="/NonLtdBusinessData/DirectorData/Directorships/CurrentDissolvedDirector">
                <div class="dataLabel">company name</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/Name"/>
                </div><br style="clear:both"/>
                <div class="dataLabel">registered number</div>
                <div class="dataValue">
                    <xsl:value-of select="CommercialDetail/RegNumber"/>
                </div><br style="clear:both"/>
                <div class="dataLabel">date appointed</div>
                <div class="dataValue"><xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">dissolution date</div>
            <div class="dataValue">
                <xsl:value-of select="DissolutionDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="DissolutionDate/MM"/></span>&#160;<xsl:value-of select="DissolutionDate/CCYY"/>
            </div>

            <br style="clear:both"/>
            <br style="clear:both"/>
        </xsl:for-each>
        <h3>dissolved current secretaryships</h3>
        <xsl:for-each select="/NonLtdBusinessData/DirectorData/Secretaryships/CurrentDissolvedSecretary">
            <div class="dataLabel">company name</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/Name"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">registered number</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/RegNumber"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">date appointed</div>
            <div class="dataValue">
                <xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">dissolution date</div>
            <div class="dataValue">
                <xsl:value-of select="DissolutionDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="DissolutionDate/MM"/></span>&#160;<xsl:value-of select="DissolutionDate/CCYY"/>
            </div>

            <br style="clear:both"/>
            <br style="clear:both"/>
        </xsl:for-each>
        <h3>dissolved previous directorships</h3>
        <xsl:for-each select="/NonLtdBusinessData/DirectorData/Directorships/PreviousDissolvedDirector">
            <div class="dataLabel">company name</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/Name"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">registered number</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/RegNumber"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">date appointed</div>
            <div class="dataValue">
                <xsl:value-of select="AppointmentDate"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">dissolution date</div>
            <div class="dataValue">
                <xsl:value-of select="DissolutionDate"/>
            </div>

            <br style="clear:both"/>
            <br style="clear:both"/>
        </xsl:for-each>
        <h3>dissolved previous secretaryships</h3>
        <xsl:for-each select="/NonLtdBusinessData/DirectorData/Secretaryships/PreviousDissolvedSecretary">
            <div class="dataLabel">company name</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/Name"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">registered number</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/RegNumber"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">date appointed</div>
            <div class="dataValue">
                <xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">dissolution date</div>
            <div class="dataValue">
                <xsl:value-of select="DissolutionDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="DissolutionDate/MM"/></span>&#160;<xsl:value-of select="DissolutionDate/CCYY"/>
            </div>

            <br style="clear:both"/>
            <br style="clear:both"/>
        </xsl:for-each>

        <h3>dissolved current directorships</h3>
        <xsl:for-each select="/NonLtdBusinessData/DirectorData/Directorships/CurrentDissolvedDirector">
            <div class="dataLabel">company name</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/Name"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">registered number</div>
            <div class="dataValue">
                <xsl:value-of select="CommercialDetail/RegNumber"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">date appointed</div>
            <div class="dataValue">
                <xsl:value-of select="AppointmentDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="AppointmentDate/MM"/></span>&#160;<xsl:value-of select="AppointmentDate/CCYY"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">dissolution date</div>
            <div class="dataValue">
                <xsl:value-of select="DissolutionDate/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="DissolutionDate/MM"/></span>&#160;<xsl:value-of select="DissolutionDate/CCYY"/>
            </div>

            <br style="clear:both"/>
            <br style="clear:both"/>
        </xsl:for-each>
        <h3>convictions</h3>
        <xsl:for-each select="/NonLtdBusinessData/DirectorData/Convictions">
            <div class="dataLabel">company name</div>
            <div class="dataValue">
                <xsl:value-of select="ConvictionDetails/CompanyName"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">registered number</div>
            <div class="dataValue">
                <xsl:value-of select="ConvictionDetails/RegNumber"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">date</div>
            <div class="dataValue">
                <xsl:value-of select="ConvictionDetails/Date"/>
                <xsl:value-of select="ConvictionDetails/Date/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="ConvictionDetails/Date/MM"/></span>&#160;<xsl:value-of select="ConvictionDetails/Date/CCYY"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">Reason</div>
            <div class="dataValue">
                <xsl:value-of select="ConvictionDetails/Reason"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">costs</div>
            <div class="dataValue">
                <xsl:value-of select="ConvictionDetails/Costs"/>
            </div>

            <br style="clear:both"/>
            <br style="clear:both"/>
        </xsl:for-each>

        <h3>convictions</h3>
        <xsl:for-each select="/NonLtdBusinessData/DirectorData/Convictions">
            <div class="dataLabel">company name</div>
            <div class="dataValue">
                <xsl:value-of select="ConvictionDetails/CompanyName"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">registered number</div>
            <div class="dataValue">
                <xsl:value-of select="ConvictionDetails/RegNumber"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">date</div>
            <div class="dataValue">
                <xsl:value-of select="ConvictionDetails/Date/DD"/>&#160;<span class="toMonthName" style="margin:0px:padding:0px"><xsl:value-of select="ConvictionDetails/Date/MM"/></span>&#160;<xsl:value-of select="ConvictionDetails/Date/CCYY"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">Reason</div>
            <div class="dataValue">
                <xsl:value-of select="ConvictionDetails/Reason"/>
            </div><br style="clear:both"/>
            <div class="dataLabel">costs</div>
            <div class="dataValue">
                <xsl:value-of select="ConvictionDetails/Costs"/>
            </div>

            <br style="clear:both"/>
            <br style="clear:both"/>
        </xsl:for-each>
    </div>
</xsl:template>

</xsl:stylesheet>
