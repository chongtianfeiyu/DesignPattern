package com.usina.Singleton.shadow;

public class ThreadA extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("�߳�A��ʼ=================");
		Singleton.getInstance().myFunction();
		Singleton.getInstance().setName("�й���");
		super.run();
	}
}
