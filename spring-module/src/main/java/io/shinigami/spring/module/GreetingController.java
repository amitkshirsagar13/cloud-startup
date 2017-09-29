package io.shinigami.spring.module;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RefreshScope
@RestController
class GreetingController {

	@Value("${dynamic.message:Fucker}")
	private String dynamicMessage;

	@RequestMapping("/hello")
	String hello() {
		return "Hello, " + dynamicMessage + "!!!";
	}
}
