package com.usina.Singleton.Simple;

public class test {
	public static void main(String[] args) {
		Singleton.getInstance().myFunction();
		System.out.println("这个类可以满足基本要求，但是，像这样毫无线程安全保护的类，如果我们把它放入多线程的环境下，肯定就会出现问题了，如何解决？");
	}
}
