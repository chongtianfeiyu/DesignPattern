package com.usina.Singleton.Thread4;

public class Singleton {
	 private static Singleton instance = null;  
	/* ˽�й��췽������ֹ��ʵ���� */  
    private Singleton() {  
    }  
  
    private static synchronized void syncInit() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
    }  
  
    /* ��ȡʵ�� */  
    public static Singleton getInstance() {
    	 if (instance == null) {  
    		 System.out.println("new ��һ��");
             syncInit();  
         }  
         return instance;  
    }  
  
    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */  
    public Object readResolve() {  
        return getInstance();  
    }  
    
    public void myFunction(){
    	System.out.println("This is my Function");
    }
}
