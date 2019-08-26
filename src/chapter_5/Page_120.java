package chapter_5;

public class Page_120 {
	public static void main(String[] args) {
		int[] a1 = {79, 88, 91, 33, 100, 55, 95};
		
		int max = a1[0], min = a1[0];
		
		for(int i=1; i<a1.length; i++) {
			if(max < a1[i]) {
				max = a1[i];
			}
			if(min > a1[i]) {
				min = a1[i];
			}
		}

		System.out.println("max : " + max);
		System.out.println("min : " + min);
	}
}
