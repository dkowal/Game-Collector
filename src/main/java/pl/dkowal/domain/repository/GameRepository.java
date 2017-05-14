package pl.dkowal.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.dkowal.domain.Game;

public interface GameRepository extends JpaRepository<Game, String> {

//	List <Game> getAllGames();
	
//	Game getGameById(String gameId);

//	Set<Game> getGamesByFilter(Map<String, List<String>> filterParams);
	
//	void addGame(Game game);
//
//	void deleteGame(String gameId);

}
