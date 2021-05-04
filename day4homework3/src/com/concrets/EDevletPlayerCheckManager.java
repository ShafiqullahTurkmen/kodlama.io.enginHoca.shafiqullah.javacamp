package com.concrets;

import com.abstracts.IPlayerCheckService;
import com.entities.Player;

public class EDevletPlayerCheckManager implements IPlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {
		return true;
	}

}
