package roulette;

import util.ConsoleReader;

public class TwoConsecBet extends Bet{

	public TwoConsecBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Prompt() {
		return "" + ConsoleReader.promptRange("Enter first of two consecutive numbers",
	            1, Wheel.NUM_SPOTS - 2);
	}

	@Override
	public boolean winBet(Wheel wheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start <= wheel.getNumber() && wheel.getNumber() < start + 2);
	}

	
}
