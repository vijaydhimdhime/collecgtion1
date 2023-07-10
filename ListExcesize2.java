package com.vijay.collectionlist;

import java.util.ArrayList;
import java.util.List;


public class ListExcesize2 {
	public static void main(String[] args) {
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list2.add("pune");
		list2.add("sangli");
		list2.add("mumbai");
		list2.add("solapur");
		list2.add("village");
		System.out.println("list 1 = "+list1);
		System.out.println("list 2 = "+list2);
		list1.addAll(2, list2);
		System.out.println("list 1 = "+list1);
		
		
		System.out.println("index of pune elements in list2 : "+list2.indexOf("pune"));
		System.out.println("index of solapur elements in list2 : "+list2.indexOf("solapur"));
		System.out.println("index of zero elements is in list2 : "+list2.get(0));
		System.out.println("index of 3rd elements is in list2 : "+list2.get(3));
		System.out.println("index of 4th elements is in list1 : "+list1.get(1));
		System.out.println(list1.get(2));
		System.out.println(list1);
	}

}
