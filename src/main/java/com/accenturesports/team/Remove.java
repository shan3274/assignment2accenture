package com.accenturesports.team;

import java.util.HashSet;

public class Remove {
	public HashSet<String> remove(HashSet<String> players,String value){
		HashSet<String> newplayers = new HashSet();
		
		for(String player:players) {
			if(!player.contains(value)) {
				newplayers.add(player);
			}
		}
		return newplayers;
	}
}
