$(document).ready(function() { 
	
	//Funzione Modifica View Index
	$(function() {
	  $("h1").animate({
	    "margin-left": "100px"
	  }, "slow");

	  $(".nav li").on("click", function() {
	    $(".nav li").removeClass("active");
	    $(this).addClass("active");
	  });
	  
	});
	
});