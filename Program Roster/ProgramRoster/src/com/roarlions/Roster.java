/**
 * 
 */
package com.roarlions;

import java.util.ArrayList;
import java.util.List;

/**
 * This is a class  Roster
 *  
 * 
 * @version 1.0 3/6/2026
 * @author Eric Staggs
 */
public class Roster {
	
	/*
	 * Roster fields
	 */
	
	private String name = "";
	private ArrayList<Player> players = new ArrayList<>();
	
	public Roster() {
		this.setName("2026Roster");
	}

	
	
	/**
	 * @add Player to list players
	 */
	public void add(Player p) {
		players.add(p);
	}
	/**
	 * search function
	 *TODO fix search
	 */
	public Player findByName(String s) {
		List<Player> p = new ArrayList<>();
		for(Player player : players) {
			if(player.getName().toLowerCase().contains(s.toLowerCase())) {
				p.add(player);
			}
		}
		return p.getFirst();
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the players
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}


}
