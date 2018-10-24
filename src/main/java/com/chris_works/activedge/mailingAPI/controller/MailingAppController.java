package com.chris_works.activedge.mailingAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chris_works.activedge.mailingAPI.utilities.EmailUtil;

@RestController
public class MailingAppController {
	
	@Autowired
	private EmailUtil emailUtil;

	//THE FOLLOWING THREE VARIABLES HAS BEEN PRE DEFINED IN MY APPLICATION.PROPERTIES CLASS, JUST FOR THE PURPOSE OF TESTING
	//(toAddress, subject, body)
	@Value("${default_toAddress}")
	private String toAddress;
	
	@Value("${default_subject}")
	private String subject;
	
	@Value("${default_body}")
	private String body;
	
	@RequestMapping(value = "/sendmail")
	String sendMessage() {
		emailUtil.sendEmail(toAddress, subject, body);
		return "message sent successfully";
	}
}
