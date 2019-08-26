package chapter_6;

public class Page_170_ReturnTest {
	
	public static void main(String[] args) {
		
		Page_170_ReturnTest tmp = new Page_170_ReturnTest();
		
		int result1 = tmp.add(3, 5);
		System.out.println(result1);
		
		int result2 = 0;
		tmp.add(3, 5, result2);
		System.out.println(result2); //결과 매우 중요!!!
		
	}
	
	public int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public void add(int a, int b, int c) {
		c = a + b;
		//매개변수를 통해 들어온 인자 result2는 '값'일 뿐이다.
		//a + b의 결과값이 저장된 변수는 result2 변수가 아닌 지역변수 c이기 때문에 c와 result의 결과는 다르다!!!
	}
}
