import java.util.*;
class ShoppingCart
{
	public static void main(String args[])
	{
		Vector<String> v = new Vector<String>();
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		int l = args.length;
		for(int i = 0;i<l;i++)
		{
			v.add(args[i]);
		}
		String s1;
		int ch;
		do
		{
			System.out.println("Choose an option: ");
		    System.out.println("1.Add at a specific location.\n2.Add at the end\n3.Delete\n4.Display\n5.Quit");
		    ch=sc.nextInt();
		    switch(ch)
		    {
		    	case 1: System.out.println("ENTER WHERE YU WANT TO ADD THE ITEM: ");
		    			l=sc.nextInt();
		    			System.out.println("ENTER ITEM: ");
		    			s1=sc2.nextLine();
		    			v.add(l,s1);
		    			break;
		    	case 2: System.out.println("ENTER ITEM: ");
		    			s1=sc2.nextLine();
		    			v.add(s1);
		    			break;
		    	case 3: System.out.println("Enter the index: ");
						int ln=sc.nextInt();
						v.remove(ln);
                    	break;
                case 4: Enumeration enu=v.elements();
						System.out.println("Your shopping list:");
						while(enu.hasMoreElements())
						{
							System.out.println(enu.nextElement());
						}
						break;	
				case 5: System.exit(1);
		    }
		}while(true);
	}
}