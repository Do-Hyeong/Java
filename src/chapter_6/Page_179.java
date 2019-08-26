package chapter_6;

public class Page_179 {
	public static void main(String[] args) {
		long start = 0;

		start = System.currentTimeMillis();
		for(int i=0; i<5000000; i++) {
			factorial(20, 1);
		}
		System.out.println(factorial(20, 1));
		System.out.println(System.currentTimeMillis() - start);
		
		start = System.currentTimeMillis();
		for(int i=0; i<5000000; i++) {
			factorial2(20);
		}
		System.out.println(factorial2(20));
		System.out.println(System.currentTimeMillis() - start);
	}
	
	static long factorial(long num, long result) {
		result *= num;
		
		if(num - 1 > 1) {
			result = factorial(num-1, result);
		}
		
		return result;
	}
	
	static long factorial2(long num) {
		long result = 0;
		
		if(num == 1) {
			result = 1;
		} else {
			result = num * factorial2(num - 1);
		}
		
		return result;
	}
}
