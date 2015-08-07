package com.hand.ThreadDemo;

class MyThread extends Thread{

	private String name;
	public MyThread(String name){
		this.name = name;
	}
	
	public void run(){
		for(int i=0; i<1000; i++){
			System.out.println(name+":"+i);
		}
		super.run();
	}
}

public class ThreadDemo01 {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("a");
		MyThread t2 = new MyThread("b");
		t1.run();
		t2.run();
		//线程的启动是通过start()方法
		t1.start();
		t2.start();
	}
}