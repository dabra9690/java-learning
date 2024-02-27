package OOPconceptpart1;

public class FunctionInjava {

	public static void main(String[] args) {
		
		FunctionInjava obj= new FunctionInjava();
		obj.test();
		obj.pqr();
		// TODO Auto-generated method stub

	}
	// non static methodes 
	// void does not return any value
	//return type void
	public void test() {
		System.out.println("test method");	}

	//return type int
	public int pqr() {
		System.out.println("pqr method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
	}
		
	}

