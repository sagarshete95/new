package practice22_05_2022;

public class sample7methodparametr
{
	public static void main(String[] args)
	{
		s1(20,25);
		
		sample7methodparametr s = new sample7methodparametr();
		s.s2(50, 20);
		
		sample8methodparameter.s3(2, 5);
		
		sample8methodparameter s4= new sample8methodparameter();
		s4.s4(10, 5);
		
		square(5);
		
		
	}
	


public static void s1(int a , int b)
{
	int sum=a+b;
	System.out.println(sum);
}
public void s2(int c, int d)
{
	int sub=c-d;
	System.out.println(sub);
}
public static void square(int a)
{
	System.out.println(a*a);
}



}