
                                  /*add integer and string elements in a list without generic*/
package com.vijay.collectionlist;

import java.util.ArrayList;
import java.util.List;

public class ListExcesize {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add("pune");
		al.add("solapur");
		System.out.println("al = "+al);
		al.add(50);
		System.out.println("al = "+al);
		
	}

}
