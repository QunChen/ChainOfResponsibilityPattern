
public class Client {

	private Handler handler;
		
	public Client(Handler handler) {
		super();
		this.handler = handler;
	}


	public void handleRequest(int type){
		handler.handleRequest(type);
	}
}
