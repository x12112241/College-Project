$('#textinput').keypress(function(event) {
  if (event.which == '13') {
     event.preventDefault();
      $('#header').append('<div>' + $(this).val() + ' <span onclick="$(this).parent().remove();"></span> </div>');
      $(this).val('');
   }
});


$(document).ready(function() {
    $("#loginslide").click(function() {
        $("#login").slideDown(1500);
        $("#loginslide").hide();
    });
});