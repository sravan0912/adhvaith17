package org.greens.test;

public class Fibosc {
	public static void main(String[] args) {
		int a=1,b=1;
		int k=0;
		System.out.println("1 1" +"");
		
		while(k<=50) {
			k=a+b;
			System.out.println(k+"");
			a=b;
			b=k;
			
			
			
		}
	}

}
