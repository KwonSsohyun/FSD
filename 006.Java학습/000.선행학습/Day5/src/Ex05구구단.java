
public class Ex05구구단 {

	public static void main(String[] args) {
		for(int dan = 2; dan <= 9 ; dan++) {
			for(int su = 1; su <= 9 ; su++) {
				
				System.out.println(dan + "x" + su + "=" + (dan*su));
				if(su == 5) break; // continue; break; 나 뒤에 코드가 없기 때문에 결과는 같다. 
				// 하지만 올라갈 필요없이 브레이크가 효율적이다. 그래야 6,7,8,9 가 안도니까
				// 해당 제어문만 빠져나간다. for(int su = 1; su <= 9 ; su++) 여기만 빠져나가는 것임
				
			}
		System.out.println();
		}

	}

}
