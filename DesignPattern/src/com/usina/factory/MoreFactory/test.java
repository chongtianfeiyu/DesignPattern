package com.usina.factory.MoreFactory;

public class test {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();  
        Sender sender = factory.produceMail();
        sender.Send();  
	}
}
