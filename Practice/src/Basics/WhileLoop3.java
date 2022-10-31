package Basics;
import java.util.Scanner;
public class WhileLoop3 {
	public static void main(String[]args) {
		int i=1;
		int n;
		System.out.print("Enter value for multiplication table:");
		Scanner Sc=new Scanner(System.in);
		n=Sc.nextInt();
		while(i<=10){
			System.out.println(n+"*"+i+" = " +n*i);
			i++;
			
		}
		Sc.close();
	}

}
