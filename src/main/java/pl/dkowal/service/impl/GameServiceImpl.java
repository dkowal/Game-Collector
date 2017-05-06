package pl.dkowal.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import pl.dkowal.domain.Game;
import pl.dkowal.domain.repository.GameDao;
import pl.dkowal.service.GameService;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameDao gameDao;

    public List<Game> getAllGames() {
        return gameDao.getAllGames();
    }

    public Game getGameById(String gameId) {
        return gameDao.getGameById(gameId);
    }

    public Set<Game> getGamesByFilter(Map<String, List<String>> filterParams) {
        return gameDao.getGamesByFilter(filterParams);
    }

    public void addGame(Game game) {
        gameDao.addGame(game);
    }
}
