package com.usina.Singleton.shadow;

public class ThreadA extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("线程A开始=================");
		Singleton.getInstance().myFunction();
		Singleton.getInstance().setName("中国人");
		super.run();
	}
}
