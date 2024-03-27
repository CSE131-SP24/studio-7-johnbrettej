package studio7;
import java.util.Scanner;
public class Die {
	public static void main (String [] args) {
	Scanner in  = new Scanner(System.in);
	System.out.print("How many sides on die?: ");
	int n = in.nextInt();
	

	int r=(int)(Math.random()*n+1);
	System.out.println(r);
	}
}
