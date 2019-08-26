package chapter_5;

public class Page_131 {
	public static void main(String[] args) {
		int[] num1 = {1, 2, 3, 4, 5};
		int[] num2 = new int[num1.length];
		
		for(int i=0; i<num1.length; i++) {
			num2[i] = num1[i];
		}
		
		int[] num3 = new int[num1.length];
		
		System.arraycopy(num1, 0, num3, 0, num1.length);
		
		String s1 = "num1 : [", s2 = "num2 : [", s3 = "num3 : [";
		for(int i=0; i<num1.length; i++) {
			if(i != num1.length-1) {
				s1 += num1[i] + ", ";
				s2 += num2[i] + ", ";
				s3 += num3[i] + ", ";
			} else {
				s1 += num1[i] + "]";
				s2 += num2[i] + "]";
				s3 += num3[i] + "]";
			}
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}
