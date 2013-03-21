<%--
    Document   : mismo
    Created on : Mar 9, 2012, 3:16:14 PM
    Author     : simon
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List,com.gdslink.style.BureauData"%>
<html>
    <head>
	<script src="./jquery/js/jquery-1.7.2.min.js"></script>
	<script src="./jquery/js/jquery-ui-1.8.20.custom.min.js"></script>
	<link href='./jquery/css/ui-lightness/jquery-ui-1.8.20.custom.css' rel='stylesheet' type='text/css'></link>
	<link href='./styles.css' rel='stylesheet' type='text/css'></link>

    <% List<BureauData> listData = (List<BureauData>)request.getAttribute("data"); %>

	<script>
	    $(document).ready(function () {
		$('ul.tabnav').each(function(){
		    var $active, $content, $links = $(this).find('a');

		    $active = $links.first().addClass('active');
		    $content = $($active.attr('href'));

		    // Hide the remaining content
		    $links.not(':first').each(function () {
		        $($(this).attr('href')).hide();
		    });

		    $(this).tabs();

            <% for(int i = 0;i < listData.size();++i) { %>
                $('#formdata<%=i%>').submit();
            <% } %>

            // Bind the click event handler
		    $(this).on('click', 'a', function(e){

	         	 // Make the old tab inactive.
	         	 $active.removeClass('active');
	         	 $content.hide();

	         	 // Update the variables with the new link and content
	         	 $active = $(this);
  	         	 $content = $($(this).attr('href'));

  	        	  // Make the tab active.
	         	 $active.addClass('active');
	          	 $content.show();

  	         	 // Prevent the anchor's default click action
  	         	 e.preventDefault();
                   });
             });

		});
	</script>

    </head>
    <body>
        <div class='whole'>
            <ul class="tabnav">
               <% for(int i = 0;i < listData.size();++i) { %>
               <li>
                   <a href="div#contentpage<%=i%>">
                       <%=listData.get(i).getBureau()%>
                   </a>
               </li>
               <% } %>
            </ul>

            <div id='content'>
                <% for(int i = 0;i < listData.size();++i) { %>
                    <form style="display:none;" id="formdata<%=i%>" target="framedata<%=i%>" method="post" action="style.htm">
                        <input type="hidden" name="page" value="<%=listData.get(i).getCompressedBase64Raw()%>"/>
                    </form>
                    <div id="contentpage<%=i%>">
                        <div class="datelabel">Report Date: <%=listData.get(i).getDate()%></div>
                        <iframe style="width:100%;height:90%;" name="framedata<%=i%>">&nbsp;</iframe>
                    </div>
                <% } %>
            </div>
        </div>
    </body>
</html>
