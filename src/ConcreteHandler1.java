
public class ConcreteHandler1 implements Handler {

	private Handler successor;
	private int type;
	
	public ConcreteHandler1(int type) {
		super();
		this.type = type;
	}


	@Override
	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}



	@Override
	public void handleRequest(int type) {
		// TODO Auto-generated method stub
		if(type==this.type){
			System.out.println("Handler by ConcreterHandler1");
		}else{
			System.out.println("Pass to successor");
			successor.handleRequest(type);
		}
	}

}
