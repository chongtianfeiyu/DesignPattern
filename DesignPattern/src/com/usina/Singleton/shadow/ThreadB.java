package com.usina.Singleton.shadow;

public class ThreadB extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("�߳�B��ʼ=================");
		Singleton.getInstance().myFunction();
		Singleton.getInstance().updateProperties();
		System.out.println("�߳�B������================="+Singleton.getInstance().getName());
		
		super.run();
	}
}
