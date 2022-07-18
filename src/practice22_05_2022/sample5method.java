package practice22_05_2022;

public class sample5method 
{
public static void main(String[] args) 
{
	m1();										  // static same class
	
	sample5method s = new sample5method();		// non static same class
	s.m2();
	
	sample6method.m3();							// static with diff class
	
	sample6method s2 = new sample6method();		// non static with diff class
	s2.m4();
	
	
}
	


public static void m1()
{
	System.out.println("abcd");
}

public void m2()
{
	System.out.println("wxyz");
}
}
