package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_demo {

	public static void main(String[] args) {
		
		Map<Integer, String> empMap = new LinkedHashMap<>();
        empMap.put(101, "Arun");
        empMap.put(102, "Divya");
        empMap.put(105, "Riya");
        empMap.put(103, "Ravi");

        System.out.println(empMap); 
	}
}
