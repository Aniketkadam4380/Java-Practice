package Basics;

public class Variables {
int a =10;//public variable or global variable or instance 
static int b =20;//Static variable
public static void main (String args[]) {
	int c=30; //Local
	System.out.println(c);
	System.out.println(Variables.b);
	Variables obj=new Variables();
	System.out.println(obj.a);
	
}



}
// to access global or instance variable we need to create object of a class in main method 
// we can access the static variable w.r.t class name in main method 