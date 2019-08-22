package Employee.java;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Colle {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList();
		List<Integer>l1=new LinkedList();
		li.add(10);
		li.add(20);
		li.add(10);  
		li.add(50);
		System.out.println(li);  
		int j=li.size();
		System.out.println(j);
		System.out.println("list2");
		l1.addAll(li);
		System.out.println(l1);
		li.add(2,30);
		System.out.println(li);
		int i=li.get(2);
		System.out.println(i);
		int k=li.lastIndexOf(10);
		System.out.println(k);
		l1.removeAll(li);
		System.out.println(l1);
		l1.retainAll(li);
		System.out.println(l1);
		boolean c=l1.isEmpty();
		System.out.println(c);
		boolean d=l1.contains(20);
		System.out.println(d);
				}

}
