package sample0513;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		shape s1 = new shape();
		Rectangle r1 = new Rectangle();
		Circle ci = new Circle();
		
		s1.move(99.99);
		s2.move(111,111);
		c1.move(999.999);
		infor(r1);
		infor(c1);
	}
	
	static void infor(Rectangle r) { r.info();}
	static void infor(Circle c) { c.info();}
}
