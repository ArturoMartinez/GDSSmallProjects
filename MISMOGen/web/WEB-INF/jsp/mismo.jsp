<%--
    Document   : mismo
    Created on : Mar 9, 2012, 3:16:14 PM
    Author     : simon
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List,com.gdslink.mismogen.Mismo"%>
<html>
    <head>
	<script src="./jquery/js/jquery-1.7.2.min.js"></script>
	<script src="./jquery/js/jquery-ui-1.8.20.custom.min.js"></script>
	<script src="./jquery.base64.min.js"></script>
	<link href='./jquery/css/ui-lightness/jquery-ui-1.8.20.custom.css' rel='stylesheet' type='text/css'></link>
	<link href='./styles.css' rel='stylesheet' type='text/css'></link>
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

	<% List<Mismo> listMismos = (List<Mismo>)request.getAttribute("mismobodies"); %>
	<%=listMismos.get(0).getHeader()%>

    </head>
    <body>
	<div class='whole'>
	 <ul class="tabnav">
		<% for(Mismo mismo : listMismos) { %>
			<li><a href="#<%=mismo.getId()%>1"><%=mismo.getTitle()%></a></li>
		<% } %>
	 </ul>

	 <% for(Mismo mismo : listMismos) { %>
		<div id="<%=mismo.getId()%>1" class="tabdiv"><%=mismo.getBody()%></div>
	 <% } %>
	</div>
    </body>
</html>
