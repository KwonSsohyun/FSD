
public class Ex06구구단2 {

	public static void main(String[] args) {
		
		// Loop1 레이블 지정 (★제어문에서만 레이블을 쓸 수 있다.★)
		Loop1 : for(int dan = 2; dan <= 9 ; dan++) {
			for(int su = 1; su <= 9 ; su++) {
				
				System.out.println(dan + "x" + su + "=" + (dan*su));
				if(su == 5)break Loop1; // Loop1 레이블을 지정한 여기를 탈출한다.
				
			}

			System.out.println();
		}

	}

}
