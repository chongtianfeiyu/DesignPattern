package com.usina.Singleton.Thread3;

public class ThreadB  implements  Runnable{
	public void run() {
		// TODO Auto-generated method stub
		boolean flag=true;
		while(flag){
			flag = !(System.currentTimeMillis() /1000 % 10==2);
		}
			System.out.println("线程B开始=================");
			Singleton.getInstance().myFunction();
	}
}
