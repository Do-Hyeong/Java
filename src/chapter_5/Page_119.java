package chapter_5;

import java.text.DecimalFormat;

public class Page_119 {
	public static void main(String[] args) {
		double sum = 0.0D;
		double avr = 0.0D;
		int[] score = {100, 88, 100, 100, 90};
		
		for(int tmp : score) {
			sum += tmp;
		}
		avr = sum / score.length;
		double avr2 = 95.65D;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avr);
		System.out.println(avr2);
		System.out.println(String.format("%,.1f", avr2));
		System.out.printf("%.1f\n", avr2);
		DecimalFormat df1 = new DecimalFormat(".#");
		System.out.println(df1.format(avr2));
	}
}
