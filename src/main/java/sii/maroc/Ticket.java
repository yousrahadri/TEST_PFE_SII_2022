package sii.maroc;

public class Ticket {
	private static int NBPizzas;
	
	public static int getNBPizzas() {
		return NBPizzas;
	}

	public Ticket and(String string) {
		Ticket tic = new Ticket();
		NBPizzas = Integer.parseInt(string.substring(0, 1));
		return tic;
	}


}
