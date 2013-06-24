
document.devise="&pound;";
document.debugmode=false;
$(document).ready(function () {
    $("div.num").digits();
    $("span.num").digits();
    $("td.num span").digits();
    $("td.num div").digits();
    //$("td.num").digits();
    

    $("div.devise").deviseSign();
    $("span.devise").deviseSign();
    $("td.devise span").deviseSign();
    $("td.devise div").deviseSign();
    $("td.devise").deviseSign();

    $(".toMonthName").toMonthName();
   
   $(".dataLabel").hideEmptyValue()

   $("table").hideEmptyTable();

   $(".doubt").hideValue();
   $("#notFound").hideValue();
   $("#notfound").hideValue();
   $("#notFound,#notfound").hideValue();

    var sectionsOptionsArray = $(".section");
    for (s = 0; s < sectionsOptionsArray.length; s++) {
        var id = sectionsOptionsArray[s].id;
        var text = id.replace(/_/g, " ");

        var newOption=document.createElement('OPTION')
        curSelect=document.getElementById('selectSectionNavigator');
        curSelect.add(newOption)

        newOption.value=id;
        newOption.innerHTML=text
    }


    var sectionsH2Array = $(".section h2");
    for (s = 0; s < sectionsH2Array.length; s++) {
        var collapseImg = document.createElement('img');
        collapseImg.collapsedStatus = false

        collapseImg.src = "collapse.png"
        collapseImg.style.margin = "1px 15px 0px 0px"
        collapseImg.style.float = "right"
        collapseImg.style.border = "none"
        collapseImg.style.cursor = "pointer"

        collapseImg.onclick = function () {
            if (! this.collapsedStatus) {
                this.originalDivParentHeight = this.parentNode.parentNode.clientHeight
                this.src = "expand.png"
                this.parentNode.parentNode.style.height = "20px"
                this.parentNode.parentNode.style.overflow = "hidden"
                this.collapsedStatus = true
            } else {
                this.src = "collapse.png"
                this.parentNode.parentNode.style.height = this.originalDivParentHeight-10 + "px"
                this.collapsedStatus = false
            }
        }

        sectionsH2Array[s].appendChild(collapseImg);
    }

});

$.fn.hideEmptyTable=function(){
    return this.each(function () {
        rows=$("tr",this).length
        if(rows<1 && !document.debugmode)$(this).css("display","none")
    })
}

$.fn.hideEmptyValue = function () {
    return this.each(function () {
        correspondingValue=$(this).next(".dataValue")
        if($.trim(correspondingValue.text())==''){
            if(document.debugmode){
                $(this).css("background","#ffbbbb");
                $(correspondingValue).css("background","ffbbbb");
            }else{
                $(this).css("display","none");
                $(correspondingValue).css("display","none");
            }
        }
    })
}

$.fn.hideValue = function () {
    return this.each(function () {
        correspondingLabel=$(this).prev(".dataLabel")
       
            if(document.debugmode){
                $(this).css("background","#ffbbbb");
                $(correspondingLabel).css("background","ffbbbb");
            }else{
                $(this).css("display","none");
                $(correspondingLabel).css("display","none");
            }
        
    })
}

$.fn.digits = function () {
    return this.each(function () {
        $(this).text($(this).text().replace(/^0+/, '').replace(/(\d)(?=(\d\d\d)+(?!\d))/g, "$1,"));
    })
}

$.fn.deviseSign = function () {
    return this.each(function () {
        if($.trim($(this).html())!="")$(this).html(document.devise+$(this).text());
    })
}

$.fn.toMonthName = function () {
    return this.each(function () {
        arrayMonthName=new Array("","January","February","March","April","May","June","July","August","September","October","November","December");
        
        if($.trim($(this).html())!="")$(this).html(arrayMonthName[parseInt($(this).text())]);
    })
}

    