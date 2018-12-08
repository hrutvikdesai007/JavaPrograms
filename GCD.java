import java.util.*;

class abc
{
  int GCD(int a,int b)
   {
	if(a>b)
	{
	return GCD(a-b,b);
	}
	  
	else if(b>a)
	{
	return GCD(a,b-a);
	}	
	else
	{
	return a;
	}
   }
}

class GCD
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		abc ob1=new abc();
		System.out.println("Enter the first number:- ");
		a=sc.nextInt();
		System.out.println("Enter the second number:- ");
		b=sc.nextInt();
		int gcd=ob1.GCD(a,b);
		int lcm=(a*b)/gcd;
		System.out.println("The GCD IS: " + gcd);
		System.out.println("The LCM IS: " + lcm);
	}
}

		
	
	  
  
	  

 