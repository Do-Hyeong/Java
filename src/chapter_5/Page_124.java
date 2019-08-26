package chapter_5;

import java.util.Scanner;

public class Page_124 {
	public static void main(String[] args) {
		System.out.println("2진수로 변환시킬 16진수 문자열을 입력하세요. (exit 입력 시 종료)");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		if(input.equals("exit") || input.equals("EXIT")) {
			return;
		}
		
		String[] code_0x = {
			"0000", "0001", "0010", "0011", 
			"0100", "0101", "0110", "0111", 
			"1000", "1001", "1010", "1011", 
			"1100", "1101", "1110", "1111"
		};
		
		String result = "";
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) >= 'A' && input.charAt(i) <= 'F') {
				System.out.print(result + code_0x[input.charAt(i)-'A'+10]);
			} else if(input.charAt(i) >= '0' && input.charAt(i) <= '9') {
				System.out.print(result + code_0x[input.charAt(i)-'0']);
			} else if(input.charAt(i) >= 'a' && input.charAt(i) <= 'f') {
				System.out.print(result + code_0x[input.charAt(i)-'a'+10]);
			} else if(input.charAt(i) == ' ') {
				System.out.print(" ");
			} else {
				System.out.print("????");
			}
		}
		System.out.println();
		System.out.println();
		
		main(args);
	}
}
