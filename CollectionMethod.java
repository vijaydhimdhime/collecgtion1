package com.vijay.collectionlist;

import java.util.ArrayList;

public class CollectionMethod {
	public static void main(String[] args) {
		ArrayList color = new ArrayList();
		color.add("Red");
		color.add("Pink");
		color.add("White");
		color.add("Yellow");
		color.add("Green");
		System.out.println("color = "+color);
		ArrayList color2 = new ArrayList();
		color2.addAll(color);
		System.out.println("color2 = "+color2);
	//	color2.clear();
		System.out.println("color2 = "+color2);
		
		System.out.println(color.contains("black"));
		
		System.out.println(color.containsAll(color));
		ArrayList color3 = new ArrayList();
		color3.add(10);
		color3.add(20);
		color3.add("pune");
		System.out.println("color3 = "+color3);
		System.out.println("equals methods for color and color3 = "+color.equals(color3));
		System.out.println("equals methods for color and color2 = "+color.equals(color2));
		color2.remove(2);
		System.out.println("color2 = "+color2);
		System.out.println("equals methods for color and color2 = "+color.equals(color2));
		System.out.println("hash code for color = "+color.hashCode());
		System.out.println("hash code for color 2 = "+color2.hashCode());
		System.out.println("hash code for color 3 = "+color3.hashCode());
		System.out.println("color list is empty : "+color.isEmpty());
		//color2.clear();
		System.out.println("color 2 is empty = "+color2);
		System.out.println(color.iterator().getClass().getName());
		System.out.println(color3);
		System.out.println("call remove method : "+color3.remove(2));
		System.out.println("color 3 = "+color3);
		System.out.println("call removeAll method on color 3 = "+color3.removeAll(color3));
		System.out.println("after call removeAll method on color 3 = "+color3);
		System.out.println("color 2 = "+color2);
		System.out.println("color 3 = "+color3);
		System.out.println("color  = "+color);
		color.remove(0);
		System.out.println("remove after index 0 = "+color);
		//color.remove(color);
		System.out.println("remove after call remove method on object = "+color.remove("Pink"));
		System.out.println("color = "+color);
		//color.retainAll();
		System.out.println("color 2 = "+color2);
		color.retainAll(color2);
		System.out.println("color = "+color);
		System.out.println("color 2 = "+color2);
		System.out.println("call size method on color = "+color.size());
		System.out.println("call size method on color 2 = "+color2.size());
		
		System.out.println("call toArray method on color = "+color.toArray());
		//System.out.println(color.add("10"));
//		System.out.println(color.add("10"));
//		System.out.println(color);
//		System.out.println("colors : "+color);
//		color.add("Gray");
//		System.out.println(color);
//		color.add(0, "water");
//		System.out.println("colors : "+color);
//		ArrayList al = new ArrayList();
//		al.add(10);
//		al.add(20);
//		al.add(30);
//		System.out.println(al);
//		ArrayList al2 = new ArrayList();
//		al2.addAll(color);
//		System.out.println("after changes : "+al2);
		
	}

}
