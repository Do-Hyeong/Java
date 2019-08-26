package chapter_6;

public class Page_207 {
	static int count;
	int serialNo;
	String serial;
	
	public Page_207() {
		count++;
		serialNo = count;
		serial = serialNo + "번째 생성 객체";
	}
	
	public static void main(String[] args) {
		Page_207 p1 = new Page_207();
		Page_207 p2 = new Page_207();
		Page_207 p3 = new Page_207();

		System.out.println(p1.serial);
		System.out.println(p2.serial);
		System.out.println(p3.serial);
	}
}


