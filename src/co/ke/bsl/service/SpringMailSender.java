package co.ke.bsl.service;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service("springMailSender")
public class SpringMailSender {
	@Autowired
	private SimpleMailMessage emailTemplate;
	@Autowired
	private JavaMailSenderImpl javaMailSender;
	private MailSender mailSender;

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void setEmailTemplate(SimpleMailMessage emailTemplate) {
		this.emailTemplate = emailTemplate;
	}

	public void setJavaMailSender(JavaMailSenderImpl javaMailSender) {
		this.javaMailSender = javaMailSender;
	}

	public void sendMail(String dear, String content, String emailAddress) throws IOException {
		String fromEmail = "info@bsl.co.ke";
		String emailSubject = "Nairobi International Show Ticket";
		String emailBody = String.format(
				"Hi %s,Thank you for Purchasing your ASK ticket on Brisk Ticketing. Please print and bring along this ticket to facilitate entry. Ticket valid for the day and category purchased. No Re-entry.For Inquiries, Call 07***** or send an e-mail to info@bsl.co.ke with your ticket no as the subject.Regards,%s.",
				dear, content);
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom(fromEmail);
		message.setTo(emailAddress);
		message.setSubject(emailSubject);
		message.setText(emailBody);
		this.mailSender.send(message);
	}
}