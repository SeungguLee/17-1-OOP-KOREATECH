
public class Player {
	private int[] resultCount = new int[3];
	private PlayingStrategy strategy;
	Player(RandomStrategy r) {
		System.out.println("dddd");
	}
	Player(LastResultBasedStrategy e) {
		System.out.println("eeeeee");
	}
	public void setStrategy(PlayingStrategy strategy) {
		this.strategy = strategy;
	}
	public HandType nextHand(){
		return strategy.nextHand();
	}
	private int getGameCount(){
		int sum = 0;
		for(int i: resultCount) sum += i;
		return sum;
	}
	public void setResult(ResultType currentResult){
		++resultCount[currentResult.ordinal()];
		strategy.recordHistory(currentResult);
	}
	@Override
	public String toString(){
		return String.format("°ÔÀÓ¼ö: %d, ½Â: %d, ÆÐ: %d", 
			getGameCount(), resultCount[0], resultCount[1]);
	}
}
