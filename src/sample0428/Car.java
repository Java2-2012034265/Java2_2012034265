package sample0428;

public class Car {

	public static int getNumbers(){ return numbers; }
	private String model;
	private String color;
	private int speed;
	
	private int id;
	static int numbers=0;
	
	public Car(String m, String c, int s) {
		model = m;
		color = c;
		speed = s;
		
		id = ++numbers;
	}
	
}
