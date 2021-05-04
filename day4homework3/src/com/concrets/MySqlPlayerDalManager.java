package com.concrets;

import com.abstracts.IPlayerDalService;
import com.entities.Player;

public class MySqlPlayerDalManager implements IPlayerDalService{

	@Override
	public void add(Player player) {
		System.out.println("Oyuncu MySql veri tabanına kayd edildi.");
		System.out.println("Oyuncu Adı ve soyadı: " + player.getFirstName() + " " + player.getLastName());
		System.out.println("Oyuncu TCKimlik numarası: " + player.getNationalityId());
	}

	@Override
	public void delete(Player player) {
		System.out.printf("%s %s Oyuncu MySql veri tabanından silindi.", player.getFirstName(), player.getLastName());
		
	}

	@Override
	public void update(Player player) {
		System.out.printf("%s %s Oyuncu MySql veri tabanında güncellendi.", player.getFirstName(), player.getLastName());
		
	}

}
