package sample0414;

public class Car {
	private int man;
	private int tire;
	private String color;
	
	public void setman(int man){ //private �ϱ� Human���� ���ٸ��� -> public ���� �̰� ���ؼ� Human�� �����ϵ��� ��
		this.man=man; // man=man�ε� ������ ������ ���ϴ� man���� �𸣰ٴ�. this ����
	}
	public int getman() { System.out.println(man);return man;} // man ���� ����ʹ�. �̸��� ������ getman�� �ʿ� ����. return�� �����Ƿ� int ����.
	public void all_setting(int tire, String color){      // tire�� color �Ѳ�����
		this.tire = tire;
		this.color = color;
	}
	void pr(){
		System.out.println("man: "+man+" tire: " +tire+" color : "+color); 
	}

	public Car() {this(4,3,"red");} //man = 4; tire = 3; color = "red"; } // �ƹ��͵� ���ְ� car ����� ������ 4, 3 red
	//���⼭ this�� �ؿ� this�� ���Ѵ�.
	public Car(int man, int tire, String color){       //�ڵ����� ����� ���ÿ� ���� ����. �����ڿ��� void �Ⱦ���.
		this.man = man;
		this.tire =tire;
		this.color = color;
	}
}
