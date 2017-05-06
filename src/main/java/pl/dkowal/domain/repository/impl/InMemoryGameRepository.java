package pl.dkowal.domain.repository.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.stereotype.Repository;

import pl.dkowal.domain.Game;
import pl.dkowal.domain.Status;
import pl.dkowal.domain.repository.GameRepository;

@Repository
public class InMemoryGameRepository implements GameRepository {
	
	private List<Game> listOfGames = new ArrayList<Game>();
	
	public InMemoryGameRepository() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date data1 = dateFormat.parse("2001/03/15 00:00:00");
        System.out.println(data1);

		Game gam = new Game("1", "Gra Gothic I", 120,
				"Akcja gry przenosi graczy do fantastycznego Krolestwa Myrtany, ktorym rzadzi krol Rhobar II. Wcielajac sie w postac Bezimienngo trafiaja oni do kolonii karnej na wyspie Khorinis. Otacza ja magiczna, przenikalna jedynie z zewnatrz bariera, ktora stworzyli arcymagowie. Niestety, w trakcie inkantacji wydarzylo sie cos niespodziewanego. Zasieg zaklecia okazal sie wiekszy niz przewidywano i bariera otoczyla caly obszar Gorniczej Doliny, wiezac takze magow.",
                data1, new Date(), 130, Status.NOWA, "Piranha Bytes");
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
