package list;
import java.util.List;
import java.util.ArrayList;
import list.Node;
//一个简单的单链表
public class SinglyLinkedList {
	

    protected List<Node> aList = new ArrayList<Node>();
    protected int size = 0;
    public void addNode(Node aNode) {
    	aList.add(aNode);
    	this.size++;
    	}
    
    public void printNodes() {
    	if(this.size>0) {
    		Node aNode = this.aList.get(0);
    		while(aNode!=null) {
    			System.out.println(aNode.name);
    			aNode = aNode.nextNode;
    		}
    	}else {
    		System.out.println("链表是空的。");
    	}
    }
    
    public static void main(String[] args) {
    	SinglyLinkedList a = new SinglyLinkedList();
    	Node aNode = new Node("1");
    	a.addNode(aNode);
    	a.printNodes();
    }
}
