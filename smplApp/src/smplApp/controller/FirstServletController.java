package smplApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class FirstServletController {
	
	@RequestMapping(value="start", method=RequestMethod.GET)
	public String indexGet() {
		return "indexGet";
	}
	
	@RequestMapping(value="start", method=RequestMethod.POST)
	public String indexPost() {
		return "indexPost";
	}
}
