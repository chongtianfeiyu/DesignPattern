package com.usina.Singleton.Thread4;

public class Singleton {
	 private static Singleton instance = null;  
	/* 私有构造方法，防止被实例化 */  
    private Singleton() {  
    }  
  
    private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
    }  
  
    /* 获取实例 */  
    public static Singleton getInstance() {
    	 if (instance == null) {  
    		 System.out.println("new 了一次");
             syncInit();  
         }  
         return instance;  
    }  
  
    /* 如果该对象被用于序列化，可以保证对象在序列化前后保持一致 */  
    public Object readResolve() {  
        return getInstance();  
    }  
    
    public void myFunction(){
    	System.out.println("This is my Function");
    }
}
