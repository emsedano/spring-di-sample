package org.emse.di.consumer;

import org.emse.di.services.IMessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DIApplicationConsumer {
	
	
	private IMessageService service;
	
	@Autowired
	public void setService(IMessageService service){
		this.service = service;
	}
	
	public boolean processMessage(String msg, String rec){
		return this.service.sendMessage(msg, rec);
	}
}
