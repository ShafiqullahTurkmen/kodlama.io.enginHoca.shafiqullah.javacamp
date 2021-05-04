package com.main;

import com.abstracts.IDiscountCampainService;
import com.abstracts.IGameStoreService;
import com.abstracts.IPlayerCheckService;
import com.abstracts.IPlayerService;
import com.concrets.EDevletPlayerCheckManager;
import com.concrets.MySqlPlayerDalManager;
import com.concrets.NewYearDiscountCampainManager;
import com.concrets.OracleDiscountCampainDalManager;
import com.concrets.PlayStationGameStoreManager;
import com.concrets.PlayStationPlayerManager;
import com.entities.Game;
import com.entities.Player;

public class Main {

	public static void main(String[] args) {
		
		Player player = new Player(1, "Yahya", "Kemal", "545454", 1990);
		Game   game   = new Game(2, "PES 2020" , 400);
		
		
		IPlayerCheckService checkPlayer = new EDevletPlayerCheckManager();
		IPlayerService      playerManager = new PlayStationPlayerManager(checkPlayer, new MySqlPlayerDalManager());
		
		//Oyuncunu sisteme ekliyor
		playerManager.add(player);
		
		IDiscountCampainService discountCampain = new NewYearDiscountCampainManager(12.5,"Yeni yil Kampanyası");
		IGameStoreService store = new PlayStationGameStoreManager(discountCampain, new OracleDiscountCampainDalManager());
		
		//Satışlar için Kampanya eklıyor
		store.addCampain(discountCampain);
		
		//Oyuncuya Oyun satişi yapiyor
		store.getGame(game, player);
		
		
		

		
	}

}
