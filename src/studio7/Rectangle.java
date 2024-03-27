package studio7;

import java.util.Scanner;

public class Rectangle {
public static void main (String [] args) {
	System.out.println("Give a width");
	Scanner in = new Scanner(System.in);
	int w = in.nextInt();
	
	System.out.println("Give a length");
	int l = in.nextInt();
	
	if (l == w) {
		System.out.println("I am a square!");
	}
	else {
		System.out.println("Not a square");
}
	int area = l * w;
	int perimeter = l + w + l + w;
	
	System.out.println("area = " + area);
	System.out.println("perimeter = " + perimeter);
	
	System.out.println("Give another width");
	int w2 = in.nextInt();
	
	System.out.println("Give another length");
	int l2 = in.nextInt();
	
	int area2 = w2 * l2;
	
	if(area > area2) {
		System.out.println("First rectangle is bigger");
	}
	else if(area < area2) {
		System.out.println("Second rectangle is bigger");
	}
	else {
		System.out.println("Rectangles are same size");
	}
	
	}
}