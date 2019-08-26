package chapter_5;

public class Page_121 {
	public static void main(String[] args) {
//		int[] lottoBall = new int[45];
//		int[] result = new int[6];
//		int check = 0;
//		
//		while(check < 6) {
//			int randomNum = (int) (Math.random() * lottoBall.length);
//			if(lottoBall[randomNum] == 0) {
//				lottoBall[randomNum] = 1;
//				result[check] = randomNum + 1;
//				check++;
//			}
//		}
//		
//		System.out.print("로또 번호 :");
//		for(int tmp : result) {
//			System.out.print(" (" + tmp + ")");
//		}
		
		int[] lottoBall = new int[45];
		int[] result = new int[6];
		int check = 0;
		
		System.out.print("로또 번호 :");
		while(check < 6) {
			int randomNum = (int) (Math.random() * lottoBall.length);
			if(lottoBall[randomNum] == 0) {
				lottoBall[randomNum] = 1;
				System.out.print(" (" + (randomNum+1) + ")");
				check++;
			}
		}
	}
}
