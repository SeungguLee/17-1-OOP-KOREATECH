//2012136092
//�̽±�

import java.util.Random;

public class GawiBawiBoOrder implements PlayingStrategy {
	Random random = new Random();
	HandType prevHand = null;

	public void setPrevHand(HandType prevHand) {
		this.prevHand = prevHand;
	}

	@Override
	public HandType nextHand() {
		System.out.printf("\n����:%s\n", prevHand);
		if(prevHand==null)
			prevHand = HandType.valueOf(random.nextInt(3));
		else if(prevHand == HandType.GAWI)
			prevHand = HandType.BAWI;
		else if(prevHand == HandType.BAWI)
			prevHand = HandType.BO;
		else 
			prevHand = HandType.GAWI;
		return prevHand;
	}

	@Override
	public void recordHistory(ResultType currResult) {
	}

}
