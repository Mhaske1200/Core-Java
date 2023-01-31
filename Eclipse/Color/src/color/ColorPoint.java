package color;

public class ColorPoint extends Point 
{
	String Color;
	boolean flag;
	static String Colours [] = { "Red" , "Green" , "Blue" , "Black" , "Grey" , "Yellow" , "Orange" , "Brown"};
	public ColorPoint() 
	{
		super();
		Color="NA";
	}
	public ColorPoint(int x , int y ,String Color) 
	{
		super(x , y);
		this.Color = Color;
		
		for(int i =0 ; i<8 ; i++)
		{
			if(Colours[i] == Color)
			{
				flag=true;
				break;
			}
			
		}
		if(flag)
		{
		//System.out.println("Color is Available in Colors Array");
		this.Color=Color;
		}
		else
		{
			//System.out.println("White Color");
			this.Color="White";
		}
	}
	
	
	@Override
	public String toString() 
	{
		return super.toString()+ "ColorPoint [Color=" + Color + "]";
	}
	
	public void Display()
	{
		super.Display();
		System.out.println(Color);
	}
	
}
