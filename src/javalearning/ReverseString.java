package javalearning;

public class ReverseString {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String s= "Selenium";
		int len=s.length();
		String rev ="";
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		//vivek
System.out.println(rev);
StringBuffer sf=new StringBuffer(s);
System.out.println(sf.reverse());

	}

}
