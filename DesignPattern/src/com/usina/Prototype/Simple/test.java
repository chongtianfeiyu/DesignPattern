package com.usina.Prototype.Simple;

public class test {
public static void main(String[] args) {
	Prototype prototypeA=new Prototype();
	System.out.println("对A的属性进行赋值为：NameA");
	prototypeA.setName("NameA");
	Prototype prototypeB;
	try {
		prototypeB=prototypeA.clone();
		System.out.println("clone后B的属性值：");
		System.out.println(prototypeB.getName());
		System.out.println("对B的属性进行修改，修改为：NameB");
		prototypeA.setName("NameB");
		
		System.out.println("重新打印B的属性值");
		System.out.println(prototypeB.getName());
		
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
