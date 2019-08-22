package org.greens.test;

import java.util.Scanner;

public class Scclass {
	public static void main(String[] args) {
		int a=0,b=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of v:" );
		int v=sc.nextInt();
		for(int i=0;i<=v;i++) {
			v=a+b;
			System.out.println(v+"");
			a=b;
		    b=v;
			
		}
	}

}
