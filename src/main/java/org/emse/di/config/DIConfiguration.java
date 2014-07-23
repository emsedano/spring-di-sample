package org.emse.di.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.emse.di.services.TwitterService;
import org.emse.di.services.IMessageService;


@Configuration
@ComponentScan(value={"org.emse.di.consumer"})
public class DIConfiguration {
	
	@Bean
	public IMessageService getMessageService(){
		return new TwitterService();
	}

}
