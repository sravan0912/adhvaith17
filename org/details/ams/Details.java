package org.details.ams;

public class Details {
	//public void empId(String name) {
	//	System.out.println("MY NAME IS"+name);
	//}
	//public static void main(String[] args) {
		//Details d=new Details();
//d.empId("sravanthi");
//	}
public void myData(String name,long phno,String place) {
	System.out.println("My details are" +name);
	System.out.println(phno+place);
}
public static void main(String[] args) {
	Details e=new Details();
	e.myData("Sravanthi",951543782,"hnk");
}
}
