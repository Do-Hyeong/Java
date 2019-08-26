package chapter_4;

import java.util.Scanner;

public class Page_92_2 {

	static int iscore;

	public static void main(String[] args) {

		switch (parseInt() / 10) {
		case 10:
		case 9:
			System.out.println("당신의 학점은 A입니다.");
			break;
		case 8:
			System.out.println("당신의 학점은 B입니다.");
			break;
		case 7:
			System.out.println("당신의 학점은 C입니다.");
			break;
		case 6:
			System.out.println("당신의 학점은 D입니다.");
			break;
		default:
			System.out.println("당신의 학점은 F입니다.");
		}

	}

	public static int parseInt() {
		System.out.println("점수를 입력하세요.");
		Scanner input = new Scanner(System.in);

		String score = input.nextLine();
		try {
			iscore = Integer.parseInt(score);
		} catch (Exception e) {
			System.out.println("올바른 숫자를 입력하세요!");
			parseInt();
		} finally {
			input.close();
		}
		return iscore++;
	}

}

//score = String.valueOf(44);
//score = Integer.toString(44);

//public static int parseInt() {
//	System.out.println("점수를 입력하세요.");
//	Scanner input = new Scanner(System.in);
//	
//	String score = input.nextLine();
//	int iscore = 0;
//	try {
//		iscore = Integer.parseInt(score);
//	} catch(Exception e) {
//		System.out.println("올바른 숫자를 입력하세요!");
//		parseInt();
//	} finally {
//		input.close();
//	}
//	return iscore++;
//}