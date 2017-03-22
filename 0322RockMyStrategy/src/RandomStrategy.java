import java.util.Random;

public class RandomStrategy implements PlayingStrategy {
	private Random randomGen = new Random();
	Random random = new Random();
	@Override
	public HandType nextHand() {
		return HandType.valueOf(randomGen.nextInt(3));
	}

	@Override
	public void recordHistory(ResultType currentResult) {
		// TODO Auto-generated method stub

	}

}
