package chapter_4;

public class Page_104 {
	public static void main(String[] args) {
		int flag = 0;
		while(flag <= 9) {
			flag++;
			if(flag%2 == 0) 
				continue;
			System.out.println(flag);
		}
	}
}
