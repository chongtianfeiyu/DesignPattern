package com.usina.factory.staticFactory;

public class test {
	public static void main(String[] args) {
		Sender sender = SendFactory.produceMail();  
        sender.Send();  
	}
}
