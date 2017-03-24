import java.util.Observable;

public class SportsNewsPublisher extends Observable implements NewsPublisher {
	private String latestFeed;

	@Override
	public void setNewFeed(String newFeed) {
		latestFeed = newFeed;
		setChanged();
		notifyObservers(latestFeed);
	}

}
