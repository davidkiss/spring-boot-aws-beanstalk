package com.kaviddiss;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.util.MimeType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
public class Application {

	@RequestMapping(value = "/hello")
	public @ResponseBody String helloWorld() {
		return "Hello, World!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
