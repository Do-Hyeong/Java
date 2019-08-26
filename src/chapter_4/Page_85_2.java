package chapter_4;

import java.util.Scanner;

public class Page_85_2 {
	
	public static void main(String[] args) {
		String s1 = "";
		System.out.println("문자를 입력해라!!");
		
		Scanner input = new Scanner(System.in);
		s1 = input.nextLine();
		
		switch(s1) {
		case "hi" : 
			System.out.println(s1);
			break;
		case "no!" : 
			System.out.println("Yes!!");
			break;
		default : 
			System.out.println("default!!!");
		}
	}

}
