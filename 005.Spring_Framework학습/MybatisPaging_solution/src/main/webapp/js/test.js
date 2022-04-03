$(document).ready(function(){ 
	$( window ).resize(function() {
		var windowWidth = $( window ).width();
		if(windowWidth >= 978) {
			$("#subNavMenu").hide();
		}
	});
	
	$("#clMenu").click(function(){
		$("#subNavMenu").toggle();
	});
	
	$("#conWrite").click(function(){
		location.href = "insertBoard.jsp";
	});
	
	$("#conDel").click(function(){
		let con_test = confirm("정말로 삭제하시겠습니까?");
		if(con_test == true){
			let v = document.fm.seq.value;
			location.href = "deleteBoard.do?seq="+v;
		}
		else if(con_test == false){
		  	return false;
		}
	});
	
	$("#conList").click(function(){
		location.href = "getBoardList.do";
	});
	
	$("#imgShow").on("click",function(){
		$("#popBox").toggle();
	});
	
	$("#popBox img").on("click",function(){
		$("#popBox").hide();
	});
});

function selTr(val){
	location.href = "getBoard.do?seq="+val;
}
