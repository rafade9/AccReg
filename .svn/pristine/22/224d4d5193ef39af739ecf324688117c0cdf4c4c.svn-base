/**
 * Copyright Gentera S.A.B. de C.V. Febrero 2016
 */
package com.gentera.cuentasn.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * 
 * @author Rafael Delgadillo
 * @version 1.0
 */
public class Mail {

	public static void sendMail() {
		System.out.println("Entra a enviar mail");
		Properties props = new Properties();
		props.put("mail.smtp.host", "bcdelta003.compartamos.mx");
		props.put("mail.smtp.socketFactory.port", "25");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "25");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("webmaster", "compartamos010#s");
			}
		});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("no-reply@aterna.mx"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse("extuscomunicacion03@gentera.com.mx"));
			message.setSubject("Testing Subject");
			message.setText("Dear Mail Crawler," + "\n\n No spam to my email, please!");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
