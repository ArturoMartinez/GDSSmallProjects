<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template name="xsl_management_information">
        <div class="section" id="management_information">


            <h2>management information</h2>

            <h3>current directors</h3>
            <xsl:for-each select="ManagementInfo/Directors/CurrentDirector">
                <div class="dataLabel">name</div>
                <div class="dataValue">
                    <xsl:value-of select="DirectorDetails/Name"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel">address</div>
                <div class="dataValue" style="width:400px;font-size:10px">
                    <xsl:value-of select="DirectorDetails/Location/HouseName"/>&#xA0; <xsl:value-of
                        select="DirectorDetails/Location/Street"/>&#xA0; <xsl:value-of
                        select="DirectorDetails/Location/PostTown"/>&#xA0; <xsl:value-of
                        select="DirectorDetails/Location/County"/>&#xA0; <xsl:value-of
                        select="DirectorDetails/Location/Postcode"/>&#xA0; <xsl:value-of
                        select="DirectorDetails/Location/RMC"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel">date of birth</div>
                <div class="dataValue">
                    <xsl:value-of select="DirectorDetails/DateOfBirth/CCYY"/> / <xsl:value-of
                        select="DirectorDetails/DateOfBirth/MM"/> / <xsl:value-of
                        select="DirectorDetails/DateOfBirth/DD"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel">position</div>
                <div class="dataValue">
                    <xsl:value-of select="DirectorDetails/Position"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel">nationality</div>
                <div class="dataValue">
                    <xsl:value-of select="DirectorDetails/Nationality"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel">occupation</div>
                <div class="dataValue">
                    <xsl:value-of select="DirectorDetails/Occupation"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel">date appointed</div>
                <div class="dataValue">
                    <xsl:value-of select="AppointmentDate/CCYY"/> / <xsl:value-of
                        select="AppointmentDate/MM"/> / <xsl:value-of select="AppointmentDate/DD"/>
                </div>
                <br style="clear:both"/>
             
                <div style="width:100%;border-bottom:1px solid #EEE;margin:5px 0px 10px 0px"></div>
                
            </xsl:for-each>
            <h3>previous directors</h3>
            <xsl:for-each select="ManagementInfo/Directors/PreviousDirector">
                <div class="dataLabel">name</div>
                <div class="dataValue">
                    <xsl:value-of select="DirectorDetails/Name"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel">adddress</div>
                <div class="dataValue" style="width:400px;font-size:10px">
                    <xsl:value-of select="DirectorDetails/Location/HouseName"/>&#xA0; <xsl:value-of
                        select="DirectorDetails/Location/Street"/>&#xA0; <xsl:value-of
                        select="DirectorDetails/Location/PostTown"/>&#xA0; <xsl:value-of
                        select="DirectorDetails/Location/County"/>&#xA0; <xsl:value-of
                        select="DirectorDetails/Location/Postcode"/>&#xA0; <xsl:value-of
                        select="DirectorDetails/Location/RMC"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel">date of birth</div>
                <div class="dataValue">
                    <xsl:value-of select="DirectorDetails/DateOfBirth/CCYY"/> / <xsl:value-of
                        select="DirectorDetails/DateOfBirth/MM"/> / <xsl:value-of
                        select="DirectorDetails/DateOfBirth/DD"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel">position</div>
                <div class="dataValue">
                    <xsl:value-of select="DirectorDetails/Position"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel">date appointed</div>
                <div class="dataValue">
                    <xsl:value-of select="AppointmentDate/CCYY"/> / <xsl:value-of
                        select="AppointmentDate/MM"/> / <xsl:value-of select="AppointmentDate/DD"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel">date resigned</div>
                <div class="dataValue"><xsl:value-of select="ResignationDate/CCYY"/> / <xsl:value-of
                    select="ResignationDate/MM"/> / <xsl:value-of select="ResignationDate/DD"/></div>
                <br style="clear:both"/>
                <div class="dataLabel">resigned prior to</div>
                <div class="dataValue" id="notFound">???</div>
                <br style="clear:both"/>
                <div style="width:100%;border-bottom:1px solid #EEE;margin:5px 0px 10px 0px"></div>
                
            </xsl:for-each>
            <br style="clear:both"/>
            <h3>company secretary</h3>
            <xsl:for-each select="ManagementInfo/Secretaries/CurrentSecretary">
                <div class="dataLabel">name</div>
                <div class="dataValue">
                    <xsl:value-of select="SecretaryDetails/Name"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel">address</div>
                <div class="dataValue" style="width:400px;font-size:10px">
                    <xsl:value-of select="SecretaryDetails/Location/HouseName"/>&#xA0; <xsl:value-of
                        select="SecretaryDetails/Location/Street"/>&#xA0; <xsl:value-of
                            select="SecretaryDetails/Location/PostTown"/>&#xA0; <xsl:value-of
                                select="SecretaryDetails/Location/County"/>&#xA0; <xsl:value-of
                                    select="SecretaryDetails/Location/Postcode"/>&#xA0; <xsl:value-of
                                        select="SecretaryDetails/Location/RMC"/>
                </div><br style="clear:both"/>
                <div class="dataLabel">date appointed</div>
                <div class="dataValue">
                    <xsl:value-of select="AppointmentDate/CCYY"/> / <xsl:value-of
                        select="AppointmentDate/MM"/> / <xsl:value-of select="AppointmentDate/DD"/>
                </div>
                <br style="clear:both"/>
                <br style="clear:both"/>
            </xsl:for-each>
            <h3>previous company secretaries</h3>
            <xsl:for-each select="ManagementInfo/Secretaries/PreviousSecretary">
                <div class="dataLabel">name</div>
                <div class="dataValue">
                    <xsl:value-of select="SecretaryDetails/Name"/>
                </div>
                <br style="clear:both"/>
                <div class="dataLabel">address</div>
                <div class="dataValue" style="width:400px;font-size:10px">
                    <xsl:value-of select="SecretaryDetails/Location/HouseName"/>&#xA0; <xsl:value-of
                        select="SecretaryDetails/Location/Street"/>&#xA0; <xsl:value-of
                            select="SecretaryDetails/Location/PostTown"/>&#xA0; <xsl:value-of
                                select="SecretaryDetails/Location/County"/>&#xA0; <xsl:value-of
                                    select="SecretaryDetails/Location/Postcode"/>&#xA0; <xsl:value-of
                                        select="SecretaryDetails/Location/RMC"/>
                </div><br style="clear:both"/>
                <div class="dataLabel">date appointed</div>
                <div class="dataValue">
                    <xsl:value-of select="AppointmentDate/CCYY"/> / <xsl:value-of
                        select="AppointmentDate/MM"/> / <xsl:value-of select="AppointmentDate/DD"/>
                </div><br style="clear:both"/>
                <div class="dataLabel">date resigned</div>
                <div class="dataValue"><xsl:value-of select="ResignationDate/CCYY"/> / <xsl:value-of
                    select="ResignationDate/MM"/> / <xsl:value-of select="ResignationDate/DD"/></div>
                <br style="clear:both"/>
                <div style="width:100%;border-bottom:1px solid #EEE;margin:5px 0px 10px 0px"></div>
                
            </xsl:for-each>

        </div>
    </xsl:template>

</xsl:stylesheet>
