package roulette;

import util.ConsoleReader;

public class ThreeConsecBet extends Bet{

	public ThreeConsecBet(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	public String Prompt(){
		return "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
            1, Wheel.NUM_SPOTS - 3);
	}
	public boolean winBet(Wheel wheel, String betChoice){
		int start = Integer.parseInt(betChoice);
        return (start <= wheel.getNumber() && wheel.getNumber() < start + 3);
	}
}
