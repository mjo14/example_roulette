package roulette;

import util.ConsoleReader;

public class SingleNumberBet extends Bet{

	public SingleNumberBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Prompt() {
		return "" + ConsoleReader.promptRange("Enter a single number",
	            1, Wheel.NUM_SPOTS - 1);
	}

	@Override
	public boolean winBet(Wheel wheel, String betChoice) {
		int start = Integer.parseInt(betChoice);
        return (start == wheel.getNumber());
	}

}
