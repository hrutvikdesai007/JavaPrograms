import java.util.Scanner;
public class jagged {
  public static void main(String[] args) {
	int n;
	Scanner input = new Scanner(System.in);		System.out.println("Enter number of players");
	n = input.nextInt();
	int sum=0;		
	float[] avg = new float[n]; 
	int info[][]=new int[n][];

	for(int i=0;i<n;i++) {
System.out.println("Enter no. of matches played by player "+(i+1));
	int m = input.nextInt();
	info[i] = new int[m];
	System.out.println("Enter runs scored in each match:");

		for(int j=0;j<m;j++) {
			info[i][j] =input.nextInt();
			sum = sum + info[i][j];
			}
		avg[i]=(((float)sum)/m);
		sum=0;
		}
		System.out.println();
	//length() function returns the length of the array.....
		for(int i=0;i<info.length;i++) {
			System.out.printf("Player "+(i+1)+" scored: ");
			for(int j=0;j<info[i].length;j++) {
				System.out.printf(info[i][j]+" ");
			}
			System.out.println("\navg= "+avg[i]);
			System.out.println();
		}
	}
}
 