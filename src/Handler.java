
public interface Handler {
	void handleRequest(int type);
	void setSuccessor(Handler successor);
}
