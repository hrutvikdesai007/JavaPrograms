import java.util.*;

class Thread1 implements Runnable
{
    Thread t=new Thread(this);
	Thread1()
		{
			t.start();
		}
		int rand;
		int Randomno()
		{
			rand = (int)(Math.random() * 100) + 1; 
			return rand;
		}
	public void run()
	{}
}

class eventhread implements Runnable
{
	int i;
	public void read1(int i)
	{
		this.i=i;
	}
	public void run()
	{
		System.out.println("Square of even number "+i+": "+(i*i));
	}
}

class oddthread implements Runnable
{
	int j;
	public void read2(int j)
	{
		this.j=j;
	}
	public void run()
	{
		System.out.println("Cube of odd number "+j+": "+(j*j*j));
	}
}

class multithread{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int c,k;
	    Thread1 t1=new Thread1();
	    eventhread eve=new eventhread();
	    oddthread odd=new oddthread();
	    System.out.println("Enter the number of times random number is to be generated: ");
	    c=sc.nextInt();
	    int num;
	    for(k=0;k<c;k++)
	    {
		    num=t1.Randomno();
		    if(num%2==0)
		    {
			    eve.read1(num);
			    eve.run();
		    }
		    else if(num%2==1)
		    {
			    odd.read2(num);
			    odd.run();
		    }
	    }
	}
}