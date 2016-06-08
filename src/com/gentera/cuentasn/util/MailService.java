/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.util;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Rafael Delgadillo
 * @version 1.0
 */
@Service
public class MailService {
	
	/**
	 * Log
	 */
	final static Logger logger = Logger.getLogger(MailService.class);
	
	@Autowired
	private JavaMailSender mailSender;
	
	public void setMailSender(JavaMailSender mailSender) {
		this.mailSender = mailSender;
	}

	public void sendMail(String subject, String msj) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setFrom("webmaster@compartamos.com");
		message.setTo(Properties.getProp("mailIssues"));
		message.setSubject(subject);
		message.setText(msj);
		mailSender.send(message);
		
		logger.info("Se ha enviado un email a " + Properties.getProp("mailIssues") + " con subject " + subject);
		
//		System.out.println("Entra a enviar mail");
//		Properties props = new Properties();
//		props.put("mail.smtp.host", "bcdelta003.compartamos.mx");
//		props.put("mail.smtp.auth", "true");
//		props.put("mail.smtp.port", "25");
//		props.put("mail.smtp.debug", "true");
//
//		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication("webmaster", "compartamos010#");
//			}
//		});
//
//		try {
//
//			Message message = new MimeMessage(session);
//			message.setFrom(new InternetAddress("webmaster@compartamos.com"));
//			message.setRecipients(Message.RecipientType.TO,
//					InternetAddress.parse("extuscomunicacion03@gentera.com.mx"));
//			message.setSubject("Testing Subject1");
//			message.setText("Dear Mail Crawler," + "\n\n No spam to my email, please1!");
//
//			Transport tr = session.getTransport("smtp");
//			tr.connect(props.getProperty("mail.smtp.host"),"webmaster","compartamos010#");
//			tr.sendMessage(message, message.getAllRecipients());
//			
//			MailSender ms;
//			
//			ms.send(message);
////			Transport.send(message);
//
//			System.out.println("Done");
//
//		} catch (MessagingException e) {
//			throw new RuntimeException(e);
//		}
	}
}
