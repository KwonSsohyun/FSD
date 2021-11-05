
public class Ex02결합연산자 {
	public static void main (String[] args) {
		String name = "ja" + "va";
		String str = name + 8.0;
		
		System.out.println(name);
		System.out.println(str);
		
		System.out.println(7 + " ");// " " 빈칸
		System.out.println(" " + 7);
		System.out.println(7 + ""); // ascii(에스키코드) 0번글자는 null을 의미 "" > 이건 아무것도 없는문자
		// "" 은 null을 의미한다. === (7 + null); 근데 이렇게 적으면 연산이 안됨. 단독이면 null을 적어도됨
		
		System.out.println("" + 7);
		System.out.println("" + ""); // 걍 아무것도 없음 println이라 개행만 일어남
		
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7); // 77이라는 결과값이 나온다. 
		// "" 아무것도 없는 글자에 7을 붙혀서 문자가 되고, 거기 뒤에 7이 붙혀서 "결합연산자"됨
	}
}
