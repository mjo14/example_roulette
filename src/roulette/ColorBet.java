package roulette;

import util.ConsoleReader;

public class ColorBet extends Bet{

	public ColorBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	
	public String Prompt(){
		return ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
	}
	
	public boolean winBet(Wheel wheel, String betChoice){
		return wheel.getColor().equals(betChoice);
	}

}
