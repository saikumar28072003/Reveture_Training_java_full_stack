package com.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_hash_set {

	public static void main(String[] args) {
		Set<String> v1 = new LinkedHashSet<>();

        v1.add("Gopi");
        v1.add("Anita");
        v1.add("Ravi");
        v1.add("Anita"); // duplicate - ignored

        System.out.println("Unique visitors in visit order: " + v1);

        System.out.println("Total unique visitors"+v1.size());
        
        System.out.println("Did Kumar visit? " + v1.contains("Kumar"));
        
        System.out.println("\nRemove Ravi: " + v1.remove("Ravi"));
        System.out.println("After removing Ravi: " + v1);
        
        Set<String> d2v = new LinkedHashSet<>();
        d2v.add("Divya");
        d2v.add("Gopi");   // duplicate
        d2v.add("Mubeen");

        v1.addAll(d2v);
        System.out.println("\nAfter addAll (merge day2 visitors): " + v1);
        
        Set<String> blk = new LinkedHashSet<>();
        blk.add("Anita");
        blk.add("Unknown"); // not present

        v1.removeAll(blk);
        System.out.println("After removeAll (blocked removed): " + v1);

        Set<String> vipvis = new LinkedHashSet<>();
        vipvis.add("Gopi");
        vipvis.add("Divya");

        v1.retainAll(vipvis);
        System.out.println("\nAfter retainAll (keep only VIP visitors): " + v1);
        
        System.out.println("\nTraverse visitors using Iterator:");
        Iterator<String> it = v1.iterator();
        while (it.hasNext()) {
            System.out.println("Visitor -> " + it.next());
        }
        
        Object[] arr = v1.toArray();
        System.out.println("\nVisitors converted to Array: " + Arrays.toString(arr));

        
        v1.clear();
        System.out.println("\nAfter clear(): " + v1);
        System.out.println("Is empty after clear? " + v1.isEmpty());

	}

}
