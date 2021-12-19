package sii.maroc;

public class Restaurant {
	private static int nbSalads;
	private int Mozzarella;
	private int Tomatoes;
	String MozzarellaS ;
	String TomatoesS ;
	
	public static int getNBSalads() {
		return nbSalads;
	}

	public Restaurant(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
		String MozzarellaS = string;
		String TomatoesS = string2;
		Mozzarella = Integer.parseInt(MozzarellaS.substring(0, 1));
		Tomatoes = Integer.parseInt(TomatoesS.substring(0, 1));

	}

	public Restaurant(String string, String string2, String string3, String string4, String string5, String string6) {
		// TODO Auto-generated constructor stub
	}

	public Ticket order(String string) {
		// TODO Auto-generated method stub
		nbSalads = Integer.parseInt(string.substring(0, 1));
		Ticket ticket = new Ticket();
		return ticket;
	}

	public Meal retrieve(Ticket ticket) {
		// TODO Auto-generated method stub
		Meal meal = new Meal();
		return meal;
	}

	public void OutofStock(String order) throws DishException {
		int nbOfCommand = Integer.parseInt(order.substring(0, 1));
		if(Mozzarella < nbOfCommand || Tomatoes < 2*nbOfCommand ){
			throw new DishException();
		}
	}

	public String getMozzarella() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getFlour_amount() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getTomatos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
