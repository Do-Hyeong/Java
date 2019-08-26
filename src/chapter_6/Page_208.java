package chapter_6;

public class Page_208 {
	static int count = 0;
	String fileName;
	
	public Page_208() {
		this("제목없음 (" + ++count + ")");
	}
	
	public Page_208(String fileName) {
		this.fileName = fileName;
		System.out.println(fileName + "이(가) 생성되었습니다.");
	}
	
	public static void main(String[] args) {
		Page_208 p1 = new Page_208();
		Page_208 p2 = new Page_208();
		Page_208 page = new Page_208("페이지.page");
		Page_208 p3 = new Page_208();
	}
}
