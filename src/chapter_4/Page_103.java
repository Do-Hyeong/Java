package chapter_4;

public class Page_103 {
	
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			if(i == 4) 
				break;
			System.out.println("i = " + i);
		}
		
		if(1 >= 0) {
			System.out.println(1);
			System.out.println(2);
//			break; //break cannot be used outside of a loop or a switch
			System.out.println(3);
		}
	}

}
