package sample0512;

public class Lion extends Animal {

	private int legs;
	
	public Lion() {
		super(); // �θ� �����ڸ� ȣ���Ѵ�. �����ڰ� ���������϶� ��������� Ư�� ������ ȣ���Ϸ��� ����Ѵ�; super �ڿ� () �ƹ��͵� �����Ƿ�  �θ� ������ �߿� () �����ڰ� ���ư�, super(100,"KING") �̸� ���� �ִ� �����ڰ� ���ư�.
		this.legs = 4;
	}
	void roar() { System.out.println("roar()�� ȣ��Ǿ���");}
	void infor() {System.out.println(weight+" "+picture);}
	
}
