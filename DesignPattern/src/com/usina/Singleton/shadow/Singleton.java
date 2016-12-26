package com.usina.Singleton.shadow;

import java.util.Vector;

public class Singleton {

	
	private String name;
	
    private static Singleton instance = null;  
    
    
    
    //Vector 类在可以实现自动增长的对象数组
    private Vector properties = null;  
  
    public Vector getProperties() {  
        return properties;  
    }  
  
    private Singleton() {  
    }  
  
    private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
    }  
  
    public static Singleton getInstance() {  
        if (instance == null) {  
            syncInit();  
        }  
        return instance;  
    }  
  
    public void updateProperties() {  
    	Singleton shadow = new Singleton();  
    	System.out.println("====updateProperties");
        properties = shadow.getProperties();  
    }  
    
    public void myFunction(){
    	System.out.println("This is my Function");
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
