package chapter_5;

public class Page_122 {
	
	public static void main(String[] args) {
		
		int[] num = new int[10];
		int[] num2 = new int[10];
		int tmp = 0;
		int count1 = 0, count2 = 0;
		
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] = (int) (Math.random()*10));
		}
		System.out.println();
//		System.out.println();
		
		for(int i=0; i<num.length; i++) {
			System.out.print(num2[i] = num[i]);
		}
		System.out.println();
		System.out.println();
		
		for (int j = num.length - 1; j >= 0; j--) {
			boolean changed = false;
			for (int i = 0; i < j; i++) {
				count1++;
				if (num[i] > num[i + 1]) {
					tmp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = tmp;
					changed = true;
				}
			}
			if(!changed) {
				break;
			}
		}
		

		for(int tmp2 : num) {
			System.out.print(tmp2);
		}
		System.out.println();
		System.out.println();
		
		for(int i=0; i<num2.length; i++) {
			boolean changed = false;
			for(int j=0; j<num2.length-1-i; j++) {
				count2++;
				if(num2[j] > num2[j+1]) {
					tmp = num2[j];
					num2[j] = num2[j+1];
					num2[j+1] = tmp;
					changed = true;
				}
			}
			if(!changed) 
				break;
		}
		
		for(int tmp2 : num2) {
			System.out.print(tmp2);
		}
		System.out.println();
		
		System.out.println(count1);
		System.out.println(count2);
		
	}
	
}
