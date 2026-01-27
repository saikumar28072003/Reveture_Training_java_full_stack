package com.collections;

import java.util.EnumSet;
import java.util.Set;

public class EnumSet_demo {

	public static void main(String[] args) {
		
		enum permission{READ,WRITE,DELETE,EXPORT};
		
		Set<permission>staff=EnumSet.of(permission.READ,permission.WRITE);

		Set<permission>admin=EnumSet.allOf(permission.class);
		
		System.out.println("Staff permissions: " + staff);
        System.out.println("Admin permissions: " + admin);

        System.out.println("Can staff delete? " + staff.contains(permission.DELETE));

	}

}
