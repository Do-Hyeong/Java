package chapter_6;

public class Page_198_2 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1);

		System.out.println("기본 c1 : " + c1);
		System.out.println("복제 c2 : " + c2);
		
		System.out.println(c1.color + " / " + c1.gearType + " / " + c1.door);
		System.out.println(c2.color + " / " + c2.gearType + " / " + c2.door);
	}
}

class Car {
	String color;
	String gearType;
	int door;
	
	Car() {
		this("White", "Auto", 4);
		System.out.println("기본 생성자로 객체 생성 this : " + this);
	}
	
	Car(String color) {
		this(color, "Auto", 4);
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car car) {
		color = car.color;
		gearType = car.gearType;
		door = car.door;
		System.out.println("Car car로 객체 복사 this : " + this);
	}
}