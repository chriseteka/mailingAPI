package com.chris_works.activedge.mailingAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chris_works.activedge.mailingAPI.utilities.EmailUtil;

@RestController
public class MailingSiteController {
	
	@Autowired
	private EmailUtil emailUtil;

	//THE FOLLOWING THREE VARIABLES HAS BEEN PRE DEFINED IN MY APPLICATION.PROPERTIES CLASS, JUST FOR THE PURPOSE OF TESTING
	//(toAddress, subject, body)
	@Value("${default_toAddress}")
	private String toAddress;

	@RequestMapping(value="/contactHome")
	String showContactMeForm() {
		return "contactme";
	}
	
	@RequestMapping(value = "/sendMeMails", method=RequestMethod.POST)
	String sendMessageReceivedFromSite(
										@RequestParam("fullname") String fullname,
										@RequestParam("email") String email,
										@RequestParam("subject") String subject,
										@RequestParam("phone") String phone,
										@RequestParam("body") String body) 
	{
		String msgBody = "NEW MESSAGE FROM:  "+ email + "\n\nPHONE NUMBER: " + phone + "\n\nNAME: " + fullname + "\n\n" + body;
		emailUtil.sendEmail(toAddress, subject, msgBody);
		return "successfully sent";
	}
	
}
