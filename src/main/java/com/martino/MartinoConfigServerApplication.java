package com.martino;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MartinoConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(MartinoConfigServerApplication.class, args);
	}
}
