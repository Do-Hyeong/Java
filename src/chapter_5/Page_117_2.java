package chapter_5;

public class Page_117_2 {
	public static void main(String[] args) {
		String[] a1 = new String[] {"도형", new String("동현"), new String("서울특별시"), "서초구", "염곡말길"};
		System.out.println("a1[3] : " + a1[3]);
		System.out.println("length : " + a1.length);

		a1[3] = "경기도";
		System.out.println("a1[3] : " + a1[3]);
		System.out.println("length : " + a1.length);
	}
}
