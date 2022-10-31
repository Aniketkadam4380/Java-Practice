package Basics;

public class Variables2 {
	static int a=10; // Static variable 
	//int b=10; // instance variable or global variable 
public 	void run() {
		int b=10;//local variable
		System.out.println(a+" "+b);
		++a; ++b;
}
	
	
public static void main(String args[]) {
	Variables2 ob=new Variables2();
	ob.run();
	ob.run();
}
}
// As we know that memory allocation for the instance variable happens only once so first time when we execute
//the program then it prints 10,10 after that it increment the values by 1 for each i.e 11 11 when second time
// we run program it prints 11 for static variable cause its incremented previously and we know that (1st line)
// but for local variable it erase the previous incremented value and create the new memory location and print
//10