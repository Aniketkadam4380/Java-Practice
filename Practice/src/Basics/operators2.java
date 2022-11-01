package Basics;

public class operators2 {
	public void leftshift() {
		int r=8; 
		int c=r<<3; 
		System.out.println(c);
	}
	public static void main (String[]args) {
		int a=8;
		int b=a>>2;
		System.out.println(b);
		operators2 op=new operators2();
		op.leftshift();
		
		
	}
	

}
