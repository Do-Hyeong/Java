package chapter_6;



//전재 : String 타입도 참조형 이기 때문에 String 타입으로 선언된 변수에는 String 문자열 값의 참조변수가 저장될 것이다!
public class Page_170_ReturnTest_2 {
	
	public static void main(String[] args) {
		Page_170_ReturnTest_2 rt = new Page_170_ReturnTest_2(); //아래의 메서드를 사용하기 위하여 객체 생성
		
		int result1 = 0;
		rt.add1(3, 5, result1);
		System.out.println("add1 메서드의 기본형 result1 결과값 : " + result1);
		System.out.println("-----------------------------------------");
		
		int[] result2 = {0};
		rt.add2(3, 5, result2); //메서드 add2에 합을 구할 두 수와 결과를 저장할 배열의 참조변수를 인자로 전달
		System.out.println("add2 메서드의 result3[0] 결과값 : " + result2[0]);
		System.out.println("-----------------------------------------");
		
		String result3 = "";
		rt.add3(3, 5, result3); //메서드 add3에 합을 구할 두 수와 결과를 저장할 문자열(의 참조변수)를 인자로 전달
		System.out.println("add3 메서드의 result3 문자열 결과값 : " + result3);
		System.out.println("-----------------------------------------");
		
		
		
//		TestClass result4 = new TestClass();
//		rt.add4(3, 5, result4);
//		System.out.println("add4 메서드의 참조형 result4 결과값 : " + result4);
	}
	
	
	
	public int add(int a, int b) {
		return a + b;
	}// 두 수의 합을 구하는 메서드(반환형)
	
	
	
	public void add1(int a, int b, int c) {
		c = a + b;
	}// 두 수의 합을 구하는 메서드(반환 없음)
	
	
	
	public void add2(int a, int b, int[] c) {
		c[0] = a + b;
	}// 두 수의 합을 전달받은 매개변수(배열)에 저장하는 메서드
	
	
	
	public void add3(int a, int b, String c) {
		
		c = c.concat(Integer.toString(a + b));
		
		System.out.println("add3 메서드 내부의 처리과정 결과값 : " + c);
	}// 두 수의 합을 전달받은 문자열 매개변수에 합쳐서 넣어주는 메서드
//		c = c + (a+b);
	
	
	
	
	
//	public void add4(int a, int b, TestClass c) {
//		c.result = a + b;
//	}
	
}

class TestClass {
	int result;

	@Override
	public String toString() {
		return "" + result;
	}
}
