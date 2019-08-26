package chapter_4;

public class Page_105_2 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0, num3 = 0;
		
		exit1 : while(num1 <= 9) {
			num1++;
			num2 = 0;
			while(num2 <= 8) {
				num2++;
				
				if(num1 == 1 || num1 == 10) {
					continue exit1;
				}
				
				System.out.print(num1 + " X " + num2 + " = " + num1*num2 + "\t");
				if(num2%3 == 0) {
					System.out.println();
				}
			}
			System.out.println();
		}
	}
}
