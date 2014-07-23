package org.emse.di.services;

public class EMailService implements IMessageService {

	@Override
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Email Sent to "+rec+ " with Message="+msg);
        return true;
	}

}
