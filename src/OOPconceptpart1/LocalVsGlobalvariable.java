package OOPconceptpart1;

public class LocalVsGlobalvariable {
	String name="vivek"; //global vairable
	int age=27;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10; //local variable for main mathod
		LocalVsGlobalvariable obj=new LocalVsGlobalvariable();
		System.out.println(i);
		System.out.println(obj.name);
		System.out.println(obj.age);

	}
	public void sum() {
		int i=10; //local variabl for sum mathod
		int b=20;
		int c=i+b;
		System.out.println(c);
		
	}

}
