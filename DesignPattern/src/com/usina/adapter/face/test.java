package com.usina.adapter.face;

public class test {
public static void main(String[] args) {
	 Sourceable source1 = new SourceSub1();  
     Sourceable source2 = new SourceSub2();  
     System.out.println("第一个类的第一个方法");
     source1.method1();
     System.out.println("第一个类的第二个方法");
     source1.method2();  
     System.out.println("第二个类的第一个方法");
     source2.method1();  
     System.out.println("第二个类的第二个方法");
     source2.method2();  
}
}
