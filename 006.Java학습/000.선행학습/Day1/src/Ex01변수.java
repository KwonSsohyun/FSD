
public class Ex01변수 {
	public static void main(String args[]) {
		// 정수를 저장할 수 있는 변수 x를 메모리 할당. 
		// int 정수 (데이터 타입)
		int x = 5; // 초기값을 줘야한다. 초기값을 안주면 쓰래기값을 가질수 있다.
		System.out.println(x); // System 보통 앞에가 대문자면 클래스임 / println() 함수
		int y = 3;
		System.out.println(x + y); // 변수끼리 계산 가능하다. 숫자니까!
		
		System.out.println("x와 y를 맞바꾸면..."); // ln 줄바꿈 의미
		int tmp = x; // x의 값을 tmp 백업 (메모리는 하나씩만 옮길수있다.)
		x = y; // y(3)의 값이 x에 담김 (x는 3이 됨)
		y = tmp; // tmp의 값이 y에 담김 (위에서 tmp는 x(5)) (y는 5가 됨)
		
		System.out.print("x = "); // print뒤에 ln이 안붙으면 줄바꿈이 안되고 다음에 연결되서 보인다.
		// 그래서 print("x = ") ▶ x = 이출력이 되는데, 이 뒤에 나는 x의 3값을 =뒤에 붙히고 싶어서 다음줄에서는 println(x) 한다.
		System.out.println(x); // ln을 붙혔기 때문에 위랑 이게 한줄에 출력되고, 아랫줄코드부터는 다음줄에 출력
		System.out.print("y = ");
		System.out.println(y);
	}
}
