package com.hand.ThreadDemo;

class ThRu implements Runnable{
	public void run(){
		for(int i=0; i<5; i++){
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName()+":"+i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo04 {

	
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThRu(),"A");
		Thread t2 = new Thread(new ThRu(),"B");
		Thread t3 = new Thread(new ThRu(),"C");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}