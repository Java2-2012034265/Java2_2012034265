package sample0519;

public class Class_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P_object[] pob = new P_object[3];
		
		for(P_object temp : pob) { 
		
			pr_all(temp);
			change_all(pob[1],7, 77);
			pr_all(pob[1]);
		}
		
	}

	
	public static void pr_all(P_object temp) { temp.pr(); }
	public static void change_all(P_object temp, int x, int y) {
		temp.change(x, y);;
	}
}
