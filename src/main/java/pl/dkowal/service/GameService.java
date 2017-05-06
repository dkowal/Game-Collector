package pl.dkowal.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.dkowal.domain.Game;

public interface GameService {

	List<Game> getAllGames();

	Game getGameById(String GameID);

	Set<Game> getGamesByFilter(Map<String, List<String>> filterParams);
	
	void addGame(Game Game);
}
