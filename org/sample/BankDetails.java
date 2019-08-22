package org.sample;

public class BankDetails implements Interface {
	public void deposit() {
		System.out.println("deposit is 3%");
	}
public void saving() {
	System.out.println("saving is 4%");
}
public void fixed() {
	System.out.println("fixed is 7%");
}
public static void main(String[] args) {
	BankDetails b=new BankDetails();
	b.deposit();
	b.fixed();
	b.saving();
}
}
