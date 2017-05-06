package pl.dkowal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Witaj na stronie klasera gier!");
		model.addAttribute("tagline", "Wejdź ze mną w świat gier, które kolekcjonuję");
		
		return "welcome";
}
}
