package com.myolnir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHibernateApplication implements CommandLineRunner {

    public static void main (String[] args) {
        SpringApplication.run(SpringBootHibernateApplication.class);
    }

    @Override
    public void run (String... args) throws Exception {
    }
}
