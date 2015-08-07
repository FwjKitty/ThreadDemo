package com.hand.ThreadDemo;

class MyRunnable implements Runnable{

	private String name;
	public MyRunnable(String name){
		this.name = name;
	}
	public void run() {
		for(int i=0; i<1000; i++){
			System.out.println(name+":"+i);
		}
	}
}

public class ThreadDemo02 {

	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable("A");
		MyRunnable r2 = new MyRunnable("B");
		Thread t3 = new Thread(r1);
		Thread t4 = new Thread(r2);
		t3.start();
		t4.start();
	}
}