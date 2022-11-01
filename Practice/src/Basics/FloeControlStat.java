package Basics;

public class FloeControlStat {
	public static void main (String[]args) {
		int i;
		int j;
		for(i=1;i<=3;i++) {
			for(j=1;j<=3;j++) {
				if (i==2&&j==2) {
					continue;
				}
				System.out.println(i+ " "+j);
			}
			
		}
	}

}
