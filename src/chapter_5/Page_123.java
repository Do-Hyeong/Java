package chapter_5;

public class Page_123 {
	public static void main(String[] args) {
		int[] num = new int[10];
		int[] count = new int[num.length];
		
		for(int tmp=0; tmp < num.length; tmp++) {
			System.out.println(num[tmp] = (int) (Math.random() * 10));
		}
		
		for(int i=0; i<count.length; i++) {
			count[num[i]]++;
		}
		
		for(int i=0; i<count.length; i++) {
			System.out.println(i + "의 갯수 : " + count[i]);
		}
	}
}
