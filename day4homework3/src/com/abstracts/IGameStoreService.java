package com.abstracts;

import com.entities.Game;
import com.entities.Player;

public interface IGameStoreService {
	public void getGame(Game game, Player player);
	public void addCampain(IDiscountCampainService campain);
	public void UpdateCampain(IDiscountCampainService campain);
	public void deleteCampain(IDiscountCampainService campain);


}
