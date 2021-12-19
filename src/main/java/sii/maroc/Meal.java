package sii.maroc;

import sii.maroc.Restaurant;
import sii.maroc.Ticket;

public class Meal {

	public int servedDishes() {
		// TODO Auto-generated method stub
		int nbOfDishes = Restaurant.getNBSalads() + Ticket.getNBPizzas();
		return nbOfDishes;
	}

	public int cookingDuration() {
		// TODO Auto-generated method stub
		int nbOfPizzas = Ticket.getNBPizzas();
		int nbOfSalads = Restaurant.getNBSalads();
		
		int durationSalads = 6 + (nbOfSalads -1) * 3;
		int durationsPizzas = 10 + (nbOfPizzas -1) * 5;
		
		if(nbOfPizzas == 0) {
			return durationSalads;
		}
		
		return durationSalads + durationsPizzas;
	}


}
