package com.usina.Singleton.Thread4;

public class testNoError {
	public static void main(String[] args) {
		System.out.println("new threadA");
		Thread threadA=new Thread(new ThreadA());
		//threadA.setDaemon(true);  
		threadA.start();
		
		System.out.println("new threadB");
		Thread threadB=new Thread(new ThreadB());
		//threadB.setDaemon(true); 
		threadB.start();
		
		
		
	
	}
	
	
}
