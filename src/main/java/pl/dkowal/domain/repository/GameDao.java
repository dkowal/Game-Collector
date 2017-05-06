package pl.dkowal.domain.repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

import pl.dkowal.domain.Game;

public interface GameDao {

	List <Game> getAllGames();
	
	Game getGameById(String gameId);

	Set<Game> getGamesByFilter(Map<String, List<String>> filterParams);
	
	void addGame(Game product);
}
