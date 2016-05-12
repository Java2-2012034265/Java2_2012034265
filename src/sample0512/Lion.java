package sample0512;

public class Lion extends Animal {

	private int legs;
	
	public Lion() {
		super(); // 부모 생성자를 호출한다. 생성자가 여러가지일때 명시적으로 특정 생성자 호출하려고 사용한다; super 뒤에 () 아무것도 없으므로  부모 생성자 중에 () 생성자가 돌아감, super(100,"KING") 이면 인자 있는 생성자가 돌아감.
		this.legs = 4;
	}
	void roar() { System.out.println("roar()가 호출되었음");}
	void infor() {System.out.println(weight+" "+picture);}
	
}
