if ($){
   
   function hasChange(prev, curr){
      return ((prev !== null)&&((prev.width !== curr.width)&&(prev.height !== curr.height)));
   }
   
   function setMaxHeight(target, parent, sibblings){
      var acum = 0;
      if (sibblings.length !== 0){
         var i = 0;
         for (i = 0; i < sibblings.length; i++)
            acum += Number(sibblings[i].outerHeight(true));
      }//fi
      
      target.outerHeight(0).outerHeight(Number(parent.height()-acum));
   }
   
   function adjustHeight(){
      
      var currDim = {
         width: $(window).width(),
         height: $(window).height()
      };
      
      if ((typeof(document.prevDim) === 'undefined')||(document.prevDim === null)||(hasChange(document.prevDim, currDim))){
      
         var whole = $(document).find('.whole');
         if (whole){
            whole.height(0).height(currDim.height);

            var tabNav = whole.find('.tabnav');
            var content = whole.find('#content');               
            if (tabNav && content){
               content.height(0).height(Number(whole.height()-tabNav.outerHeight(true)));
               content.find('.contentpage').each(function(){
                  var iframe = $(this).find('iframe');
                  var regDate = $(this).find('.datelabel:eq(0)');
                  iframe.height(0).outerHeight(Number(content.height()-regDate.outerHeight(true)));
               });
            }//fi:tabNav&&content
         }//fi:whole

         document.prevDim  = currDim;
      }//fi
   }
   
   /**
    * resizeme() attachs function to calculate document max height on resize
    * event for document
    */
   $.fn.resizeme = function(){
      return this.each(function () {
         
         document.prevDim = null;
         var motor = navigator.userAgent.toString();
         
         if (motor.match(/(.+)MSIE(.+)/)){
            //for any version of IE
            document.body.onresize = function(){
               adjustHeight();
            };
         }else{
            //for Chrome, Safari, Opera or Firefox
            $(window).resize(function(){
               adjustHeight();
            });
         }//fi-else
         
         //first adjustment
         adjustHeight();
      });
   };
}