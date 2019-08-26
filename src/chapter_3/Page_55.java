package chapter_3;

public class Page_55 {
	public static void main(String[] args) {
		int a = 1000000;
		int b = 2000000;
		long c = a * b;
		System.out.println("c : " + c);
		
		long d = 1000000;
		int e = 2000000;
		long f = d * e;
		System.out.println("f : " + f);
		
		long g = 1000000 * 2000000;
		System.out.println("g : " + g);
		
		long h = 1000000 * 2000000L;
		System.out.println("h : " + h);
		
		System.out.println();
		System.out.println(Math.round(1));
	}
}
