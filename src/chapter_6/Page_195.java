package chapter_6;

public class Page_195 {
	int num1;
	int num2;
	String s1;
	
	public Page_195() {
		this(3, 6);
//		page_195(3, 6);
	}
	
	public Page_195(int n1, int n2) {
		num1 = n2 + n1;
		num2 = n2 - n1;
		this.printThis();
	}
	
	public void printThis() {
		System.out.println("참조변수 this : " + this);
	}
	
	public static void main(String[] args) {
		Page_195 p = new Page_195();
		System.out.println("참조변수 p : " + p);

		System.out.println(p.num1);
		System.out.println(p.num2);
		
		Page_195 p2 = new Page_195();
		System.out.println("참조변수 p2 : " + p2);
	}
}
