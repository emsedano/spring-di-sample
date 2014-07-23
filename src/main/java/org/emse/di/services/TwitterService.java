package org.emse.di.services;

public class TwitterService implements IMessageService{

	@Override
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Twitter message Sent to "+rec+ " with Message="+msg);
        return true;
	}

}
