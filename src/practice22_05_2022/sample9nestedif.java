package practice22_05_2022;

public class sample9nestedif 
{
	public static void main(String[] args) 
	{
		int age=19;
		int wt=45;
		
		if(age>=18)
		{
			System.out.println("age is valid");
			if(wt>=50)
			{
				System.out.println("valid wt and age for blood donation ");
			}
			else
			{
				System.out.println("valid wt and age not valid for not go to blood donation");
			}
		}
		else
		{
		System.out.println("you  age are not valid for blood donation");
		}
		
		
		
	}

}
