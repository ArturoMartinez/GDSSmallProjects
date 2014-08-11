document._version='1.8.98';
document._ressourcesPath = './rsc/images/';
document._NoDataMessage = "No Data Registered";
if (typeof(console) === 'undefined') {
   console = {};
   console.log=function(){};
}

if ($) {
   $(document).ready(function() {
      $("#currentXSLSourceVersion").html("v" + document._version);
      document.devise = "&pound;";
      document.debugmode = false;

      //var prmstr = window.location.search.substr(1);
      var prmstr = parent.window.location.href.replace("?", "&");
      var prmarr = prmstr.split("&");
      var params = {};

      for (var i = 0; i < prmarr.length; i++) {
         var tmparr = prmarr[i].split("=");
         params[tmparr[0]] = tmparr[1];
      }

      if (typeof(params.debugmode) !== 'undefined')
         document.debugmode = (Number(params.debugmode) === 1);

      //---
      $("div.stringTime").stringTime();
      $("div.num").digits();
      $("span.num").digits();
      $("td.num span").digits();
      $("td.num div").digits();
      //$("td.num").digits();


      $(".ratingStarDiv").css("backgroundImage","url("+document._ressourcesPath+"ratingStars-mid.png)");

      $("div.devise").deviseSign();
      $("span.devise").deviseSign();
      $("td.devise span").deviseSign();
      $("td.devise div").deviseSign();
      $("td.devise").deviseSign();

      $(".toMonthName").toMonthName();

      $(".dataLabel").hideEmptyValue();
      $("label").hideEmptyValue();

      $("table").hideEmptyTable();

      $(".doubt").hideValue();
      $("#notFound").hideValue();
      $(".removeUselessCommas").removeUselessCommas();

      $("#notfound").hideValue();
      $("#notfound,#notFound").hideValue();
      
      $(".stringDateToReadable").dateStringToReadableDate();
      var sectionsOptionsArray = $(".section");
      var sectionsOptionsArrayStringKeys = new Array();
      for (s = 0; s < sectionsOptionsArray.length; s++) {
         sectionsOptionsArrayStringKeys.push(sectionsOptionsArray[s].id);
      }
      sectionsOptionsArrayStringKeys.push("");
      sectionsOptionsArrayStringKeys.sort();
      for (s = 0; s < sectionsOptionsArrayStringKeys.length; s++) {
         var id = sectionsOptionsArrayStringKeys[s];
         var text = id.replace(/_/g, " ");

         var newOption = document.createElement('OPTION');
         curSelect = document.getElementById('selectSectionNavigator');
         curSelect.add(newOption);

         newOption.value = id;
         newOption.innerHTML = text;
      }


      var sectionsH2Array = $(".section h2");
      for (s = 0; s < sectionsH2Array.length; s++) {
         var collapseImg = document.createElement('img');
         collapseImg.collapsedStatus = false;

         collapseImg.src = document._ressourcesPath + "collapse.png";
         collapseImg.style.margin = "1px 15px 0px 0px";
         collapseImg.style.float = "right";
         collapseImg.style.cssFloat = "right";
         collapseImg.style.border = "none";
         collapseImg.style.cursor = "pointer";
         collapseImg.onclick = function() {
            if (!this.collapsedStatus) {
               this.originalDivParentHeight = this.parentNode.parentNode.clientHeight;
               this.src = document._ressourcesPath + "expand.png";
               this.parentNode.parentNode.style.height = "20px";
               this.parentNode.parentNode.style.overflow = "hidden";
               this.collapsedStatus = true;
            } else {
               this.src = document._ressourcesPath + "collapse.png";
               this.parentNode.parentNode.style.height = this.originalDivParentHeight - 10 + "px";
               this.collapsedStatus = false;
            }
         };

         sectionsH2Array[s].appendChild(collapseImg);
      }

      if (document.debugmode === false) {
         $(".section").checkEmptyDataSection();
         $(".section").checkEmptySubSectionNodes();
      }

      document.publicRecordInfoCCJTableSum = 0;
      $("#publicRecordInfoCCJTable td").each(function(){
          var deviseDecodedChar = $('<div />').html(document.devise).text();
          var innerValue = this.innerText;
          innerValue = innerValue.replace(deviseDecodedChar,'');
          innerValue = $.trim(innerValue);
          document.publicRecordInfoCCJTableSum += parseInt(innerValue);
      });

      if(document.publicRecordInfoCCJTableSum === 0){
        if($("#publicRecordInfoCCJDiv")[0])
            $("#publicRecordInfoCCJDiv")[0].style.display = 'none';
      };
   });//document.ready()


   $.fn.hideEmptyTable = function() {
      return this.each(function() {
         var rows = $("tr", this).length;
         if ((rows <= 1) && (document.debugmode === false)) {
            hideTableAndDisplayNoDataMessage(this);
         }
         var cells = $("td", this);
         var concatValues = "";
         var currentCell = null;
         var hideIfValue = false;
         var cellContent = "";
         var clonedCell = null;
         for (var i = 0; i < cells.length; i++) {
            hideIfValue = false;
            currentCell = cells[i];
            clonedCell = currentCell.cloneNode(true);

            hideIfValue = $(currentCell).hasClass("canHideTableIfValue");
            cellContent = $(clonedCell).text();
            cellContent = $.trim(cellContent.replace(/&nbsp;/g, '').replace(/[\n\r\t]/g, ''));

            if (hideIfValue === false)
               concatValues += $.trim(cellContent);
         }
         
         if ($.trim(concatValues) === '')
            hideTableAndDisplayNoDataMessage(this);
      });
   };

   function hideTableAndDisplayNoDataMessage(pTable) {

      $(pTable).css("display", "none");
      var tableNoDataMessageDiv = messageDiv();
      pTable.parentNode.appendChild(tableNoDataMessageDiv);
   }

   $.fn.checkEmptyDataSection = function() {
      return this.each(function() {

         var dataFields = $(".dataValue", this);

         var cellDatafields = $(".matrix td", this);
         dataFields = $.merge(dataFields, cellDatafields);

         if (areFieldsDisplayingData(dataFields) === false)
            displayNoDataSectionMessage($(this));

      });
   };

   function areFieldsDisplayingData(pFields) {
      var bRet = false;
      var curValue = "";
      for (var i = 0; ((i < pFields.length) && (!bRet)); i++) {

         curValue = concatenedRecursiveVisibleHtml(pFields[i], "");
         curValue = $.trim(curValue);
         curValue = curValue.replace("&nbsp;", "");
         curValue = curValue.replace("&#160;", "");
         bRet = (curValue !== "");
      }
      return bRet;
   }



   $.fn.checkEmptySubSectionNodes = function() {
      return this.each(function() {

         //var firstSubSection = $(this).children().first();
         var startSubNodes = $("h2,h3", this);

         for (var i = 0; i < startSubNodes.length; i++) {

            var subSectionNodes = $(startSubNodes[i]).nextUntil("h3").find('.dataValue,.matrix td');
            if (subSectionNodes.length === 0)
               subSectionNodes = $(startSubNodes[i]).nextAll().find('.dataValue,.matrix td');

            if (!areFieldsDisplayingData(subSectionNodes)) {
               var messDiv = messageDiv();

               if (subSectionNodes[0])
                  subSectionNodes[0].parentNode.insertBefore(messDiv, subSectionNodes[0]);

               for (var p = 0; p < subSectionNodes.length; p++) {
                  subSectionNodes[p].parentNode.removeChild(subSectionNodes[p]);
               }//for
            }//fi
         }//for
      });
   };

   /*function displayNoDataSubSectionMessage() {
   }*/

   function displayNoDataSectionMessage(pSectionElement) {

      var sectionElements = pSectionElement.find("h2");
      var h2Element = sectionElements[0];
      pSectionElement.empty();
      pSectionElement.append(h2Element);

      pSectionElement.append(messageDiv());
   }

   function messageDiv() {
      var messageDiv = document.createElement("div");
      messageDiv.className = "emptyMessageDiv";
      messageDiv.innerHTML = document._NoDataMessage;
      return messageDiv;
   }

   function concatenedRecursiveVisibleHtml(pElement, pValue) {

      var childNodesArray = pElement.childNodes;

      for (var n = 0; n < childNodesArray.length; n++) {
         var curNode = childNodesArray[n];

         if (curNode.childNodes.length === 0) {
            if (curNode.nodeValue !== null)
               pValue += curNode.nodeValue;
         }
         if (curNode.childNodes.length > 0)
         {
            if (!$(curNode).hasClass("notValue"))
               pValue += concatenedRecursiveVisibleHtml(curNode, pValue);
         }
      }
      return pValue;
   }

   $.fn.hideEmptyValue = function() {
      return this.each(function() {
         var correspondingValue = $(this).next(".dataValue");
         if ($.trim(correspondingValue.text()) === '') {
            if (document.debugmode === true) {
               $(this).css("background", "#aac397");
               $(correspondingValue).css("background", "#aac397");
            } else {
               if (!$(this).hasClass("alwaysVisible")) {
                  $(this).css("display", "none");
                  $(correspondingValue).css("display", "none");
                  if ($(this.parentNode).attr("tagName") === 'LI')
                     this.parentNode.style.display = "none";
               }
            }
         }
      });
   };

   $.fn.removeUselessCommas = function() {
      return this.each(function() {
        var data = $(this).html().replace(/[\n\r\t]/g,'').replace(/(,&nbsp;){1,}/g,',&nbsp;').replace(/(,){1,}/g,',');
        $(this).html(data);
      });
   };

   $.fn.hideValue = function() {
      return this.each(function() {
         var correspondingLabel = $(this).prev(".dataLabel");

         if (document.debugmode === true) {
            var bgColor = "#ffbbbb";
            var clName = $(this)[0].className;
            if (clName.indexOf("doubt") > -1)
               bgColor = "#ffEEEE";

            $(this).css("background", bgColor);
            $(correspondingLabel).css("background", bgColor);
         } else {
            $(this).css("display", "none");
            $(correspondingLabel).css("display", "none");
         }

      });
   };

   $.fn.dateStringToReadableDate = function() {
      return this.each(function() {
         var stringDate = $(this).text();
         var stringYear = stringDate.substr(0, 4);

         var stringMonth = stringDate.substr(4, 2);

         var stringDay = stringDate.substr(6, 2);
         var readableMonth = intToMonthName(parseFloat(stringMonth));
         $(this).text(stringDay + " " + readableMonth + " " + stringYear);
      });
   };

   $.fn.stringTime = function() {
      return this.each(function() {

         var stringTime = $(this).text();
         var stringMinute = stringTime.substr(2, 2);
         var stringHour = stringTime.substr(0, 2);
         $(this).text(stringHour + ':' + stringMinute);
      });
   };

   $.fn.digits = function() {
      return this.each(function() {
         if (parseFloat($(this).text()) === 0)
            $(this).text('0');

         if ($(this).text() === '0')
            $(this).text('0');
         else
            $(this).text($(this).text().replace(/^0+/, '').replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,"));
      });
   };

   $.fn.deviseSign = function() {
      return this.each(function() {
         if ($.trim($(this).html()) !== "")
            $(this).html(document.devise + $(this).text());
      });
   };

   $.fn.toMonthName = function() {
      return this.each(function() {
         if ($.trim($(this).html()) !== "") {
            var curText = $(this).html();
            curText = $.trim(curText);
            var curInt = parseFloat(curText);
            $(this).html(intToMonthName(curInt));
         }
      });
   };

   function intToMonthName(pMonthNum) {
      pMonthNum = parseInt(pMonthNum, 10);
      arrayMonthName = new Array("?", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
      return arrayMonthName[pMonthNum];
   }
}