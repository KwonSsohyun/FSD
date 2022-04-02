$(document).ready(function(){ 
	$( window ).resize(function() {
		var windowWidth = $( window ).width();
		if(windowWidth >= 978) {
			$("#subNavMenu").hide();
		}
	});
	
	$("#conWrite").click(function(){
		location.href = "insertBoard.do";
	});

});

function selTr(val){
	location.href = "getBoard.do?seq="+val;
}
