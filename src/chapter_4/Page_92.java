package chapter_4;

import java.util.Scanner;

public class Page_92 {

	public static void main(String[] args) {

		if (parseInt() >= 10) {
			System.out.println("10점 이상");
		} else {
			System.out.println("10점 이하");
		}

	}

	public static int parseInt() {

		System.out.println("점수를 입력하세요.");
		Scanner input = new Scanner(System.in);

		String score = input.nextLine();
		int iscore = 0;

		try {

			iscore = Integer.parseInt(score);

		} catch (Exception e) {

			System.out.println("올바른 숫자를 입력하세요!");
			parseInt();

		} finally {

			input.close();

		}

		return iscore;
	}

}