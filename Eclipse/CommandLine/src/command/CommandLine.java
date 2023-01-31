package command;

public class CommandLine {

	public static void main(String[] args) 
	{
		int num1;
		int num2;
		
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
		
		System.out.println("Addition = "+(num1+num2));
		System.out.println("Substraction = "+(num1-num2));
		System.out.println("Multiplication = "+(num1*num2));
		System.out.println("Division = "+(num1/num2));
		System.out.println("MOD = "+(num1%num2));
		 
	}

}
