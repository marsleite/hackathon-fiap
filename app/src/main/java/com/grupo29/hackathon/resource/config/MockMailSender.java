package com.grupo29.hackathon.resource.config;

import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.MailException;
import org.springframework.mail.MailSendException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;

import java.io.InputStream;


public class MockMailSender implements JavaMailSender {

    @Override
    public MimeMessage createMimeMessage() {
        return new MimeMessage((Session) null);
    }

    @Override
    public MimeMessage createMimeMessage(InputStream contentStream) throws MailException {
        try {
            return new MimeMessage(null, contentStream);
        } catch (MessagingException e) {
            throw new MailSendException("Erro criando mensagem de email", e);
        }
    }

    @Override
    public void send(MimeMessage mimeMessage) throws MailException {
        System.out.println("Mensagem enviada.");
    }

    @Override
    public void send(MimeMessage... mimeMessages) throws MailException {
        for (MimeMessage mimeMessage : mimeMessages) {
            send(mimeMessage);
        }
    }

    @Override
    public void send(MimeMessagePreparator mimeMessagePreparator) throws MailException {
        MimeMessage mimeMessage = createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
        try {
            mimeMessagePreparator.prepare(mimeMessage);
        } catch (Exception e) {
            throw new MailSendException("Erro preparando email", e);
        }
        send(mimeMessage);
    }

    @Override
    public void send(MimeMessagePreparator... mimeMessagePreparators) throws MailException {
        for (MimeMessagePreparator preparator : mimeMessagePreparators) {
            send(preparator);
        }
    }

    @Override
    public void send(SimpleMailMessage simpleMessage) throws MailException {
        System.out.println("Mensagem enviada.");
    }

    @Override
    public void send(SimpleMailMessage... simpleMessages) throws MailException {
        for(SimpleMailMessage simpleMailMessage : simpleMessages) {
            send(simpleMailMessage);
        }
    }
}
