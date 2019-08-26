package chapter_6;

public class Page_188 {
	public static void main(String[] args) {
		System.out.println(typeTest(5, 5));
//		long tmp = typeTest(5, 5L);
//		System.out.println(tmp); //리터럴 접미사는 출력되지 않는다...
		
//		float tmp = typeTest(5, 5.0); //double형 리터럴로 인식해서 컴파일 오류남...
//		System.out.println(tmp);
	}

	public static float typeTest(int num1, float num2) {
		return num1 + num2;
	}
	
	public static long typeTest(int num1, long num2) {
		return num1 + num2;
	}
}
