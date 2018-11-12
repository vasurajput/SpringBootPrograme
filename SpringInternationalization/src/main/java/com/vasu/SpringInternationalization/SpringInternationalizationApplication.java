package com.vasu.SpringInternationalization;

import java.util.Locale;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class SpringInternationalizationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		System.out.println("Main Method Call");
		SpringApplication.run(SpringInternationalizationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("inside command line");
	}


	
	
}
