package com.hand.ThreadDemo;

class RunnableDemo implements Runnable{

	private String name;
	public RunnableDemo(String name){
		this.name = name;
	}
	public void run() {
		for(int i=0; i<50; i++){
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			//System.out.println("当前线程对象："+Thread.currentThread().getName());
			
			System.out.println(name+":"+i);
			if(i == 10){
				System.out.println("礼让");
				Thread.yield();
			}
		}
	}
	
}

public class ThreadDemo03 {

	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo("a");
		RunnableDemo r2  =new RunnableDemo("b");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		//System.out.println("线程t1是否启动："+t1.isAlive());
		t1.start();
		t2.start();
		//System.out.println("线程t1是否启动："+t1.isAlive());
		/*for(int i=0; i<50; i++){
			if(i>10){
				try {
					t1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("主线程："+i);
		}*/
	}
}