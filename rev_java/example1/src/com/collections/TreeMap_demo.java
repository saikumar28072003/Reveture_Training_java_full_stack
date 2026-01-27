package com.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_demo {

	public static void main(String[] args) {
		
		Map<Integer, String> rankMap = new TreeMap<>();
        rankMap.put(3, "Ravi");
        rankMap.put(1, "Arun");
        rankMap.put(2, "Divya");

        System.out.println(rankMap);
	}
}
