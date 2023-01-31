package string;
public class Main {

	public static void main(String[] args) 
	{
		String s = new String("Hello World");
		String s1 = new String("Hello World");
		
		System.out.println(s==s1); // False
		System.out.println(s.equals(s1)); // True
		
		String s2 = "Shubham Mhaske";
		String s3 = "Shubham Mhaske";
		String s4 = new String("Shubham Mhaske");
		
		System.out.println(s2==s3); // True
		System.out.println(s3==s4); // False
		System.out.println(s2.equals(s3)); // True
		System.out.println(s3.equals(s4)); // True

	}

}
