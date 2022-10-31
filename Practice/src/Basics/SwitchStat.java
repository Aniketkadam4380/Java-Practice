package Basics;
import java.util.Scanner;

public class SwitchStat {
	public static void main(String[]args) {
		int n;
		Scanner Sc=new Scanner(System.in);
		System.out.print("Enter the number here:");
		n=Sc.nextInt();
		switch(n){
		case 0:
			System.out.println("Its Sunday"); 
			break;
		case 1:
			System.out.println("Its Monday");
			break;
		case 2:
			System.out.println("Its Tuesday");
			break;
		case 3: 
			System.out.println("Its Wednesday");
			break;
		case 4:
			System.out.println("Its Thursday");
			break;
		case 5:
			System.out.println("Its Friday");
			break;
		case 6:
			System.out.println("Its Saturday");
			break;
		default:
			System.out.println("invalid input");
		
		}
		
		Sc.close();
	}

}
