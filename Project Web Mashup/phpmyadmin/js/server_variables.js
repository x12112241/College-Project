AJAX.registerTeardown("server_variables.js",function(){$("#serverVariables .var-row").unbind("hover");$("#filterText").unbind("keyup");$("a.editLink").die("click");$("#serverVariables").find(".var-name").find("a img").remove()});AJAX.registerOnload("server_variables.js",function(){var c=$("a.editLink");var e=$("a.saveLink");var b=$("a.cancelLink");var d=$("#filterText");$("#serverVariables").delegate(".var-row","hover",function(h){if(h.type==="mouseenter"){var g=$(this).find(".var-value");if(g.hasClass("editable")&&!g.hasClass("edit")){g.prepend(c.clone().show())}}else{$(this).find("a.editLink").remove()}}).find(".var-name").find("a").append($("#docImage").clone().show());c.live("click",function(g){g.preventDefault();a(this)});d.keyup(function(){var g=null,h=$(this).val();if(h.length!==0){g=new RegExp("(^| )"+h.replace(/_/g," "),"i")}f(g)});if(d.val()){d.trigger("keyup").select()}function f(i){var j=false,g,h=false;$("#serverVariables .var-row").not(".var-header").each(function(){g=$(this);if(j||i===null||i.exec(g.find(".var-name").text())){j=g.hasClass("diffSession")&&!j;h=!h;g.css("display","");if(h){g.addClass("odd").removeClass("even")}else{g.addClass("even").removeClass("odd")}}else{g.css("display","none")}})}function a(i){var j=$(i).parent();var l=j.parent().find(".var-name").text().replace(/ /g,"_");var h=e.clone().show();var g=b.clone().show();var k=PMA_ajaxShowMessage();j.addClass("edit").find("a.editLink").remove();h.click(function(){var m=PMA_ajaxShowMessage(PMA_messages.strProcessingRequest);$.get($(this).attr("href"),{ajax_request:true,type:"setval",varName:l,varValue:j.find("input").val()},function(n){if(n.success){j.html(n.variable).data("content",n.variable);PMA_ajaxRemoveMessage(m)}else{PMA_ajaxShowMessage(n.error,false);j.html(j.data("content"))}j.removeClass("edit")});return false});g.click(function(){j.html(j.data("content")).removeClass("edit");return false});$.get(h.attr("href"),{ajax_request:true,type:"getval",varName:l},function(m){if(m.success===true){var n=$("<div />",{"class":"serverVariableEditor"}).append(g).append(" ").append(h).append(" ").append($("<div/>").append($("<input />",{type:"text"}).val(m.message)));j.data("content",j.html()).html(n).find("input").focus().keydown(function(o){if(o.keyCode===13){h.trigger("click")}else{if(o.keyCode===27){g.trigger("click")}}});PMA_ajaxRemoveMessage(k)}else{j.removeClass("edit");PMA_ajaxShowMessage(m.error)}})}});