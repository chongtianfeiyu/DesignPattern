package com.usina.Singleton.shadow;

public class testNoError {
	public static void main(String[] args) {

		ThreadA threadA=new ThreadA();
		threadA.run();
		
		
		ThreadB threadB=new ThreadB();
		threadB.run();
		
		
		
	
	}
	
	
}
