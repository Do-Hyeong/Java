package chapter_6;

import java.util.Scanner;

public class Page_218 {
	public static boolean isNumber(String number) {
		for(int i=0; i<number.length(); i++) {
//			if(number.charAt(i) != '1' && number.charAt(i) != '2' && number.charAt(i) != '3' && number.charAt(i) != '4' && number.charAt(i) != '5' && 
//					number.charAt(i) != '6' && number.charAt(i) != '7' && number.charAt(i) != '8' && number.charAt(i) != '9' && number.charAt(i) != '0') {
//				flag = false;
//				break;
//			}
			if(number.charAt(i) < '0' || number.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
	
	public static void main (String[] args) {
		System.out.println("검사할 문자열을 입력하세요.");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		
		System.out.println(str + "은 숫자입니까? : " + isNumber(str));
	}
}
