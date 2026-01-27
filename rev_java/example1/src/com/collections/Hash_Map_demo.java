package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hash_Map_demo {

	public static void main(String[] args) {
		
		HashMap h=new HashMap();
		h.put("sai",100);
		h.put("nikhil",100);
		h.put("mubeen",100);
		
		System.out.println(h);
		Set s=h.keySet();
		System.out.println("Output of KeySet");
		System.out.println(s);
		Collection c=h.values();
		System.out.println(c);
		System.out.println("Output of entrySet");
		Set s1=h.entrySet();
		System.out.println(s1);

	}

}
