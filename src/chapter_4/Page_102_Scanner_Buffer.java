package chapter_4;

import java.util.Scanner;

public class Page_102_Scanner_Buffer {
	public static void main(String[] args) throws Exception {
		System.out.println("숫자를 입력하세요.");
		
//		Scanner in = new Scanner(System.in);
//		int input = in.nextInt();
		
		int input = 0;
		
		System.out.print("문장을 입력하세요.");
		System.out.println(" (입력을 마치려면 x를 입력하세요.)");
		do {
			input = System.in.read();
			System.out.print((char) input);
		} while (input != -1 && input != 'x');
	}
}
