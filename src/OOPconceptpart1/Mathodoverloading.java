package OOPconceptpart1;

public class Mathodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mathodoverloading obj= new Mathodoverloading();
		obj.sum(0);
		obj.sum(10);
		obj.sun(8, 9);
		
		   

	}
	public void sum() {
		System.out.println("sum method--zero param");
	}
	public void sum(int i) {
		System.out.println("sum method");
		System.out.println(i);
	}
	public void sun(int k,int r) {
		System.out.println("sum method");
		System.out.println(k+r);
	}

}
