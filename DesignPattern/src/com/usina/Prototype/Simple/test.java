package com.usina.Prototype.Simple;

public class test {
public static void main(String[] args) {
	Prototype prototypeA=new Prototype();
	System.out.println("��A�����Խ��и�ֵΪ��NameA");
	prototypeA.setName("NameA");
	Prototype prototypeB;
	try {
		prototypeB=prototypeA.clone();
		System.out.println("clone��B������ֵ��");
		System.out.println(prototypeB.getName());
		System.out.println("��B�����Խ����޸ģ��޸�Ϊ��NameB");
		prototypeA.setName("NameB");
		
		System.out.println("���´�ӡB������ֵ");
		System.out.println(prototypeB.getName());
		
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
