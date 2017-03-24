import java.util.Observable;
import java.util.Observer;

public class NewsClient implements Observer {
	private String id;

	public NewsClient(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null || o.getClass() != getClass())
			return false;
		if (o == this)
			return true;
		NewsClient nc = (NewsClient) o;
		return id.equals(nc.id);
	}

	@Override
	public void update(Observable subj, Object data) {
		String latestFeed = (String) data;
		System.out.printf("%s: %s\n", id, latestFeed);
	}

}
