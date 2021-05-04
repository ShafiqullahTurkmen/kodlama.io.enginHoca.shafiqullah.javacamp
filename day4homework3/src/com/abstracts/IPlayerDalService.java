package com.abstracts;

import com.entities.Player;

public interface IPlayerDalService {
	public void add(Player player);
	public void delete(Player player);
	public void update(Player player);
}
