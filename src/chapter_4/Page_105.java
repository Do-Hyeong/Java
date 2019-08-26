package chapter_4;

public class Page_105 {
	
	public static void main(String[] args) {
		int num1=0, num2=0, num3=0;
		flag : while(num1 <= 9) {
			System.out.println(++num1);
			System.out.println("-------------------------");
			
			for(int i=0; i<=9; i++) {
				System.out.println(i);
				if(i == 5) {
					break flag;
				}
			}
		}
		
		
	}

}
