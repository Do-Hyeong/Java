package chapter_4;

public class Page_95 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		for(;i <= 10; i++) {
			sum += i;
		}
		System.out.println(i-1 + "까지의 합 : " + sum); //i가 ++증가하고 조건식에 들어갔다가 조건을 충족하지 못하여 반복이 끝난 것이기 때문!!!
	}
}
