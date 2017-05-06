package pl.dkowal.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.dkowal.domain.Game;
import pl.dkowal.domain.repository.GameRepository;
import pl.dkowal.service.GameService;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameRepository gameRepository;

	public List<Game> getAllGames() {
		return gameRepository.getAllGames();
	}

	public Game getGameById(String gameId) {
		return gameRepository.getGameById(gameId);
	}

	public Set<Game> getGamesByFilter(Map<String, List<String>> filterParams) {
		return gameRepository.getGamesByFilter(filterParams);
	}
	
	public void addGame(Game game) {
		   gameRepository.addGame(game);
	}

}
