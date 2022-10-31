package Basics;

public class LogicalOpp {
	public static void main(String[]args) {
		int a=30;
		int b=20;
		System.out.println((a>b || b>a)); //true:-- in logical OR if first condition is true it dosen't check second condition 
		System.out.println((a<b&& b<a));//false; in logical AND if first condition is false it dosen't check second condition 
		System.out.println((a>b & b>a));//false: in Bitwise And it checks all the conditions 
		System.out.println((a<b |b<a));// true: in Bitwise OR it checks all the conditions 
		
	}
	
	

}
