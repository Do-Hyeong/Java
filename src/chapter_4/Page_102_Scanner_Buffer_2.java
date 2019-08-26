package chapter_4;

import java.util.Scanner;

public class Page_102_Scanner_Buffer_2 {
	public static void main(String[] args) {
		System.out.println("입력 테스트입니다.");
		Scanner input = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int num1 = input.nextInt();
//		input.nextLine();
		System.out.println("개행문자 입력 실행");
		System.out.println(num1);
		System.out.println();
		
		System.out.println("계속 테스트입니다.");
		System.out.println("문자를 입력하세요.");
		String s1 = input.nextLine();
		System.out.println("s1 : " + s1);
		System.out.println();
		
		System.out.println("숫자를 입력하세요. 2");
		int num2 = input.nextInt();
		System.out.println(num2);
		System.out.println();

		System.out.println("다시 테스트입니다.");
		System.out.println("문자를 입력하세요. 2");
		String s2 = input.nextLine();
		System.out.println("s2 : " + s2);
		System.out.println();
		
		System.out.println("End!");
		input.close();
	}
}
