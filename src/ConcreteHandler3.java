
public class ConcreteHandler3 implements Handler {

	private Handler successor;
	private int type;
	
	public ConcreteHandler3(int type) {
		super();
		this.type = type;
	}
	

	public void setSuccessor(Handler successor) {
		this.successor = successor;
	}


	@Override
	public void handleRequest(int type) {
		// TODO Auto-generated method stub
		if(type==this.type){
			System.out.println("Handler by ConcreterHandler3");
		}else{
			System.out.println("Pass to successor");
			successor.handleRequest(type);
		}
	}

}
