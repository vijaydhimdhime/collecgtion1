package com.vijay.collectionlist;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethods {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		list1.add(10);//add()
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(60);
		List list2 = new ArrayList();
		list2.add("pune");
		list2.add("solapur");
		list2.add("mumbai");
		list2.add("goa");
		list2.add("usa");
		
		
		System.out.println("list1 : "+list1);
		System.out.println("list2 : "+list2);
		list2.remove("usa");
		System.out.println("list2 : "+list2);
		List list3 = new ArrayList();
		list3.addAll(list2);
		list2.remove("goa");
		System.out.println("list2 : "+list2);
		System.out.println("list3 : "+list3);
		System.out.println(list3.equals(list2));
		
	}


}
