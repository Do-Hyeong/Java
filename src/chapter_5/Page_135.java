package chapter_5;

import javax.swing.JOptionPane;

public class Page_135 {
	public static void main(String[] args) {
		String inputString = null;
		int input = 0;
		int count = 0;
		int answer = (int) (Math.random() * 100) + 1;
		
		System.out.println("랜덤 정수가 어떤 수인지 맞춰봅니다.");
		while(true) {
			inputString = JOptionPane.showInputDialog("*랜덤 숫자맞추기* 1부터 100 사이의 숫자를 입력하세요~~, 종료:-1");
			
			if(inputString == null || inputString.equals("-1")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			count++;
			try {
				input = Integer.parseInt(inputString);
			} catch(Exception e) {
				System.out.println("올바른 값을 입력하세요!!");
				continue;
			}
			
			if(input > answer) {
				System.out.println("랜덤수는 입력값보다 작습니다.");
			} else if(input < answer) {
				System.out.println("랜덤수는 입력값보다 큽니다.");
			} else {
				System.out.println("정답입니다!!!");
				System.out.println("정답까지 시행 횟수 : " + count);
				break;
			}
		}
	}
}
