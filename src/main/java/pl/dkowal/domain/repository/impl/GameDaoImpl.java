package pl.dkowal.domain.repository.impl;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

import org.springframework.stereotype.Repository;

import pl.dkowal.domain.Game;
import pl.dkowal.domain.Status;
import pl.dkowal.domain.repository.GameDao;

@Repository
public class GameDaoImpl implements GameDao {


	private List<Game> listOfGames = new ArrayList<Game>();
//	public void funkcja() throws ClassNotFoundException, SQLException {
//		Class.forName("org.h2.Driver");
//		String database = "jdbc:h2:~/test";
//		Connection conn = DriverManager.getConnection(database, "sa", "sa");
//
//		Statement st = conn.createStatement();
//		ResultSet res = st.executeQuery("SELECT * FROM public.Games");
//		while (res.next()) {
//			String id = res.getString(1);
//			String name = res.getString(2);
//			String desc = res.getString(3);
//			System.out.println(id + " " + name + " " + desc);
//			Game game = new Game(id, name, desc);
//			listOfGames.add(game);
//		}
//		st.close();
//		conn.close();
//	}

	public GameDaoImpl() throws ParseException, SQLException, ClassNotFoundException {
		//funkcja();

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date data1 = dateFormat.parse("2001/03/15 00:00:00");

		Game gam0 = new Game("1", "Gothic I", 120, "Akcja gry przenosi graczy do fantastycznego Krolestwa Myrtany, ktorym rzadzi król...",
				"Akcja gry przenosi graczy do fantastycznego Krolestwa Myrtany, ktorym rzadzi krol Rhobar II. Wcielajac sie w postac Bezimienngo trafiaja oni do kolonii karnej na wyspie Khorinis. Otacza ja magiczna, przenikalna jedynie z zewnatrz bariera, ktora stworzyli arcymagowie. Niestety, w trakcie inkantacji wydarzylo sie cos niespodziewanego. Zasieg zaklecia okazal sie wiekszy niz przewidywano i bariera otoczyla caly obszar Gorniczej Doliny, wiezac takze magow.",
                data1, data1, 130, Status.NIE_DO_SPREDANIA, "Piranha Bytes");
		listOfGames.add(gam0);

		data1 = dateFormat.parse("2002/11/29 00:00:00");

		Game gam1 = new Game("2", "Gothic II", 120, "Podobnie jak w części poprzedniej akcja Gothic II toczy się w świecie fantasy i ...",
				"Podobnie jak w części poprzedniej akcja Gothic II toczy się w świecie fantasy i kontynuuje fabułę poprzedniczki, tj. wojny pomiędzy siłami zła (cała masa potworów, Orków i Ogrów pod przewodnictwem Smoków) i Ludźmi. Jednak tym razem nie poruszamy się już tylko wewnątrz kolonii przestępców objętej zasięgiem magicznej bariery, a na jej zewnątrz. Akcja toczy się w nowych bardzo rozległych i różnorodnych lokacjach, m.in. miasteczko nadmorskie, klasztor, biblioteka, farma, Wyspa Smoków, zamek oblężony przez Orki.",
				data1, data1, 150, Status.NIE_DO_SPREDANIA, "Piranha Bytes");
		listOfGames.add(gam1);
		data1 = dateFormat.parse("2006/03/20 00:00:00");

		Game gam2 = new Game("3", "TES IV: Oblivion", 120, "Akcja toczy się w prowincji Cyrodill, należącej do dobrze znanego graczom...",
				"Akcja toczy się w prowincji Cyrodill, należącej do dobrze znanego graczom cesarstwa Tamriel. Po przedwczesnej śmierci z rąk skrytobójców dotychczasowego władcy krainy, Uriela Septima VII, zadaniem głównego bohatera jest odnalezienie prawowitego następcy tronu i skłonienie go do objęcia władzy nad Tamriel.",
				data1, data1, 120, Status.DO_SPRZEDANIA, "Bethesda Softworks");
		listOfGames.add(gam2);
		data1 = dateFormat.parse("2001/03/15 00:00:00");

		Game gam3 = new Game("4", "Stronghold II: Krzyżowiec", 120, "Akcja gry przeniesiona została na Bliski Wschód, w czasy wypraw...",
				"Akcja gry przeniesiona została na Bliski Wschód, w czasy wypraw krzyżowych. Zadanie gracza polega na wznoszeniu i rozbudowie twierdz, zaspokajaniu potrzeb mieszkańców, rekrutacji armii, a wreszcie pokonaniu przeciwników..",
				data1, data1, 80, Status.NIE_DO_SPREDANIA, "FireFly");
		listOfGames.add(gam3);

		data1 = dateFormat.parse("2011/11/11 00:00:00");
		Date data2 = dateFormat.parse("2017/04/20 00:00:00");
		Game gam4 = new Game("5", "TES V: Skyrim", 120, "Akcja Skyrim osadzona została 200 lat po wydarzeniach przedstawionych w TES...",
				"Akcja The Elder Scrolls V: Skyrim osadzona została 200 lat po wydarzeniach przedstawionych w The Elder Scrolls IV: Oblivion. Główny bohater jest jednym z ostatnich łowców smoków (dovahkiin). Tymczasem wypełnia się proroctwo, zwiastujące przybycie boga zniszczenia - Alduina, który przyjmie postać jednego z tych mitycznych stworzeń.",
				data1, data1, 80, Status.NOWA, "Bethesda Softworks");
		listOfGames.add(gam4);
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
