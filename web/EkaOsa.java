package fi.k2021sanna.Week1Exe2.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class EkaOsa {
		
		@RequestMapping("index")
		@ResponseBody
		public String IndexMapping() {
			return "This is the main page"; 
		}
		
		@RequestMapping("contact")
		@ResponseBody
		public String ContactMapping() {
			return "This is the contact page"; 
		}
		
}
