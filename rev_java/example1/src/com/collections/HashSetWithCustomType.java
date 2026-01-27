package com.collections;

import java.util.HashSet;
import java.util.Set;

class student1 {
	int id;
	String email;
//alt+shift+r to change word of occurance at onces
	student1(int id, String email) {
		this.id = id;
		this.email = email;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof student1))
			return false;
		student1 other = (student1) o;
		return this.id == other.id; // unique by id
	}

	public int hashCode() {
		return Integer.hashCode(id);
	}

	public String toString() {
		return id + "-" + email;
	}
}

class emp {
	int id;

	public emp(int id) {
		this.id = id;
	}
}

public class HashSetWithCustomType {

	public static void main(String[] args) {

		Set<student1> students = new HashSet<>();
		students.add(new student1(101, "arun@gmail.com"));
		students.add(new student1(102, "divya@gmail.com"));
		students.add(new student1(101, "arun_new@gmail.com")); // duplicate by id

		System.out.println(students);
		System.out.println("Total unique students: " + students.size());
		
		student1 s1=new student1(103,"Gem");
		
		student1 s2=new student1(101, "arun@gmail.com");
		student1 s3=new student1(102, "divya@gmail.com");
		student1 s4=new student1(103,"Geetha@mail.com");
		emp e1=new emp(103);
		students.add(s1);
	    // 1) Print hashCodes before adding
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
        System.out.println("s3 hashCode: " + s3.hashCode());
        
        System.out.println("\nManual equals checks:");
        System.out.println("s1.equals(e1)? " + s1.equals(e1)); // true (same id)
        System.out.println("s1.equals(s2)? " + s1.equals(s2)); // false
        
        
        // print Each student Hashcode
        for(student1 st:students)
        {
        	System.out.println(st + " ->  hashcode "+st.hashCode());
        }
		
	}

}
