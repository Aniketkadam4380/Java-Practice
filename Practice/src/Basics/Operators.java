package Basics;
//Unary operators 
public class Operators {
public static void main(String[]args) {
	int a=10;//local variable
	System.out.println(a);
// we are going to do pre-increment i.e ++a that means 1st we increment the value and then print it 
	System.out.println(++a); //output will be -> 11
    System.out.println(a++); 
 // here we print the value 1st i.e 11 and after that increment it so the output will be 11 
    System.out.println(a--);
 //here the original value is 12 that gonna be print as output and because of post decrementing value will be 11
 System.out.println(--a);
 //output will be 10 cause original value is 11 and here we 1st decrementing the value and printing it after
}
}
