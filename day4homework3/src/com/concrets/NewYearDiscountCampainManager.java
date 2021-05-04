package com.concrets;

import com.abstracts.IDiscountCampainService;
import com.entities.Game;

public class NewYearDiscountCampainManager implements IDiscountCampainService {
	private double discount;
	private String campainName;
	
	
	
	
	public NewYearDiscountCampainManager(double discount, String campainName) {
		super();
		this.discount = discount;
		this.campainName = campainName;
	}

	@Override
	public double getDiscount(Game game) {
		
		game.setUnitPrice( game.getUnitPrice() - (discount / 100 * game.getUnitPrice()));
		
		return game.getUnitPrice() ;
	}

	@Override
	public String getCampainName() {
		return campainName;
	}

}
