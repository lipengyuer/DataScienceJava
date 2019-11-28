package list;

public class Node{
	protected String name;
	protected Node nextNode;
	
	public Node(String name) {
		this.name = name;
	}
	
	public void setNext(Node nextNode) {
		this.nextNode = nextNode;
	}
}
