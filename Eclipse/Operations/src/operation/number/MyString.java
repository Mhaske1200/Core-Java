package operation.number;

import operation.StringOperations;

public class MyString implements StringOperations 
{

	@Override
	public void reverse(String str) {
		String s1="";
		for( int i = str.length()-1 ; i >=0 ; i--)
		{
			s1 += str.charAt(i);
		}
		System.out.println(s1);
	}

	@Override
	public void toUpperCase(String str) {
		for(int i = 0 ; i <str.length()-1 ; i++)
		{
		if(str.charAt(i) >=65 && str.charAt(i) <=90)
		{
			System.out.println(str.charAt(i)+ " is of UpperCase");
		}
		else
		{
			System.out.println(str.charAt(i)+ " is of LowerCase");
		}
		}
	}

	@Override
	public int length(String str) {
		int x = str.length();
		return x;
	}

	@Override
	public boolean isPallindrome(String str) {

		int n = str.length();
		boolean flag = false;
		for (int i = 0; i < n / 2; i++)
		{
			if (str.charAt(i) != str.charAt(n - i - 1))
			{
				flag = true;
				break;
			}
		}
		return flag;
	}

	@Override
	public String append(String str1, String str2) {
		String a = str1.concat(str2);
		return a;
	}

}
