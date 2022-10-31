package Basics;
import java.util.Scanner;

public class Ternaryop {
	public static void main (String[]args) {
		int n;
		int m;
		int Max;
		Scanner S =new Scanner(System.in);
		System.out.print("Enter first number:");
		n=S.nextInt();
		System.out.print("Enter second number:");
		m=S.nextInt();
		System.out.println("**********************");
		System.out.println("First number;"+n);
		System.out.println("Second number:"+m);
		Max=(n>m)? n:m ; // meaning its asking to check n is greater than m i.e ? part in next part if n is greater then print n  :(or) (else) 
		System.out.println("Maximum nubmer is: "+Max); //print m. we can use this operators in place of if.. else statements 
		S.close();
		
		
		
		
	}

}
