package com.usina.adapter.face;

public class test {
public static void main(String[] args) {
	 Sourceable source1 = new SourceSub1();  
     Sourceable source2 = new SourceSub2();  
     System.out.println("��һ����ĵ�һ������");
     source1.method1();
     System.out.println("��һ����ĵڶ�������");
     source1.method2();  
     System.out.println("�ڶ�����ĵ�һ������");
     source2.method1();  
     System.out.println("�ڶ�����ĵڶ�������");
     source2.method2();  
}
}
