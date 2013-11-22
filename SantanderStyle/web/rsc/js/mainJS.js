document._version='1.8.3';
document._ressourcesPath='./rsc/images/';

function intToMonthName(pMonthNum){
   arrayMonthName=new Array("","January","February","March","April","May","June","July","August","September","October","November","December");
   return arrayMonthName[pMonthNum];
}

if (jQuery){
   $(document).ready(function () {
        document.getElementById("currentXSLSourceVersion").innerHTML="v"+document._version;
      document.devise = "&pound;";
      document.debugmode = false;

      //var prmstr = window.location.search.substr(1);
      var prmstr = parent.window.location.href.replace("?", "&");
      var prmarr = prmstr.split ("&");
      var params = {};

      for ( var i = 0; i < prmarr.length; i++) {
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

      $("table").hideEmptyTable();

      $(".doubt").hideValue();
      $("#notFound").hideValue();


      $("#notfound").hideValue();
      $("#notfound,#notFound").hideValue();

      $(".stringDateToReadable").dateStringToReadableDate();
      var sectionsOptionsArray = $(".section");
      var sectionsOptionsArrayStringKeys = new Array();
      for (s = 0; s < sectionsOptionsArray.length; s++) {
        sectionsOptionsArrayStringKeys.push(sectionsOptionsArray[s].id);
      }
      sectionsOptionsArrayStringKeys.sort();
      for (s = 0; s < sectionsOptionsArrayStringKeys.length; s++) {
         var id = sectionsOptionsArrayStringKeys[s];
         var text = id.replace(/_/g, " ");

         var newOption=document.createElement('OPTION');
         curSelect=document.getElementById('selectSectionNavigator');
         curSelect.add(newOption);

         newOption.value=id;
         newOption.innerHTML=text;
      }


      var sectionsH2Array = $(".section h2");
      for (s = 0; s < sectionsH2Array.length; s++) {
         var collapseImg = document.createElement('img');
         collapseImg.collapsedStatus = false;

        collapseImg.src = document._ressourcesPath+"collapse.png";
         collapseImg.style.margin="1px 15px 0px 0px";
         collapseImg.style.float="right";
         collapseImg.style.cssFloat="right";
         collapseImg.style.border = "none";
         collapseImg.style.cursor = "pointer";
         collapseImg.onclick = function () {
            if (! this.collapsedStatus) {
               this.originalDivParentHeight = this.parentNode.parentNode.clientHeight;
                this.src = document._ressourcesPath+"expand.png";
               this.parentNode.parentNode.style.height = "20px";
               this.parentNode.parentNode.style.overflow = "hidden";
               this.collapsedStatus = true;
            } else {
                this.src = document._ressourcesPath+"collapse.png"
               this.parentNode.parentNode.style.height = this.originalDivParentHeight-10 + "px";
               this.collapsedStatus = false;
            }
         };

         sectionsH2Array[s].appendChild(collapseImg);
      }

   });

   $.fn.hideEmptyTable=function(){
      return this.each(function () {
         rows = $("tr",this).length;
         if ((rows <= 1) && (document.debugmode === false))
            $(this).css("display","none");
      });
   };

   $.fn.hideEmptyValue = function () {
       return this.each(function () {
           correspondingValue = $(this).next(".dataValue");
           if ($.trim(correspondingValue.text()) === ''){
               if (document.debugmode === true){
                   $(this).css("background","#aac397");
                   $(correspondingValue).css("background","#aac397");
               }else{
                  if(!$(this).hasClass("alwaysVisible")){
                     $(this).css("display","none");
                     $(correspondingValue).css("display","none");
                  }
               }
           }
        });
    };

   $.fn.hideValue = function () {
       return this.each(function () {
           var correspondingLabel = $(this).prev(".dataLabel");

           if (document.debugmode === true){
               var bgColor="#ffbbbb";
               var clName=$(this)[0].className;
               if(clName.indexOf("doubt")>-1)bgColor="#ffEEEE";

               $(this).css("background",bgColor);
               $(correspondingLabel).css("background",bgColor);
           }else{
               $(this).css("display","none");
               $(correspondingLabel).css("display","none");
           }

       });
   };

   $.fn.dateStringToReadableDate=function(){
      return this.each(function () {
         var stringDate = $(this).text();
         var stringYear = stringDate.substr(0,4);

         var stringMonth = stringDate.substr(4,2);

         var stringDay = stringDate.substr(6,2);
         var readableMonth=intToMonthName(parseFloat(stringMonth));
         $(this).text(stringDay+" "+readableMonth+" "+stringYear);
    });
   };
   
   $.fn.stringTime = function () {
        return this.each(function () {

            var stringTime=$(this).text();
            var stringMinute=stringTime.substr(2,2);
            var stringHour=stringTime.substr(0,2);
            $(this).text(stringHour+':'+stringMinute);
        });
    };

   $.fn.digits = function () {
       return this.each(function () {
            if ($(this).text() === '0')
               $(this).text('0');
            else
               $(this).text($(this).text().replace(/^0+/, '').replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,"));
        });
    };

   $.fn.deviseSign = function () {
       return this.each(function () {
            if ($.trim($(this).html()) !== "")
               $(this).html(document.devise+$(this).text());
        });
    };

   $.fn.toMonthName = function () {
       return this.each(function () {
            if($.trim($(this).html())!==""){
                var curText=$(this).html();
                curText=$.trim(curText);
                var curInt=parseFloat(curText);
                $(this).html(intToMonthName(curInt));
            }
        });
    };

}