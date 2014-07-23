package org.emse.di.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.emse.di.config.DIConfiguration;
import org.emse.di.consumer.DIApplicationConsumer;

public class Application {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		DIApplicationConsumer app = context.getBean(DIApplicationConsumer.class);
		
		app.processMessage("This is IOC and DI", "emsedano@live.com.mx" );
		
		context.close();
	}

}
