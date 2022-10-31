package Basics;
//its used when we want to execute loop body atleast once even condition is false
public class DoWhile1 {
public static void main(String[]args) {
	int n=1;
	do {
		System.out.println(n);
		++n;
	}while(n<0);
	
}

}
// in this program as we can see that value of n is 1. so as a flow of a program in do condition it will print the value after that, value is incremented
// by 1 so now n=2. after that we enter the while statement then condition becomes false then we exit the program 