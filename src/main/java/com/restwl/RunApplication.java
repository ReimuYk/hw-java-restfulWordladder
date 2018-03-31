package com.restwl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;


@SpringBootApplication
public class RunApplication {

    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }

//    @Override
//    public void customize(ConfigurableEmbeddedServletContainer container){
//        container.setPort(8011);
//    }
}