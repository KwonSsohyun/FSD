<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, java.util.*"
%>{"dept":[
<%
	// ▶ 파일확장자는 jsp이지만, (자바 문법을 안에서 쓰고 있기 때문)
	//   하지만 나는 json 파일 형식으로 쓸것이다.

	//   → jsp확장자 파일이지만, 해당파일에 json문법 형식에 잘 맞게만 적었다면,
	//     json처럼 쓰고 싶다면, 해당파일 맨 위에 컨텐츠타입을 명시해줘야한다.
	//     page contentType="application/json" pageEncoding="UTF-8"
	//     이와 가져오는 타입에 맞게 컨텐츠타입을 명시해 준다면
	//     post방식이든, get방식이든 쓸 수 있다. 
	
	// -------------------------------------------------------------------------------
	
	// ▶ 해당 jsp파일이 list.jsp에서 잘 불러와지나 확인해보기 위해
	//   콘솔창에 찍어본다.
	//   해당사항이 잘 찍힌다면 잘 불러와지는 것
	System.out.println("call json...");
	
    // ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■

    
	// ▶ 데이터베이스 연동
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	
	// ▶ 어레이리스트 자료구조 쓴다.
	//   안에는 Map 자료구조 씀
	List<Map<String,String>> list = new ArrayList<Map<String,String>>();

	
	Class.forName(driver);
	Connection conn = null;
	
	// ▶ PreparedStatement 보안상유리, 속도 빠름
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try{
		conn = DriverManager.getConnection(url, user, password);
		
		// ▶ 쿼리문장 먼저 보냄
		pstmt = conn.prepareStatement("select * from dept");
		// ▶ 쿼리문 실행
		rs = pstmt.executeQuery();
		
		while(rs.next()){
			// ▶ Map 자료구조 쓴다.
			//   위의 어레이리스트 안에 담을 것임.
			Map<String,String> map = new HashMap<String,String>();
			

			// ▶ put은 Map자료구조에 데이터를 담는 명령어
			//   → "deptno" 내가 지정하는 키의 이름
			//   →  rs.getString("deptno") -> 실제 데이터베이스에 해당하는 정해진 컬럼명을 적는다.
			//                                그것에 해당하는 값이 나온다.
			//   ▶ 괄호의 2번째 값이, 1번째 내가 지정한 키의 이름에 값으로 들어간다.
			//     → Map 자료구조는 키(key)와 값(value)의 쌍으로 이루어진 데이터의 집합이다.
			map.put("deptno", rs.getString("deptno"));
			map.put("dname", rs.getString("dname"));
			map.put("loc", rs.getString("loc"));
			
			
			// ▶ map에다가 3개의 데이터를 담고
			// ▶ 그 map를 list 자료구조에 넣는다.
			list.add(map);
		}
		
	} finally{
		if(conn!=null) conn.close();
	}
	
	
	// ▶ 콤마 찍기 (처음에는 안찍고, 그 다음부터는 앞에 콤마 찍기)
	boolean boo = false;
	
	// ▶ 개선된 for문
	//   → for(자료형 한 단계 아래의 자료형의 변수명 : 배열명){ /// }
	// 
	//     Map<String,String> → 데이터타입 자료형
	//     bean               → 변수명
	//     list               → 불러오고자 하는 대상 (배열 | 자료구조)
	// 
	//     list가 가진 데이터의 갯수만큼 반복되면서 변수에 담는다.
	//     list 자료구조에는 Map이 담겨있기 때문에
	//     → bean의 변수의 타입도 Map을 적는다.
	//     ▶ 해당 for문 안에서만 쓰는 bean변수의 타입의 자료형이 자료구조 Map이라는 것
	for(Map<String,String> bean : list){
			if(boo)out.print(","); // JSON문법을 지키기 위해서
			                       // 배열안에 요소를 넣는 건데, 여러개일 시 컴마로 구분되서
			                       // 첫 시작에만 컴마 안넣고,
			                       // 다음 갯수 부터는 앞에 컴마를 붙혀준다.
%>
			{"deptno" : <%=bean.get("deptno") %>, "dname":"<%=bean.get("dname") %>", "loc" :"<%=bean.get("loc") %>"}
<%  
			boo = true;
	}
%>
]}
