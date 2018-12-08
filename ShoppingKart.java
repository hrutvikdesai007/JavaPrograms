import java.util.*;
class ShoppingKart
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Vector inner=new Vector(10);
		Vector <Vector>outer=new Vector<Vector>();
	
		int n,i,j;
		System.out.println("Enter total no. of items: ");
		n=sc.nextInt();
		String name;
		int id;
		int cost;
		
		for(i=0;i<n;i++)
		{	
		    System.out.println("Enter"+(i+1)+" name: ");
			name=sc.next();
			inner.add(name);
			//sc.next();
			System.out.println("Enter"+(i+1)+" id: ");
			id=sc.nextInt();
			inner.add(id);
			System.out.println("Enter"+(i+1)+" cost: ");
			cost=sc.nextInt();
			inner.add(cost);
			outer.add(inner);
		}
		System.out.println(outer);
		
	}
}