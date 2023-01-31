package pointException;

public class ColorPoint extends Point 
{
	String Color;
	
	static String Colours [] = { "Red" , "Green" , "Blue" , "Black" , "Grey" , "Yellow" , "Orange" , "Brown"};
	public ColorPoint() 
	{
		super();
		Color="NA";
	}
	public ColorPoint(int x , int y ,String Color)throws InvalidColourException
	{
		super(x , y);
		//this.Color = Color;
		boolean flag=false;
		for(int i =0 ; i<8 ; i++)
		{
			if(Colours[i] == Color)
			{
				flag=true;
				break;
			}
			
		}
		if(!flag)
		{
		//System.out.println("Color is Available in Colors Array");
		throw new InvalidColourException();
		}
		 
		
			 
			this.Color=Color;
		
	}
	
	
	 
	
	public void Display()
	{
		super.Display();
		System.out.println(Color);
	}

}
