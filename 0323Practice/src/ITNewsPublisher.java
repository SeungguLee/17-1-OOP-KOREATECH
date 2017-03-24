import java.util.Observer;

public class ITNewsPublisher implements NewsPublisher {
	private final ImprovedObservable observable = new ImprovedObservable();
	
	
	
	
	private String latestFeed;

	@Override
	public void setNewFeed(String newFeed) {
		latestFeed = newFeed;
		observable.setChanged();
		notifyObservers(latestFeed);
	}

	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		observable.addObserver(o);
	}

	@Override
	public void deleteObserver(Observer o) {
		// TODO Auto-generated method stub
		observable.deleteObserver(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		observable.notifyObservers();
	}

	@Override
	public void notifyObservers(Object data) {
		// TODO Auto-generated method stub
		observable.notifyObservers(data);
	}

}
