package hello.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String home(Model model) {
		model.addAttribute("title", "Spring Boot Demo");
		model.addAttribute("time", new Date().toString());
		return "hello";
	}
}