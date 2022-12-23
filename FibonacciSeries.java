package org.test;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int f=0;
		int s=1;
		int t=f+s;
		for (int i = 0; i <100; i++) {
			System.out.println(f);
			if (f==144) {
				break;
			}
			t=f+s;
			f=s;
			s=t;
			
		}
		
		
		
		
		
		
	}

}
