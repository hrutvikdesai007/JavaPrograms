import mypack.trigonometry;
import java.util.*;

class trigoexec
{
	public static void main()
	{
		Scanner sc=new Scanner(System.in);
		trigo t= new trigo();
	    System.out.println("1-Sine\n2-Cosine\n3-Tangent\n4-Cotangent\n5-Secant\n6-Cosecant");
		int ch=sc.nextInt();
		double ret=0.00;
		int deg=sc.nextInt();
		switch(ch)
		{
			case 1:ret=t.sin(deg);
				   break;
	        case 2:ret=t.cos(deg);
				   break;
            case 3:ret=t.tan(deg);
				   break;				   
			case 4:ret=t.cot(deg);
				   break;
			case 5:ret=t.sec(deg);
				   break;
		    case 6:ret=t.cosec(deg);
				   break;
			default:System.out.println("Please enter a valid value which this program can compute!!");
			        break;
					
			System.out.println("The answer is: " + ret);
		}
	}
}