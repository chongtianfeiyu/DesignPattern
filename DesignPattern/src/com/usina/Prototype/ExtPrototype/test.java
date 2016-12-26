package com.usina.Prototype.ExtPrototype;

import java.io.IOException;
import java.util.Date;

public class test {
public static void main(String[] args) {
	
	String Desc="DescA";
	Date date = new Date(10000L);
	User user=new User("userName",18);
	
	
	
	Prototype prototypeA=new Prototype();
	System.out.println("对A的属性进行赋值");
	prototypeA.setDesc(Desc);
	prototypeA.setUser(user);
	prototypeA.setBegin(date);
	
	
	System.out.println(prototypeA.getDesc()+" "+ prototypeA.getBegin()+" "+ prototypeA.getUser().getName());
	
	
	
	
	Prototype prototypeB;
	Prototype prototypeC;
	try {
		prototypeB=(Prototype)prototypeA.clone();
		System.out.println("浅复制=============引用的是A，也就是源的对象，所以源对象变了，clone的也变================");
		Desc="descB";
		date.setTime(100000000L);
		user.setName("userNameChangeB");
		System.out.println("赋值后A的属性值：");
		System.out.println(prototypeA.getDesc()+" "+ prototypeA.getBegin()+" "+ prototypeA.getUser().getName());
		
		System.out.println("clone后B的属性值：");
		System.out.println(prototypeB.getDesc()+" "+prototypeB.getBegin()+" "+ prototypeB.getUser().getName());


		
		System.out.println("深复制============引用的是C，不是源的对象，是重新clone了一个新的对象，所以源对象变了，clone的不变==========================");
		prototypeC=(Prototype)prototypeA.deepClone();
		Desc="descC";
		date.setTime(110000000L);
		user.setName("userNameChangeC");
		
		System.out.println("赋值后A的属性值：");
		System.out.println(prototypeA.getDesc()+" "+ prototypeA.getBegin()+" "+ prototypeA.getUser().getName());
		
		System.out.println("clone后C的属性值：");
		System.out.println(prototypeC.getDesc()+" "+prototypeC.getBegin()+" "+ prototypeC.getUser().getName());
		
		
		
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}





}
