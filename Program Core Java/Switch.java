public class Switch
{
	public static void main(String[] args)
	{
		String day ="Monday";
		switch(day)
		{
		case "Monday" :
		case "Tuesday" :
		case "Wednesday" :
		case "Thursday" :
		case "Friday" :
		{
		System.out.println("WeekDay");
		break;
		}
		case "Saturday" :
		case "Sunday" :
		{
		System.out.println("WeekEnd");
		break;
		}
		}

	}


}