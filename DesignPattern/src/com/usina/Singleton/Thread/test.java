package com.usina.Singleton.Thread;

public class test {
	public static void main(String[] args) {
		Singleton.getInstance().myFunction();
		System.out.println("��getInstance������synchronized�ؼ��֣�������߳����⣡");
		System.out.println("�������÷����������ϻ������½�����Ϊÿ�ε���getInstance()����ν����");
	}
}
