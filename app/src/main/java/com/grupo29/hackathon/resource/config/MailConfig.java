package com.grupo29.hackathon.resource.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSender;


@Configuration
public class MailConfig {

    //Simular envio, para prod mudar esse para uma implementação de verdade

    @Bean
    public JavaMailSender javaMailSender() {
        MockMailSender mailSender = new MockMailSender();
        return mailSender;
    }
}
