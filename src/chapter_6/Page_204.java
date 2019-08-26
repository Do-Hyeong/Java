package chapter_6;

public class Page_204 {
	public static void main(String[] args) {
//		Static_Block_Test.printStatic();
		long start = System.currentTimeMillis();
		
		for(int i=0; i<1000; i++) {
			int sum = 0;
			for(int j=0; j<1000; j++) {
				for(int k=0; k<10000; k++) {
					sum += (k+j+i);
				}
			}
		}

		System.out.println("메인에서 프린트 1");
//		Static_Block_Test.printStatic();
		Static_Block_Test st = new Static_Block_Test();
		System.out.println("메인에서 프린트 2");
		System.out.println("메인에서 프린트 3");
		
		System.out.println((System.currentTimeMillis() - start)/1000 + "초");
		
		start = System.currentTimeMillis();
		
		for(int i=0; i<1000; i++) {
			int sum = 0;
			for(int j=0; j<1000; j++) {
				for(int k=0; k<10000; k++) {
					sum += (k+j+i);
				}
			}
		}

		System.out.println("메인에서 프린트 4");
		Static_Block_Test.printStatic();
		System.out.println("메인에서 프린트 5");
		Static_Block_Test2.printStatic2();
		System.out.println("메인에서 프린트 6");
		
		System.out.println((System.currentTimeMillis() - start)/1000 + "초");
	}
}

class Static_Block_Test {
	static {
		System.out.println("static 블럭 초기화");
	}
	
	{
		System.out.println("인스턴스 블럭 초기화");
	}
	
	public Static_Block_Test() {
		System.out.println("생성자 초기화");
	}
	
	public static void printStatic() {
		System.out.println("static 메서드 '프린트 스테틱' 실행!!!");
	}
}


class Static_Block_Test2 {
	static {
		System.out.println("static 블럭2 초기화");
	}
	
	{
		System.out.println("인스턴스 블럭2 초기화");
	}
	
	public Static_Block_Test2() {
		System.out.println("생성자2 초기화");
	}
	
	public static void printStatic2() {
		System.out.println("static 메서드2 '프린트 스테틱2' 실행!!!");
	}
}

// 동적 로딩 관련