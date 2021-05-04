package com.concrets;

import com.abstracts.IDiscountCampainDalService;
import com.abstracts.IDiscountCampainService;
import com.abstracts.IGameStoreService;
import com.abstracts.IPlayerDalService;
import com.entities.Game;
import com.entities.Player;

public class PlayStationGameStoreManager implements IGameStoreService {
	
	IDiscountCampainService discountCampain;	
	IDiscountCampainDalService discountCampainDal;
	

	public PlayStationGameStoreManager(IDiscountCampainService discountCampain, IDiscountCampainDalService discountCampainDal) {
		this.discountCampain = discountCampain;
		this.discountCampainDal = discountCampainDal; 
	}

	
	
	@Override
	public void getGame(Game game, Player player) {
		System.out.printf("%s isimli oyuncu %s oyunu satın aldı ", player.getFirstName(), game.getName());
		System.out.println("Oynunun indirimli fiyati: " + discountCampain.getDiscount(game));
	}

	@Override
	public void addCampain(IDiscountCampainService campain) {
			discountCampainDal.add(discountCampain);
	}

	@Override
	public void UpdateCampain(IDiscountCampainService campain) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCampain(IDiscountCampainService campain) {
		// TODO Auto-generated method stub
		
	}
	
	

}
