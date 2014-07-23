package org.emse.di.test;

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
 
import org.emse.di.consumer.DIApplicationConsumer;
import org.emse.di.services.IMessageService;
 
@Configuration
@ComponentScan(value="org.emse.di.consumer")
public class ApplicationTest {
     
    private AnnotationConfigApplicationContext context = null;
 
    @Bean
    public IMessageService getMessageService() {
        return new IMessageService(){

            public boolean sendMessage(String msg, String rec) {
                System.out.println("Mock Service");
                return true;
            }        
        };
    }
 
    @Before
    public void setUp() throws Exception {
        context = new AnnotationConfigApplicationContext(ApplicationTest.class);
    }
     
    @After
    public void tearDown() throws Exception {
        context.close();
    }
 
    @Test
    public void test() {
    	DIApplicationConsumer app = context.getBean(DIApplicationConsumer.class);
        Assert.assertTrue(app.processMessage("Hi Pankaj", "pankaj@abc.com"));
    }
 
}
