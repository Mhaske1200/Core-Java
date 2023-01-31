package VolumeBox.Arr;

public class Box 
{
	private int l;
	private int w;
	private int h;
	
	public Box() 
	{
		l=0;
		w=0;
		h=0;
	}

	public Box(int l, int w, int h) 
	{
		this.l = l;
		this.w = w;
		this.h = h;
	}
	public int display_volume()
	{
		int Volume;
		return Volume= l*w*h;
		//System.out.println("Volume = "+Volume);
		//return Volume;
	}
		
}
