package chapter_4;

import java.util.Scanner;

public class Page_92_3 {
	
	static int num;
	
	public static void main(String[] args) {
		String rank = "";
		
		switch(parseInput()/5) {
		case 20 : 
		case 19 : 
			rank = rank.concat("A");
			break;
		case 18 : 
			rank = rank.concat("A-");
			break;
		case 17 : 
			rank = rank.concat("B");
			break;
		case 16 : 
			rank = rank.concat("B-");
			break;
		case 15 : 
			rank = rank.concat("C");
			break;
		case 14 : 
			rank = rank.concat("C-");
			break;
		case 13 : 
			rank = rank.concat("D");
			break;
		case 12 : 
			rank = rank.concat("D-");
			break;
		default : 
			rank = rank.concat("F");
		}
		
		System.out.println("당신의 학점은" + rank + "입니다.");
		
	}
	
	public static int parseInput() {
		System.out.println("점수를 입력하세요.");
		Scanner input = new Scanner(System.in);
		
		String s = input.nextLine();
		
		try {
			num = Integer.parseInt(s);
		} catch (Exception e) {
			System.out.println("올바른 값을 입력하세요.");
			parseInput();
		} finally {
			input.close();
		}
		return num;
		
	}

}
