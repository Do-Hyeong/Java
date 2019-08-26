package chapter_6;

public class Page_198 { //생성자를 이용한 인스턴트의 복사

	int num1;
	int num2;
	String s1;
	
	public Page_198() {
		
	}
	
	public Page_198(int n) {
		
	}
	
	public Page_198(Page_198 p) { //자신의 참조변수를 통해 모든 인스턴스 변수를 복사하여 초기화 시키는 생성자
		num1 = p.num1;
		num2 = p.num2;
		s1 = p.s1;
	}


	
}
