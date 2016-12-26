package com.usina.Singleton.Thread;

public class test {
	public static void main(String[] args) {
		Singleton.getInstance().myFunction();
		System.out.println("对getInstance方法加synchronized关键字，解决了线程问题！");
		System.out.println("这样的用法，在性能上会有所下降，因为每次调用getInstance()，如何解决？");
	}
}
