package com.usina.Singleton.shadow;

public class ThreadB extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("线程B开始=================");
		Singleton.getInstance().myFunction();
		Singleton.getInstance().updateProperties();
		System.out.println("线程B读属性================="+Singleton.getInstance().getName());
		
		super.run();
	}
}
