package roulette;

import util.ConsoleReader;

public class EvenBet extends Bet{

	public EvenBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	
	public String Prompt(){
		return ConsoleReader.promptOneOf("Please bet", "even", "odd");
	}
	
	public boolean winBet(Wheel wheel, String betChoice){
		return (wheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (wheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}

}
