package com.usina.adapter.simple;

public class Adapter extends Source implements Targetable {

	@Override
    public void method2() {  
        System.out.println("this is the targetable method!");  
    } 
	  

//	@Override
//    public void method1() {  
//        System.out.println("我也实现这个方法!");  
//        super.method1();
//    } 
}
