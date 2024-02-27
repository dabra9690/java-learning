package OOPconceptpart1;

public class StaticANDnonstatic {
	String name="vivek"; // non static global varibale
	
			static int age=23; // static globla variable

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// how to call static method and variable
       //1.by direct calling 2. by classname
		sum();
		StaticANDnonstatic.sum();
		System.out.println(age);
		System.out.println( StaticANDnonstatic.age);
		//how to call non static methods and variable --by createing object
		
		StaticANDnonstatic obj=new StaticANDnonstatic();
		obj.sendmail();
		System.out.println(obj.name);
	}

	public void sendmail() { // non static mathod
		System.out.println("send mail");
	}
	public  static void sum() //static method
	{
		System.out.println("sub method");
		
	}
}
