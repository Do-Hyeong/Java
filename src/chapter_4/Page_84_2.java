package chapter_4;

public class Page_84_2 {
	
	public static void main(String[] args) {
		char c1 = '\u0000';
		System.out.println(c1);
		
		char c2 = ' ';
		System.out.println(c2);
		System.out.println(c1 == c2);
		System.out.printf("%d\n", (int)c1);
		System.out.printf("%d\n", (int)c2);
		
//		char c3 = 'A';
//		System.out.printf("%d\n", (int)c3);
		
		String s1 = null;
		String s2 = "";
		System.out.println(c1 + "ㅎㅇㅎㅇ");
		System.out.println(s1 + c1 + s1);
		System.out.println(s2.equals(s1));
//		System.out.println(s1.equals(s2)); //런타임 에러
		
		Page_84_ex_ex c4 = new Page_84_ex_ex();
		System.out.printf("%d", (int)c4.c1);
	}

}

class Page_84_ex_ex {
	char c1;
	
}
