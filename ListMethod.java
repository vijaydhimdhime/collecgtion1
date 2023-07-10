package com.vijay.collectionlist;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
	public static void main(String[] args) {
		List al = new ArrayList();
		//add elements
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		System.out.println("after adding elements al = "+al);
		al.add(110);
		System.out.println("after adding again one more elements is in al List :: al = "+al);
		al.add(0, 0);
		System.out.println("after adding again one more elements is in al List :: al = "+al);
		al.add(6, 55);
		System.out.println("after adding again one more elements is in al List at index 6 :: al = "+al);
	//	al.addAll(al);
		List newal = new ArrayList();
		newal.addAll(al);
		System.out.println("                                                              newal = "+newal);
		//System.out.println(al);
		List al1 = new ArrayList();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add("D");
		System.out.println("al 1 = "+al1);
		newal.addAll(5, al1);
		System.out.println("newal = "+newal);
		newal.remove(0);
		System.out.println("after removing index zero of newal = "+newal);
		newal.get(6);
		System.out.println(newal.get(8));
		System.out.println(newal.indexOf("A"));
		System.out.println(newal.indexOf(55));
		System.out.println(newal.indexOf(110));
		System.out.println(newal.lastIndexOf(40));
		newal.set(2, 2000);
		System.out.println("newal = "+newal);
		
	}

}
