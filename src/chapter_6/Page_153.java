package chapter_6;

class Page_153 {
	public static void main(String[] args) {
		Tv tv1 = new Tv();
		Tv tv2 = new Tv();

		System.out.println("tv1의 채널 : " + (tv1.channel = 4));
		System.out.println("tv2의 채널 : " + tv2.channel);
		System.out.println("tv1의 채널을 " + tv1.channelUp() + "로 변경");
		tv2 = tv1;
		System.out.println("tv2의 채널 : " + tv2.channel);
		tv1.channelDown();
		System.out.println("tv2의 채널 : " + tv2.channel);
		
		
	}
	
	public static void main3(String[] args) {
		Tv tv1 = new Tv("Black");
		Tv tv2 = new Tv("Silver");
		
		System.out.println("TV1의 현재 채널은 " + tv1.channel + "입니다.");
		System.out.println("TV2의 현재 채널은 " + tv2.channel + "입니다.");
		System.out.println("TV1의 채널을 " + (tv1.channel=7) + "로 변경하였습니다.");
		System.out.println("TV1의 현재 채널은 " + tv1.channel + "입니다.");
		System.out.println("TV2의 현재 채널은 " + tv2.channel + "입니다.");
	}
	
	public static void main2(String[] args) {
		Tv tv = new Tv();
		tv.channel = 7;
		System.out.println("현재 채널은 " + tv.channelDown() + "입니다.");
	}
}

class Tv {
	String color;
	boolean power;
	int channel;

	Tv() {
	}
	
	Tv(String color) {
		this.color = color;
	}
	
	String power() {
		this.power = !this.power;
		if(power) {
			return "On";
		} else {
			return "Off";
		}
	}
	
	int channelUp() {
		return ++this.channel;
	}
	
	int channelDown() {
		return --this.channel;
	}
}
