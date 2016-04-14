package sample0414;

public class Car {
	private int man;
	private int tire;
	private String color;
	
	public void setman(int man){ //private 니까 Human에서 접근못함 -> public 만들어서 이걸 통해서 Human이 접근하도록 함
		this.man=man; // man=man인데 무엇이 위에서 말하는 man인지 모르겟다. this 붙임
	}
	public int getman() { System.out.println(man);return man;} // man 값을 보고싶다. 이름이 무조건 getman일 필요 없음. return이 있으므로 int 썼음.
	public void all_setting(int tire, String color){      // tire와 color 한꺼번에
		this.tire = tire;
		this.color = color;
	}
	void pr(){
		System.out.println("man: "+man+" tire: " +tire+" color : "+color); 
	}

	public Car() {this(4,3,"red");} //man = 4; tire = 3; color = "red"; } // 아무것도 안주고 car 만들면 저절로 4, 3 red
	//여기서 this는 밑에 this를 말한다.
	public Car(int man, int tire, String color){       //자동차를 만듦과 동시에 갑을 주자. 생성자에는 void 안쓴다.
		this.man = man;
		this.tire =tire;
		this.color = color;
	}
}
