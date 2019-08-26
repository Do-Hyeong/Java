package chapter_4;

public class Page_82 {
	public static void main(String[] args) {
		int score = 45;
		char grade;
		
		if(score>=90) {
			grade = 'A';
		} else if(score>=80) {
			grade = 'B';
		} else {
			grade = 'C';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
		

		System.out.println(grade = (score>=90) ? 'A' : (score>=80) ? 'B' : 'C');
		System.out.println("당신의 학점은 " + ((score>=90) ? 'A' : (score>=80) ? 'B' : 'C') + "입니다.");
	}
}
