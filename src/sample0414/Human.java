package sample0414;

public class Human {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car();
		//c1.man = 4;
		//c1.tire =3;
		//c1.color = "red";
		
		c1.setman(4);
		c1.getman();
		c1.all_setting(3, "red"); // ±ÍÂú´Ù Å¸ÀÌ¾î¶û »ö ÇÑ²¨¹ø¿¡ 
		c1.pr();
		
		Car c2 = new Car(3, 4, "white");
		c2.pr();

	}

}
