package com.hand.ThreadDemo;

class MyThreadDemo implements Runnable{
	
	private int ticket = 5;
	public void run(){
		for(int i=0; i<10; i++){
			//同步代码块
			/*synchronized(this){
				if(ticket > 0){
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("车票："+ticket--);
				}
			}*/
			tell();
		}
	}
	//同步方法
	public synchronized void tell(){
		if(ticket > 0){
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("车票："+ticket--);
		}
	}
}

public class ThreadDemo05 {
	public static void main(String[] args) {
		MyThreadDemo mt = new MyThreadDemo();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		Thread t3 = new Thread(mt);
		
		t1.start();
		t2.start();
		t3.start();
	}
}