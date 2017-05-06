package pl.dkowal.domain.repository.impl;

import java.math.BigDecimal;
import java.util.*;

import org.springframework.stereotype.Repository;

import pl.dkowal.domain.Game;
import pl.dkowal.domain.Game;
import pl.dkowal.domain.Status;
import pl.dkowal.domain.repository.GameRepository;

@Repository
public class InMemoryGameRepository implements GameRepository {
	
	private List<Game> listOfGames = new ArrayList<Game>();
	
	public InMemoryGameRepository() {
		Game gam = new Game("1", "Gra 1", 120,
				"Opis", new Date(), 130, Status.NOWA, "Piranha Bythes");
		listOfGames.add(gam);
	}

	public List<Game> getAllGames() {
		return listOfGames;
	}

	public Game getGameById(String gameId) {
		Game gameById = null;
		
		for(Game game : listOfGames) {
			if(game!=null && game.getGameId()!=null && game.getGameId().equals(gameId)){
				gameById = game;
				break;
			}
		}
		
		if(gameById == null){
			throw new IllegalArgumentException("Brak gry o wskazanym id: "+ gameId);
		}
		
		return gameById;
	}


	public Set<Game> getGamesByFilter(Map<String, List<String>> filterParams) {
		Set<Game> gamesByBrand = new HashSet<Game>();

		Set<String> criterias = filterParams.keySet();
		
		if(criterias.contains("brand")) {
			for(String brandName: filterParams.get("brand")) {
				for(Game Game: listOfGames) {
					if(brandName.equalsIgnoreCase(Game.getManufacturer())){
						gamesByBrand.add(Game);
					}
				}
			}
		}

		
		return gamesByBrand;
	}
	
	public void addGame(Game Game) {
		   listOfGames.add(Game);
	}

}
