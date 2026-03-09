package com.musicrus;

import java.util.*;

public class AxeTester {

	public static void main(String[] args) {
		Guitar cutaway = new Acoustic(2019, "Martin");
		Guitar lesPaul = new Electric(1959, "Gibson");
		Guitar strat = new Electric(1967, "Fender");
		Guitar dreadnought = new Acoustic(1983, "Yamaha");
		Guitar tele = new Electric(2017, "Fender");

		Guitar om = new Acoustic(dreadnought);
		om.setMake("Banks");
		om.setYear(2024);
		
//		
//		// make sure: 2 distinct objects
//		System.out.println(dreadnought.getNumberOfStrings() + ": " + dreadnought.getMake());
//		System.out.println(om.getNumberOfStrings() + ": " + om.getMake());
		
		List<Guitar> guitars = new ArrayList<>();
		guitars.add(tele);
		guitars.add(dreadnought);
		guitars.add(lesPaul);
		guitars.add(om);
		guitars.add(strat);
		guitars.add(cutaway);
		
		
		Collections.sort(guitars);
		
		for (Guitar g : guitars) {
			System.out.println(g.toString());
			

		}
	}

}
