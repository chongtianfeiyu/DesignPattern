package com.usina.Singleton.Thread4;

public class ThreadB  implements  Runnable{
	public void run() {
		// TODO Auto-generated method stub
		boolean flag=true;
		while(flag){
			flag = !(System.currentTimeMillis() /1000 % 10==5);
		}
			System.out.println("�߳�B��ʼ=================");
			Singleton.getInstance().myFunction();
	}
}
