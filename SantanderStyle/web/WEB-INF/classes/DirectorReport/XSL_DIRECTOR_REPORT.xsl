<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" encoding="utf-8" indent="yes" doctype-system="http://www.w3.org/TR/html4/strict.dtd"/>

   <xsl:include href="xsl_director_details.xsl"/>
   
   <xsl:template match="/RawBureauData/DirectorData">
      <html>
			<head>
            <meta http-equiv="X-UA-Compatible" content="IE=8" />
            <meta name="author" content="GDS Modellica" />
            <meta name="robots" content="noindex, nofollow" />
				<title>
               <xsl:value-of select="../ConsumerOutput/Applicant/FormattedName"/>
            </title>
				<link rel="stylesheet" type="text/css" href="./rsc/css/styles_production.css"/>
            <script src="./rsc/js/jquery-1.10.2.min.js"></script>
				<script src="./rsc/js/mainJS.js"></script>
			</head>
			<body>
            
            <div id="sectionNavigator" style="">
					<div>
                  <span>Go to:</span>
                  <select id="selectSectionNavigator"
                     onchange="document.location.href='#'+this.options[this.selectedIndex].value"
                     style="text-transform:capitalize"></select>
               </div>
					<div style="padding-top:5px;text-align:right" id="currentXSLSourceVersion"></div>
				</div>
            
            <div>
               <p>Director data is going to be loaded here</p>
            </div>
            
			</body>
		</html>
   </xsl:template>

</xsl:stylesheet>
