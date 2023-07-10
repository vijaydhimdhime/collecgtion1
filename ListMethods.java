package com.vijay.collectionlist;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
	public static void main(String[] args) {
		List list1 = new ArrayList(20);
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		System.out.println("list 1 : "+list1);
		list1.add(4, "pune");
		System.out.println("list 1 : "+list1);
		
		
		List list2 = new ArrayList();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		list2.addAll(list1);
		System.out.println("list 2 : "+list2);
		
		list2.addAll(1, list1);
		System.out.println("list 2 : "+list2);

		
		
	}

}
