
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Handler handler1=new ConcreteHandler1(1);
		Handler handler2=new ConcreteHandler2(2);
		Handler handler3=new ConcreteHandler3(3);
		
		handler1.setSuccessor(handler2);
		handler2.setSuccessor(handler3);
		
		Client client=new Client(handler1);
		client.handleRequest(3);
	}

}
