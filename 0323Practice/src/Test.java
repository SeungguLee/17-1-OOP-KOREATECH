
public class Test {
	public static void main(String[] args) {
		NewsPublisher server = new SportsNewsPublisher();
		NewsPublisher server1 = new ITNewsPublisher();
		NewsClient client1 = new NewsClient("Sangjin");
		NewsClient client2 = new NewsClient("Jinhee");
		server.addObserver(client1);
		server.addObserver(client2);
		server1.addObserver(client1);
		server1.addObserver(client2);
		server.setNewFeed("KOR 1 : BRA 0");
		server.setNewFeed("KOR 2 : BRA 0");
		server1.setNewFeed("KOR 22 : BRA 0");
		server1.setNewFeed("KOR 23 : BRA 0");
		server.deleteObserver(client2);
		server1.deleteObserver(client2);
		server.setNewFeed("KOR 2 : BRA 1");
	}
}
