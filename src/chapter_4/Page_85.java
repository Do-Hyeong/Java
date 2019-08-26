package chapter_4;

public class Page_85 {
	
	public static void main (String[] args) {
		
		int num1 = 44;
		
		switch(num1 - 42) {
			case 3 : 
				System.out.println("1");
				break;
			case 2 : 
				System.out.println("0");
				System.out.println("1");
				if(num1 == 44) {
					System.out.println(num1);
				}
				System.out.println("2");
			case 1 : {
				System.out.println("3");
				System.out.println("4");
				break;
			}
			default : 
				System.out.println("5");
		}
		
		System.out.println(Math.random());
	}

}
