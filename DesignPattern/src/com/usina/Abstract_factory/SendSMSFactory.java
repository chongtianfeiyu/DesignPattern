package com.usina.Abstract_factory;

public class SendSMSFactory implements Provider {

	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();  
	}

}
