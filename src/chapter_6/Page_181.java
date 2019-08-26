package chapter_6;

public class Page_181 {
	public static void main(String[] args) {
		long result = 0;
		
		long num = 2;
		long i = 5;
		
		for(int j=1; j<=i; j++) {
			result += power(num, j);
		}
		
		System.out.println(result);
	}
	
	static long power(long num, long i) {
		long result = 0;
		
		if(i == 1) {
			result = num;
		} else {
			result = num * power(num, i-1);
		}
		return result;
	}
}
