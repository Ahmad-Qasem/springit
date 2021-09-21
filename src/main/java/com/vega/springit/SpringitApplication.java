package com.vega.springit;

import java.util.Arrays;

import com.vega.springit.config.SpringitProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(SpringitProperties.class)
public class SpringitApplication {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
		System.out.println("Welcome to this test 2");
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			System.out.println(" : ");
			System.out.println("-------- ------ ------");
			String[] names = applicationContext.getBeanDefinitionNames();

			Arrays.sort(names);

			for (String ap: names) {
				System.out.println(ap);
			}
		};
	}

}
