package com.usina.Singleton.Thread2;

public class ThreadB  implements  Runnable{
	public void run() {
		// TODO Auto-generated method stub
		boolean flag=true;
		while(flag){
			flag = !(System.currentTimeMillis() /1000 % 10==9);
		}
			System.out.println("线程B开始=================");
			Singleton.getInstance().myFunction();
	}
}
