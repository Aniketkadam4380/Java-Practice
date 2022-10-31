package Basics;
import java.util.Scanner;

public class Logicalop {
	
	public static void main(String[]args) {
		int a;
		int b;
		Scanner S = new Scanner(System.in);
		a=S.nextInt();
		b=S.nextInt();
		if(a>b && b<a) {
		System.out.println("Value of a is maximum");
		}
		else {
			System.out.println("Value of a is mimimum");
		}
		S.close();
		}
		
		
	}
	
	


