package com.usina.adapter.simple;

public class Adapter extends Source implements Targetable {

	@Override
    public void method2() {  
        System.out.println("this is the targetable method!");  
    } 
	  

//	@Override
//    public void method1() {  
//        System.out.println("��Ҳʵ���������!");  
//        super.method1();
//    } 
}
