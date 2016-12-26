package com.usina.Abstract_factory;

public class SendMailFactory implements Provider {

	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();  
	}

}
