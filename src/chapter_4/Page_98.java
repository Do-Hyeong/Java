package chapter_4;

public class Page_98 {
	public static void main(String[] args) {
		long end;
		long start = System.currentTimeMillis();
		for (int j = 10; j >= 0; j--) {
			for (int i = 0; i < 47500000; i++) {
				String s = "";
				s += i;
			}
		System.out.println("Countdown : " + j);
		}
		end = System.currentTimeMillis();
		System.out.println(start);
		System.out.println(end);
		System.out.println(end - start);
	}
}
