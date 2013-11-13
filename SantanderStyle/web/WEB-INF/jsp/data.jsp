<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
      <meta http-equiv="X-UA-Compatible" content="IE=8"/>
      
      <link href='./rsc/css/ui-lightness/jquery-ui-1.8.20.custom.css' rel='stylesheet' type='text/css'/>
      <link href='./rsc/css/styles_jsp.css' rel='stylesheet' type='text/css'/>
      
      <% List<BureauData> listData = (List<BureauData>)request.getAttribute("data"); %>
      
      <script src="./rsc/js/jquery-1.7.2.min.js"></script>
      <script src="./rsc/js/jquery-ui-1.8.20.custom.min.js"></script>      
      <script type="text/javascript">
         if (jQuery){
            
            function iframeLoaded(fr, num)
            {
               if(fr.contentWindow && fr.contentWindow.document && fr.contentWindow.document.title && fr.contentWindow.document.title !== "")
                  $('#tab' + num).text(fr.contentWindow.document.title);
            }
          
            function adjustHeight(){
               $('.whole').height(0).height(Number($(document).height()));
            }
            
            $(window).resize(function(){
               adjustHeight();
            });
            
            $(document).ready(function () {
            
               adjustHeight();
            
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
         }
      </script>
   </head>
    <body>
        <div class='whole'>
            <ul class="tabnav">
               <% for(int i = 0;i < listData.size();++i) { %>
               <li>
                   <a id="tab<%=i%>" href="div#contentpage<%=i%>">
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
                    <div id="contentpage<%=i%>" class="contentpage">
                        <div class="datelabel">Report Date: <%=listData.get(i).getDate()%></div>
                        <iframe onload="javascript:iframeLoaded(this, <%=i%>);" class="framedata" name="framedata<%=i%>">&nbsp;</iframe>
                    </div>
                <% } %>
            </div>
        </div>
    </body>
</html>
