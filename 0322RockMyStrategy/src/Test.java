//2012136092
//ÀÌ½Â±¸

public class Test {

	public static void main(String[] args) {
		Player player1 = new Player(new RandomStrategy());
		Player player2 = new Player(new LastResultBasedStrategy());
		player1.setStrategy(new RandomStrategy());
		player2.setStrategy(new LastResultBasedStrategy());
		for(int i=0; i<20; i++){
			HandType hand1 = player1.nextHand();
			HandType hand2 = player2.nextHand();
			System.out.printf("%s vs %s\n", hand1, hand2);
			if(hand1==hand2){
				System.out.println("¹«\n");
				player1.setResult(ResultType.DRAWN);
				player2.setResult(ResultType.DRAWN);
			}
			else if(hand1.winValueOf()==hand2){
				System.out.println("ÇÃ·¹ÀÌ¾î2: ½Â\n");
				player1.setResult(ResultType.LOST);
				player2.setResult(ResultType.WON);
			}
			else{
				System.out.println("ÇÃ·¹ÀÌ¾î1: ½Â\n");
				player1.setResult(ResultType.WON);
				player2.setResult(ResultType.LOST);
			}
		}
	}

}

