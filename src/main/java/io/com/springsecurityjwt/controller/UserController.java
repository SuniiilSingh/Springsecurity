package io.com.springsecurityjwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author ssing109
 *
 */
@RestController
public class UserController {

	@RequestMapping({ "/hello" })
	public String firstPage() {
		return "Hello World";
	}
}
