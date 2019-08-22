package org.sample;

public class Abstract extends Sravan{
	public void deposit() {
		System.out.println("deposit is 6%");
	}
	public void fixed() {
		System.out.println("fixed is 2%");
	}
public static void main(String[] args) {
	Abstract a=new Abstract();
	a.deposit();
	a.fixed();
	a.saving();
}
}
