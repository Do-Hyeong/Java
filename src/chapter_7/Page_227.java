package chapter_7;

public class Page_227 {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		System.out.println("채널 위로...");
		ctv.channerUp();
		System.out.println("캡션 시도");
		ctv.displayCaption("Hello, World!");
		System.out.println("캡션 켜기");
		ctv.caption();
		System.out.println("캡션 시도");
		ctv.displayCaption("Hello, World!");
		
		System.out.println("티비 켜기...");
		ctv.power();
		System.out.println("채널 위로...");
		ctv.channerUp();
		System.out.println("캡션 시도");
		ctv.displayCaption("Hello, World!");
		System.out.println("캡션 켜기...");
		ctv.caption();
		System.out.println("캡션 시도");
		ctv.displayCaption("Hello, World!");
		
		System.out.println("티비 끄기");
		ctv.power();
		System.out.println("캡션 끄기");
		ctv.caption();
		System.out.println("티비 켜기");
		ctv.power();
		System.out.println("캡션 시도");
		ctv.displayCaption("Hello, Space!!");
	}
}

class Tv {
	protected boolean power;
	protected int channer = 10;
	
	public void power() {
		if(power == false) {
			System.out.println("\"Power On\"");
		} else {
			System.out.println("\"Power Off\"");
		}
		power = !power;
	}
	
	public void channerUp() {
		if(power) {
			channer++;
			System.out.println("\"Channer" + channer + "\"");
		}
	}
	
	public void channerDown() {
		if(power) {
			channer--;
			System.out.println("\"Channer" + channer + "\"");
		}
	}
}

class CaptionTv extends Tv {
	private boolean caption;
	
	public void caption() {
		if(power) {
			caption = !caption;
		}
	}
	
	public void displayCaption(String text) {
		if(caption && power) {
			System.out.println(text);
		}
	}
}

class CaptionTvTest {
	
}