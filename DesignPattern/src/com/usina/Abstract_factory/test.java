package com.usina.Abstract_factory;

public class test {
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();  
        Sender sender = provider.produce();  
        sender.Send();  
	}
}
