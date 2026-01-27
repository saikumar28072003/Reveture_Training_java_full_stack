package com.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vector_demo2 {
	public static void main(String[] args) {

		Vector<String> tickets = new Vector<>();
		
		tickets.add("TKT1001");
		tickets.add("TKT1002");
		tickets.add("TKT1003");
		tickets.add("TKT1004");
		tickets.add("TKT1005");
		tickets.add("TKT1006");
		tickets.add("TKT1007");
		tickets.add("TKT1008");
		tickets.add("TKT1009");
		tickets.add("TKT10010");
		
		System.out.println("Initial Tickets: " + tickets);
		tickets.add(1, "TKT9999");
		System.out.println("After inserting high priority: " + tickets);
		
		System.out.println("Total tickets: " + tickets.size());
		System.out.println("Contains TKT1002? " + tickets.contains("TKT1002"));
		System.out.println("Ticket at index 2: " + tickets.get(2));
		tickets.set(2, "TKT2002");
		System.out.println("Index of TKT1003: " + tickets.indexOf("TKT1003"));
		
		tickets.remove("TKT1001");
		System.out.println("After resolving TKT1001: " + tickets);
		
		tickets.remove(0);
		System.out.println("After removing ticket at index 0: " + tickets);
		
		Vector<String> escalatedTickets = new Vector<>();
		escalatedTickets.add("ESC5001");
		escalatedTickets.add("ESC5002");
     
		tickets.addAll(escalatedTickets);
		System.out.println("After adding escalated tickets: " + tickets);
		
		Vector<String> urgentTickets = new Vector<>();
		urgentTickets.add("URG7001");
		urgentTickets.add("URG7002");
		urgentTickets.add("URG7003");
		urgentTickets.add("URG7004");
		urgentTickets.add("URG7005");
		urgentTickets.add("URG7006");
		urgentTickets.add("URG7007");
		urgentTickets.add("URG7008");
		urgentTickets.add("URG7009");
		urgentTickets.add("URG7010");
		urgentTickets.add("URG7011");
		urgentTickets.add("URG7012");
		
		tickets.addAll(1, urgentTickets);
        System.out.println("After inserting urgent tickets at index 1: " + tickets);
        System.out.println("First Ticket: " + tickets.firstElement());
        System.out.println("Last Ticket: " + tickets.lastElement());
        
        System.out.println("elementAt(2): " + tickets.elementAt(2));

        
        tickets.removeAll(escalatedTickets);
        System.out.println("After removing escalated tickets: " + tickets);
        System.out.println("Is ticket queue empty? " + tickets.isEmpty());
        
        System.out.println("\nTickets using Iterator:");
        Iterator<String> it = tickets.iterator();
        while (it.hasNext())System.out.println("Ticket -> " + it.next());
        
        System.out.println("\nTickets using Enumeration:");
        Enumeration<String> e = tickets.elements();
        while (e.hasMoreElements())System.out.println("Ticket => " + e.nextElement());
        
        System.out.println("\nCapacity (internal size): " + tickets.capacity());
        
        System.out.println("Capacity after ensureCapacity(20): " + tickets.capacity());
        
        tickets.trimToSize();
        System.out.println("Capacity after trimToSize(): " + tickets.capacity());

        // clear() - Clear all tickets (end of day reset)
        tickets.clear();
        System.out.println("\nAfter clear(): " + tickets);
        System.out.println("Is empty after clear? " + tickets.isEmpty());


	}
}
