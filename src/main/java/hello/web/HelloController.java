package hello.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hello.domain.Post;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public String home(Model model) {
		model.addAttribute("title", "Spring Boot Demo");
		model.addAttribute("time", new Date().toString());
		return "hello";
	}

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Post post) {
        return "login";
    }
}