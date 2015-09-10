package roulette;

import util.ConsoleReader;

public class HighLowBet extends Bet{

	public HighLowBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String Prompt() {
		return ConsoleReader.promptOneOf("Please bet", "High", "Low");
	}

	@Override
	public boolean winBet(Wheel wheel, String betChoice) {
		return (wheel.getNumber() <= 18 && betChoice.equals("Low")) ||
                (wheel.getNumber() > 18 && betChoice.equals("High"));
	}

}
