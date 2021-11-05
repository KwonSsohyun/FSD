
public class Ex11문자열비교 {
	public static void main(String[] args) { // args 변수명임
		
		String str1 = "abc"; // 똑같은 값을 주엇을때 서로 "공유"한다. (래퍼런스타입)
		String str2 = "abc"; // 똑같은 값을 주엇을때 서로 "공유"한다. (래퍼런스타입)
		
		System.out.println(str1 == str2); // true 
		System.out.println(str1.equals(str2)); // true 
		
		
		
		str2 = new String("abc"); // new가 붙었기 때문에 1과 2는 달라졌다. 새롭게 abc가 새로생긴거임. (새롭게 할당!)
		// 위에서는 서로 abc하나가 있는데 서로 똑같을걸 가르키고 있었다면, new라고 선언한 순간 abc가 2개가 다른거임
		
		System.out.println(str1 == str2); // false ▶ 똑같은걸 가르키냐? 아니죠~ 위에 new로 했기 때문에 abc가 서로 다름 
		System.out.println(str1.equals(str2)); // true ▶ 값이 같냐?
	}
}
