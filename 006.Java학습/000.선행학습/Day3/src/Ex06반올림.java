
public class Ex06반올림 {
	public static void main(String[] args)	{
		double pi = 3.121592;
		// double shortPi = Math.round(pi); // 3.0 출력
		double shortPi = Math.round(pi * 1000) / 1000.; // 소숫점 3번째 자리까지만 출력 // 3.122

		
		System.out.println(shortPi); 
	}
}
