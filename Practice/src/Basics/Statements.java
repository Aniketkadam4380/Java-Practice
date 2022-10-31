package Basics;
import java.util.Scanner;
public class Statements {
	
public static void main(String[]args) {
	int n;
	Scanner Sc=new Scanner(System.in);
	System.out.print("Enter the number here:");
	n=Sc.nextInt();
	if (n>0){
		System.out.println(n+":Is Positive number");
	}
	else if (n<0){
		System.out.println(n+":Is Negative number ");
	}
	else {
		System.out.println("Its Zero");
	}
	Sc.close();
}
}
