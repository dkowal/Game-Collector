package pl.dkowal.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import pl.dkowal.domain.Game;
import pl.dkowal.service.GameService;

@Controller
@RequestMapping("/games")
public class GameController {
	
	@Autowired
	private GameService gameService;

	@RequestMapping
	public String list(Model model) {
		model.addAttribute("games", gameService.getAllGames());
		return "games";
	}
	
	@RequestMapping("/all")
	public ModelAndView allProducts() {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("games", gameService.getAllGames());
		modelAndView.setViewName("games");
		return modelAndView;
	}
	
	@RequestMapping("/filter/{ByCriteria}")
	public String getGamesByFilter(@MatrixVariable(pathVar="ByCriteria") Map<String,List<String>> filterParams, Model model) {
		model.addAttribute("games", gameService.getGamesByFilter(filterParams));
		return "games";
	}
	
	@RequestMapping("/game")
	public String getGameById(@RequestParam("id") String gameId, Model model) {
		model.addAttribute("game", gameService.getGameById(gameId));
		return "game";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String getAddNewGameForm(@ModelAttribute("newGame") Game newGame) {
	   return "addGame";
	}
	   
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String processAddNewGameForm(@ModelAttribute("newGame") Game gameToBeAdded, ModelMap map, BindingResult result) {
		String[] suppressedFields = result.getSuppressedFields();
		
		if (suppressedFields.length > 0) {
			throw new RuntimeException("Próba wiązania niedozwolonych pól: " + StringUtils.arrayToCommaDelimitedString(suppressedFields));
		}
		
	   	gameService.addGame(gameToBeAdded);
		return "redirect:/games";
	}
//
//	@InitBinder
//	public void initialiseBinder(WebDataBinder binder) {
//		binder.setAllowedFields("gameId","name","unitPrice","description","manufacturer","category","unitsInStock", "condition");
//	}

}
