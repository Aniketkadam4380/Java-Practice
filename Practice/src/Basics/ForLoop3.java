package Basics;
//reverse pattern 1st row 5 star and last row 1 star 
//here we have 5 columns in 1st row  
// consider i= row  j=columns 
public class ForLoop3 {
	public static void main(String[]args) {
		int i;
		int j;
		for(i=1;i<=5;i++) {//it satisfied the condition and it shift to next line 
			for(j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}

}
