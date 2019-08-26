package chapter_4;

import java.sql.Date;

public class Page_84 {
	public static void main(String[] args) {
		StringBuffer grade = new StringBuffer("");
		
		System.out.println(grade.append("A"));
		System.out.println(grade);
		
		long start;
		
		start = System.currentTimeMillis();
		String grade2 = "BBBBB";
		for(int i = 0; i <= 20000; i++) {
			grade2.concat("bbbbb");
		}
		System.out.println(System.currentTimeMillis() - start);
		System.out.println();

		start = System.currentTimeMillis();
		String grade3 = "BBBBB";
		for(int i = 0; i <= 20000; i++) {
			grade3 += "bbbbb";
		}
		System.out.println(System.currentTimeMillis() - start);
		System.out.println();

		start = System.currentTimeMillis();
		String grade4 = "BBBBB";
		for(int i = 0; i <= 20000; i++) {
			grade4 = grade4 + "bbbbb";
		}
		System.out.println(System.currentTimeMillis() - start);
		System.out.println("--------------------------------");
		
		

		start = System.currentTimeMillis();
		int num1 = 5;
		for(int i = 0; i <= 20000000; i++) {
			num1 += 1;
			num1 -= 1;
		}
		System.out.println(System.currentTimeMillis() - start);
		System.out.println();

		start = System.currentTimeMillis();
		int num2 = 5;
		for(int i = 0; i <= 20000000; i++) {
			num2 = num2 + 1;
			num2 = num2 - 1;
		}
		System.out.println(System.currentTimeMillis() - start);
	}
}
