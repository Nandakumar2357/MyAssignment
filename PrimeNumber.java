package org.test;

public class PrimeNumber {
	public static void main(String[] args) {
	
		int num=11;
		int count=0;// 2
		for (int i=1; i <=num; i++) {
			if(num%i == 0) { // 8/1, 8/2,8/3, 8/4.......8/8
				count++;
			}
		}
			if(count==2) { //4 == 2
			System.out.println(num + " is a Prime Number");
		}else {
			System.out.println(num+ " is not Prime Number");
		}
		
		
	}

}
