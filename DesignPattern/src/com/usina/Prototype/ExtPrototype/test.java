package com.usina.Prototype.ExtPrototype;

import java.io.IOException;
import java.util.Date;

public class test {
public static void main(String[] args) {
	
	String Desc="DescA";
	Date date = new Date(10000L);
	User user=new User("userName",18);
	
	
	
	Prototype prototypeA=new Prototype();
	System.out.println("��A�����Խ��и�ֵ");
	prototypeA.setDesc(Desc);
	prototypeA.setUser(user);
	prototypeA.setBegin(date);
	
	
	System.out.println(prototypeA.getDesc()+" "+ prototypeA.getBegin()+" "+ prototypeA.getUser().getName());
	
	
	
	
	Prototype prototypeB;
	Prototype prototypeC;
	try {
		prototypeB=(Prototype)prototypeA.clone();
		System.out.println("ǳ����=============���õ���A��Ҳ����Դ�Ķ�������Դ������ˣ�clone��Ҳ��================");
		Desc="descB";
		date.setTime(100000000L);
		user.setName("userNameChangeB");
		System.out.println("��ֵ��A������ֵ��");
		System.out.println(prototypeA.getDesc()+" "+ prototypeA.getBegin()+" "+ prototypeA.getUser().getName());
		
		System.out.println("clone��B������ֵ��");
		System.out.println(prototypeB.getDesc()+" "+prototypeB.getBegin()+" "+ prototypeB.getUser().getName());


		
		System.out.println("���============���õ���C������Դ�Ķ���������clone��һ���µĶ�������Դ������ˣ�clone�Ĳ���==========================");
		prototypeC=(Prototype)prototypeA.deepClone();
		Desc="descC";
		date.setTime(110000000L);
		user.setName("userNameChangeC");
		
		System.out.println("��ֵ��A������ֵ��");
		System.out.println(prototypeA.getDesc()+" "+ prototypeA.getBegin()+" "+ prototypeA.getUser().getName());
		
		System.out.println("clone��C������ֵ��");
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
