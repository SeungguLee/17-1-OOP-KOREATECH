//2012136092
//�̽±�

import java.util.Random;

public class LastResultBasedStrategy implements PlayingStrategy {
	Random random = new Random();
	HandType prevHand = null;
	ResultType prevResult = null;

	public void setPrevHand(HandType prevHand) {
		this.prevHand = prevHand;
	}

	@Override
	public HandType nextHand() {
		System.out.printf("\n����:%s, �������:%s\n", prevHand, prevResult);
		if(prevHand==null || prevResult==null)
			prevHand = HandType.valueOf(random.nextInt(3));
		else if(prevResult == ResultType.LOST)
			prevHand = prevHand.winValueOf().winValueOf();
		else if(prevResult == ResultType.DRAWN)
			prevHand = HandType.valueOf((prevHand.ordinal() + 1 + random.nextInt(2)) % 3);
		else 
			prevHand = HandType.valueOf((prevHand.ordinal() + 1 + random.nextInt(2)) % 3);
		return prevHand;
	}

	@Override
	public void recordHistory(ResultType currResult) {
		prevResult = currResult;
	}

}
