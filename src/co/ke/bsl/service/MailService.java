package co.ke.bsl.service;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class MailService {
	private MailSender mailSender;
	private String userEmailId;
	private String password;

	public String getUserEmailId() {
		return this.userEmailId;
	}

	public void setUserEmailId(String userEmailId) {
		this.userEmailId = userEmailId;
	}

	public MailSender getMailSender() {
		return this.mailSender;
	}

	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void uponSuccessfulRegistration() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(this.getUserEmailId());
		message.setSubject("User Registration successful");
		message.setText("The user '" + this.userEmailId + "' is successfully registered. Your password is"
				+ this.getPassword());
		System.out
				.println("Sending email ...." + message.getFrom() + " " + message.getSubject() + " " + message.getTo());
		this.mailSender.send(message);
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}