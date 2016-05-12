package sample0512;

public class Animal {
	protected double weight;
	protected String picture;
	
	public Animal() {weight = 99; picture = "Animal";
	      System.out.println("Animal Cont");
	}
	
	
	
	public Animal(double weight, String picture) {
		 // super() 뺏다.
		this.weight = weight;
		this.picture = picture;
		System.out.println("Animal Cont2");
	}



	void eat(){  System.out.println("eat()가 호출되었음"); }
	void sleep() {  System.out.println("sleep()가 호출되었음");}

}
