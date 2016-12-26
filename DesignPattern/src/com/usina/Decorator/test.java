package com.usina.Decorator;

public class test {
public static void main(String[] args) {
	   Sourceable source = new Source();  
       Sourceable obj = new Decorator(source);  
       obj.method();  
}
}
