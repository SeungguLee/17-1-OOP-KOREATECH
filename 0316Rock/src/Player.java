
public class Player {
	private int[] resultCount = new int[3];
	private PlayingStrategy strategy;
	Player(RandomStrategy r) {
	}
	Player(LastResultBasedStrategy e) {
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
	}
	@Override
	public String toString(){
		return String.format("���Ӽ�: %d, ��: %d, ��: %d", 
			getGameCount(), resultCount[0], resultCount[1]);
	}
}
