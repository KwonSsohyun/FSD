package com.hi;

class Ball{
	//공 번호를 바꾸지 않기 위해 private
	private final int num; // 공 못 바꾸게 하려고 private
	boolean marking; // 공 뽑은거 마킹함
	String color;
	
	// 왜냐? 생성자선언을 했기 때문에, 자동기본생성자가 만들어지지 않는다.
	public Ball(int num){
		this.num = num;
		marking = true; // 뽑았던 공은 false로 바꿀거임
		if(num<10){
			color = "노랑색";
		}else if(num<20){
			color = "파란색";
		}else if(num<30){
			color = "빨간색";
		}else if(num<40){
			color = "초록색";
		}else{
			color = "검정색";
		}
	}
	int showNum(){ //  private 해서
		return num;
	}
	
}

public class Ex12 {

	public static void main(String[] args) {
		String[] note = new String[6]; // 뽑힌 공의 번호를 적을 노트
	      // note-> 6개의 공간을 가진 배열객체
	      // note[0]->null
		Ball[] box = new Ball[45]; //객체배열 45개 생성 (45개를 담을 수 있는 공간)
		
		for(int i=0; i<box.length; i++){ //공간의 개수만큼 객체를 생성
			box[i] = new Ball(i+1); //생성자의 인자 
			// (i+1) 매개변수를 전달해줘야 되는 생성자이기 때문에 
			// 타입을 맞춰준거다.
		}
		
		for(int i=0; i<note.length; i++){
			// 공을 꺼내고
			int ran = (int)(Math.random()*45); 
			// Ball ball; ->> 임시로 잠시 쓰려고 선언을 한거고
			Ball ball = box[ran];
			// 참조변수니까 box[ranNum] 그 해당 가르키는 주소값을 ball변수에 담았다.
	        // ->> ball = box[ranNum];
			
			// 확인
			// 뽑은 공인지 안뽑은 공인지 확인
			// 편하게 ball변수 썼다.
			if(ball.marking){
				// 안뽑았던 공은 note에 작성
				// marking
				note[i] = ball.color+"공 "+ball.showNum();
				ball.marking = false;
			}else{
				// 뽑았던 공은 note--;
				i--; // 마이너스 만나면 숫자차감되서 위로 i++증감식 만난다.
				// 만약 i가 1이 었는데
				// i-- 만나서 0이 되고
				// 위에 증감식 만나서 i++되서 다시 1이 된다.
			}
		
		}
		
		// 출력해보는 코드
		for(int i=0; i<note.length; i++){
			System.out.println(note[i]);
		}

	}

}
