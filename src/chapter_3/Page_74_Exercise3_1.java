package chapter_3;

public class Page_74_Exercise3_1 {
	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A';

		System.out.println(Integer.toBinaryString(3 << 23));
		System.out.println(Integer.toBinaryString(3 << 24));
		System.out.println(Integer.toBinaryString(3 << 25));
		System.out.println(Integer.toBinaryString(3 << 26));
		System.out.println(Integer.toBinaryString(3 << 27));
		System.out.println(Integer.toBinaryString(3 << 28));
		System.out.println(Integer.toBinaryString(3 << 29));
		System.out.println(Integer.toBinaryString(3 << 30));
		System.out.println(Integer.toBinaryString(3 << 31));
		System.out.println(Integer.toBinaryString(3 << 32));
		System.out.println(Integer.toBinaryString(3 << 33));
		System.out.println(1 + x << 33);
		System.out.println(y >= 5 || x < 0 && x > 2);
		System.out.println(y += 10 - x++);
		System.out.println(x += 2);
		System.out.println(!('A' <= c && c <= 'Z'));
		System.out.println('C' - c);
		System.out.println('5' - '0');
		System.out.println(c + 1);
		System.out.println(++c);
		System.out.println(c++);
		System.out.println(c);
	}
}
