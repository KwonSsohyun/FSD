
public class Ex06구구단 {

	public static void main(String[] args) {
		
		// 스위치 false; true;
		boolean exitSW = false; // 2x5=10 계산에서 끝내겠다.
		
		for(int dan = 2; dan <= 9 ; dan++) {
			for(int su = 1; su <= 9 ; su++) {
				
				System.out.println(dan + "x" + su + "=" + (dan*su));
				if(su == 5) {// continue; break; 나 뒤에 코드가 없기 때문에 결과는 같다. 
				// 하지만 올라갈 필요없이 브레이크가 효율적이다. 그래야 6,7,8,9 가 안도니까
				// 해당 제어문만 빠져나간다. for(int su = 1; su <= 9 ; su++) 여기만 빠져나가는 것임
					exitSW = true;
					break; 
					// break; continue; 는 반복문을 빠져나가는것이다!!! if는 조건제어문이기 때문에
					// 여기서 빠져나가는 것은 10~22번라인인 for문을 빠져나가는 것이다.
				}
				
			}
			if(exitSW) break;
			// 상식적으로도 if(///) 이 괄호안이 true가 나야 if안이 돌듯이
			// 16번 라인에서 exitSW = true; 참이 됬으니
			// 이 트루가 내려와서 if(exitSW) 트루면 브레이크 그만 돌아! 라고 하는 것임
			// 그럼 반복문 해당하는 9번으로 안올라가고 멈춘다.
			
			System.out.println();
		}

	}

}
