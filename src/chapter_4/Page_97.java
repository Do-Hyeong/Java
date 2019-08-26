package chapter_4;

public class Page_97 {
	
	public static void main(String[] args) {

		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " X " + j + " = " + i * j + "\t");
				if(j % 3 == 0) {
					System.out.println();
				}
			}
			
			System.out.println();
			
		}
		
	}

}
