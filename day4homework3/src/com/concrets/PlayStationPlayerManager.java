package com.concrets;

import com.abstracts.IPlayerCheckService;
import com.abstracts.IPlayerDalService;
import com.abstracts.IPlayerService;
import com.entities.Player;

public class PlayStationPlayerManager implements IPlayerService {

	private IPlayerCheckService checkPlayer;
	private IPlayerDalService   playerDal;
	
	
	
	public PlayStationPlayerManager(IPlayerCheckService checkPlayer, IPlayerDalService playerDal) {
		super();
		this.checkPlayer = checkPlayer;
		this.playerDal   = playerDal;
	}

	@Override
	public void add(Player player) {

		if (checkPlayer.checkIfRealPerson(player)) {
			playerDal.add(player);
			System.out.println();
		} else {
			System.out.println("Invalid Person to add.");
		}
	}

	@Override
	public void delete(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Player player) {
		// TODO Auto-generated method stub
		
	}
	
	

}
