package com;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zulfat.config.SpringConfig;
import com.zulfat.domain.Account;
import com.zulfat.service.AccountService;


public class App2 {
	
	public static void main(String[] args) throws IOException {
		
		
		 ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

	        AccountService accountService = ctx.getBean(AccountService.class);

	        Account ac = accountService.findById(1);
	        System.out.println(ac);
		
	}
	

}
