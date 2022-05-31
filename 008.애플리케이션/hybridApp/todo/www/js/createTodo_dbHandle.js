// 변수 선언
var db = null;
var var_no = null;
var position = null;


// 데이터베이스 생성 및 오픈 (생성+연결)
function openDB(){
	// window.openDatabase('데이터베이스명', '데이터베이스 버전', '데이터베이스 설명', 용량(숫자자료형=바이트단위) );
	// 바이트 -> KB -> MB
	// 5MB == 5 * 1024 * 1024
	db = window.openDatabase('createTodo', '1.0', '일정관리DB', 5*1024*1024);
	console.log('DB 생성...');
}


// 테이블 생성 & 트랜잭션 실행
// 트랜잭션이 있어야 ps객체 이용해서 sql 쿼리문 사용가능
function createTable() {
	db.transaction(function(ps){
		// idx - int (자동증가)
        // contents - varchar(100)
		var createSQL = 'create table if not exists todo(idx integer primary key autoincrement, chk text, msg text, contents text)';

		ps.executeSql(createSQL, [], function(){
			console.log('테이블 생성 실행 성공');
		}, function(){
			console.log('테이블 생성 실행 실패');
		});
	});
}


// 신규
function insertTodo(text){
	db.transaction(function(ps){
		var insertSQL = 'insert into todo(contents) values(?)';
		ps.executeSql(insertSQL, [text], function(ps){
			console.log('todo 신규등록');
			$('#creat').empty();
			location.reload(true);
		});
	});
}


// 수정
function updateTodo(editText, idx){
	db.transaction(function(ps){
		var updateSQL = 'update todo set contents = ? where idx = ?';
		ps.executeSql(updateSQL, [editText, idx], function(ps){
			console.log('todo 수정');
			location.reload(true);
		})
	});
}


// 삭제
function deleteTodo(idx){
	db.transaction(function(ps){
		var deleteSQL = 'delete from todo where idx = ?';
		ps.executeSql(deleteSQL, [idx], function(ps){
			console.log('todo 삭제');
			location.reload(true);
		});
	});
}


// 검색
function searchTodo(searchText){
	db.transaction(function(ps){
		var searchSQL = "select * from todo where contents like '%'||?||'%' order by idx desc"; 

		ps.executeSql(searchSQL, [searchText], function(ps,rs){
			console.log("todo 검색");
			cnt = rs.rows.length;
			console.log("todo 검색목록 개수 : " + cnt);
			console.log(rs);

			if(cnt==0){
				alert("검색된 투두 리스트가 없습니다.");
			}
			if(cnt>0){
				// alert("검색이 하나 이상 있다.");
				
				// 해당 자신을 제외한 자식요소 제거  ▶  $('#list-exist').empty();
				$('#list-exist').empty();

				// for(i=0; i<cnt; i++){
				// 	$('#list-exist').append("<li id='li_"+rs.rows.item(i).idx+"'><a href='#' class='abtn'><input onclick='checkBtn("+rs.rows.item(i).idx+")' type='checkbox' id='chbox"+ rs.rows.item(i).idx +"' name='chk' data-inline='true' data-cacheval='"+ rs.rows.item(i).chk +"'><label for='chbox"+ rs.rows.item(i).idx +"' class='la-txt "+ rs.rows.item(i).msg +"'>"+rs.rows.item(i).contents +"</label><div onclick='editBtn("+rs.rows.item(i).idx+")' class='ui-li-count bc_edit'></div></a><a href='#' data-icon='del'></a></li>").trigger("create");
				// 	// $('#list-exist').append("<li id='li_"+rs.rows.item(i).idx+"'><a href='#' class='abtn'><input type='checkbox' id='chbox"+ rs.rows.item(i).idx +"' name='chk' data-inline='true'><label for='chbox"+ rs.rows.item(i).idx +"' class='la-txt'>"+rs.rows.item(i).contents +"</label><div class='ui-li-count bc_edit'></div></a><a href='#' data-icon='del'></a></li>").trigger("create");
				// }
				// $("#list-exist").listview('refresh');
				for(i=0; i<cnt; i++){
					// 체크
					if(rs.rows.item(i).chk == 'true'){
						$('#list-exist').append("<li id='li_"+rs.rows.item(i).idx+"'><a href='#' class='abtn'><input onclick='checkBtn("+rs.rows.item(i).idx+")' type='checkbox' id='chbox"+ rs.rows.item(i).idx +"' name='chk' data-inline='true' checked><label for='chbox"+ rs.rows.item(i).idx +"' class='la-txt' checked>"+rs.rows.item(i).contents +"</label><div onclick='editBtn("+rs.rows.item(i).idx+")' class='ui-li-count bc_edit'></div></a><a href='#' data-icon='del'></a></li>").trigger("create");
					} 
					// 미체크
					if(rs.rows.item(i).chk == 'false'){ 
						$('#list-exist').append("<li id='li_"+rs.rows.item(i).idx+"'><a href='#' class='abtn'><input onclick='checkBtn("+rs.rows.item(i).idx+")' type='checkbox' id='chbox"+ rs.rows.item(i).idx +"' name='chk' data-inline='true'><label for='chbox"+ rs.rows.item(i).idx +"' class='la-txt'>"+rs.rows.item(i).contents +"</label><div onclick='editBtn("+rs.rows.item(i).idx+")' class='ui-li-count bc_edit'></div></a><a href='#' data-icon='del'></a></li>").trigger("create");
					}
					// 아무것도 없을때
					if(rs.rows.item(i).chk == null || rs.rows.item(i).chk == ''){ 
						$('#list-exist').append("<li id='li_"+rs.rows.item(i).idx+"'><a href='#' class='abtn'><input onclick='checkBtn("+rs.rows.item(i).idx+")' type='checkbox' id='chbox"+ rs.rows.item(i).idx +"' name='chk' data-inline='true'><label for='chbox"+ rs.rows.item(i).idx +"' class='la-txt'>"+rs.rows.item(i).contents +"</label><div onclick='editBtn("+rs.rows.item(i).idx+")' class='ui-li-count bc_edit'></div></a><a href='#' data-icon='del'></a></li>").trigger("create");
					}
					
				}
				$("#list-exist").listview('refresh');
			}
		});
	});
}


// 전체 목록 실행
function totalList(){
	db.transaction(function(ps){
		var selectSQL = 'select * from todo order by idx desc';
		let cnt = 0;

		$('#list-exist').empty();
		ps.executeSql(selectSQL, [], function(ps,rs){
			cnt = rs.rows.length;
			console.log("전체목록개수 : " + cnt);
			console.log(rs);

			if(cnt==0){
				// alert("투두 리스트가 없습니다.")
			} else{
				for(i=0; i<cnt; i++){
					// 체크
					if(rs.rows.item(i).chk == 'true'){
						$('#list-exist').append("<li id='li_"+rs.rows.item(i).idx+"'><a href='#' class='abtn'><input onclick='checkBtn("+rs.rows.item(i).idx+")' type='checkbox' id='chbox"+ rs.rows.item(i).idx +"' name='chk' data-inline='true' checked><label for='chbox"+ rs.rows.item(i).idx +"' class='la-txt' checked>"+rs.rows.item(i).contents +"</label><div onclick='editBtn("+rs.rows.item(i).idx+")' class='ui-li-count bc_edit'></div></a><a href='#' data-icon='del'></a></li>").trigger("create");
					} 
					// 미체크
					if(rs.rows.item(i).chk == 'false'){ 
						$('#list-exist').append("<li id='li_"+rs.rows.item(i).idx+"'><a href='#' class='abtn'><input onclick='checkBtn("+rs.rows.item(i).idx+")' type='checkbox' id='chbox"+ rs.rows.item(i).idx +"' name='chk' data-inline='true'><label for='chbox"+ rs.rows.item(i).idx +"' class='la-txt'>"+rs.rows.item(i).contents +"</label><div onclick='editBtn("+rs.rows.item(i).idx+")' class='ui-li-count bc_edit'></div></a><a href='#' data-icon='del'></a></li>").trigger("create");
					}
					// 아무것도 없을때
					if(rs.rows.item(i).chk == null || rs.rows.item(i).chk == ''){ 
						$('#list-exist').append("<li id='li_"+rs.rows.item(i).idx+"'><a href='#' class='abtn'><input onclick='checkBtn("+rs.rows.item(i).idx+")' type='checkbox' id='chbox"+ rs.rows.item(i).idx +"' name='chk' data-inline='true'><label for='chbox"+ rs.rows.item(i).idx +"' class='la-txt'>"+rs.rows.item(i).contents +"</label><div onclick='editBtn("+rs.rows.item(i).idx+")' class='ui-li-count bc_edit'></div></a><a href='#' data-icon='del'></a></li>").trigger("create");
					}
					// $('#list-exist').append("<li id='li_"+rs.rows.item(i).idx+"'><a href='#' class='abtn'><input onclick='checkBtn("+rs.rows.item(i).idx+")' type='checkbox' id='chbox"+ rs.rows.item(i).idx +"' name='chk' data-inline='true' data-cacheval='"+ rs.rows.item(i).chk +"'><label for='chbox"+ rs.rows.item(i).idx +"' class='la-txt "+ rs.rows.item(i).msg +"'>"+rs.rows.item(i).contents +"</label><div onclick='editBtn("+rs.rows.item(i).idx+")' class='ui-li-count bc_edit'></div></a><a href='#' data-icon='del'></a></li>").trigger("create");
					// $('#list-exist').append("<li id='li_"+rs.rows.item(i).idx+"'><a href='#' class='abtn'><input type='checkbox' id='chbox"+ rs.rows.item(i).idx +"' name='chk' data-inline='true'><label for='chbox"+ rs.rows.item(i).idx +"' class='la-txt'>"+rs.rows.item(i).contents +"</label><div class='ui-li-count bc_edit'></div></a><a href='#' data-icon='del'></a></li>").trigger("create");
				}
				$("#list-exist").listview('refresh');
			}
		});
	});
}


// 체크 유무
function checkList(chk, msg, val){
	db.transaction(function(ps){
		var checkSQL = 'update todo set chk = ?, msg = ? where idx = ?';
		ps.executeSql(checkSQL, [chk, msg, val], function(ps){
			console.log('todo 체크 유무' + chk);
			location.reload(true);
		});
	});
}


