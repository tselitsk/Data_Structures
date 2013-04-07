import java.util.Hashtable;


public class Node {
	Node next=null;
	int data;
	
	public Node(int d)
	{
		data=d;
	}
	
	void appendToTail(int d)
	{
		Node end=new Node(d);
		Node n=this;
		
		while(n.next !=null)
		{
			n=n.next;
		}
		n.next=end;
	}
	
	public Node deleteNode(Node head, int data)
	{
		Node n=head;
		if(n.data==data)
		{
			return head.next;
		}
		
		while(n.next==null){
			
			if(n.next.data==data){
				n.next=n.next.next;
				return head;
			}
			n=n.next;
		}
		return head;
	}
	
	public void deleteDups(Node n)
	{
		Node previous=null;
		Hashtable hashT=new Hashtable();
			while(n!=null)
			{
				if(hashT.containsKey(n.data))
					previous.next=n;
				else{
					hashT.put(n.data, true);
			}
		
	}
	

}
}