//2012136092
//�̽±�

public class Test {

	public static void main(String[] args) {
		Player player1 = new Player(new RandomStrategy());
		Player player2 = new Player(new LastResultBasedStrategy());
		player1.setStrategy(new RandomStrategy());
		player2.setStrategy(new LastResultBasedStrategy());
		for(int i=0; i<5; i++){
			HandType hand1 = player1.nextHand();
			HandType hand2 = player2.nextHand();
			System.out.printf("%s vs %s\n", hand1, hand2);
			if(hand1==hand2) System.out.println("��");
			else if(hand1.winValueOf()==hand2)
				System.out.println("�÷��̾�2: ��");
			else
				System.out.println("�÷��̾�1: ��");
		}
	}

}

