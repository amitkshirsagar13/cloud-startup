package io.shinigami.spring.module;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * <p>
 * <b>Overview:</b>
 * <p>
 * 
 * 
 * <pre>
 * &#64;projectName spring-module
 * Creation date: Sep 29, 2017
 * &#64;author Amit Kshirsagar
 * &#64;version 1.0
 * &#64;since
 * 
 * <p><b>Modification History:</b><p>
 * 
 * 
 * </pre>
 */
@Configuration
@ComponentScan
@SpringBootApplication
@EnableDiscoveryClient
public class SpringModuleApplication {

	/**
	 * log4j object for debugging.
	 */
	private static final Logger log4j = LoggerFactory.getLogger(SpringModuleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringModuleApplication.class, args);
	}
}
