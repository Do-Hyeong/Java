package chapter_4;

public class Page_96 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0; i <= 10; i += 2, sum += i) { //초기화식, 조건식은 하나, 증감식은 두 개 이상 한꺼번에 사용 가능
			System.out.println("i값이 " + i + "일 때 : " + sum);
		}
	}
}
