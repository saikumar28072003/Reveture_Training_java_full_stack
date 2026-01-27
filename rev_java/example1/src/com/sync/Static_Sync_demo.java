package com.sync;

class Table {
    synchronized static void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i + " by " + Thread.currentThread().getName());
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
class T1 extends Thread{public void run() {Table.printTable(1);}}
class T2 extends Thread{public void run() {Table.printTable(10);}}
public class Static_Sync_demo {

	public static void main(String[] args) {
		
		new T1().start();
		new T2().start();
	}
}
