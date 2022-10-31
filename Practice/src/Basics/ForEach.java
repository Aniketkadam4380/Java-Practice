package Basics;
// for each loop mainly used  to fetch the value from the collection like array 
public class ForEach {
	public static void main (String[]args) {
		int a[]= {10,29,30,54,87};
		for (int b:a) {
			System.out.println(b);
			System.out.println("With simple for loop:");
			//what if we use for loop instead of for each loop so we need to give index instead of element for initialization 
			
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);//indexing 
		}
		
	}

}
