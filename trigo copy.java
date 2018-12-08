package mypack;

public class trigo
{
		public static double sin(int degree)
		{
			if(degree==0)
			{
				return 0;
			}
			else if(degree==30)
			{
				return 0.5;
			}
			else if(degree==60)
			{
				return 0.87;
			}
			else if(degree==90)
			{
				return 1;
			}
			else
			{
				System.out.println("Entered value is not valid for this program!!");
			}
		}
		
		public static double cos(int degree)
		{
			if(degree==0)
			{
				return 1;
			}
			else if(degree==30)
			{
				return 0.87;
			}
			else if(degree==60)
			{
				return 0.5;
			}
			else if(degree==90)
			{
				return 0;
			}
			else
			{
				System.out.println("Entered value is not valid for this program!!");
			}
		}
		
		public static double tan(int degree)
		{
		    if(degree==0)
			{
				return 0;
			}
			else if(degree==30)
			{
				return 0.58;
			}
			else if(degree==60)
			{
				return 1.73;
			}
			else if(degree==90)
			{
				System.out.println("Not Defined");
				return 0;
			}
            else
			{
				System.out.println("Entered value is not valid for this program!!");
				return 0;
			}			
		}
		
		public static double cot(int degree)
		{
			if(degree==0)
			{
				System.out.println("Not defined");
			}
			else if(degree==30)
			{
				return 1.73;
			}
			else if(degree==60)
			{
				return 0.58;
			}
			else if(degree==90)
			{
				return 0;
			}	
			else
			{
				System.out.println("Entered value is not valid for this program!!");
			}
		}
		
		public static double cosec(int degree)
		{
			if(degree==0)
			{
				System.out.println("Not Defined");
			}
			else if(degree==30)
			{
				return 2;
			}
			else if(degree==60)
			{
				return 1.15;
			}
			else if(degree==90)
			{
				return 0;
			}	
			else
			{
				System.out.println("Entered value is not valid for this program!!");
			}
		}
		
		public static double sec(int degree)
		{
			if(degree==0)
			{
				return 1;
			}
			else if(degree==30)
			{
				return 1.15;
			}
			else if(degree==60)
			{
				return 2;
			}
			else if(degree==90)
			{
				System.out.println("Not Defined");
			}	
			else
			{
				System.out.println("Entered value is not valid for this program!!");
			}
		}
				
		
}