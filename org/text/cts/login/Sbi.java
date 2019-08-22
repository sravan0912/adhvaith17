package org.text.cts.login;

public class Sbi extends Rbi {
	public void sbiId() {
		System.out.println("my sbi id is 89765");
	}
	public void sbiPd() {
		System.out.println("my sbi pan no is 4356");
	}
public static void main(String[] args) {
	Sbi s=new Sbi();
	s.sbiId(); 
	s.sbiPd();
	s.rbiAd();
	s.rbiPd();
	
}
}
