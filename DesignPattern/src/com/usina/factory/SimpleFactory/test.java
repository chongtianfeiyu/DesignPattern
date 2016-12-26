package com.usina.factory.SimpleFactory;

public class test {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();  
        Sender sender = factory.produce("sms");  
        sender.Send();  
	}
}
