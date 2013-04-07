//testing testing Github
public class BinaryTree {
	
	Node root;
	
	public BinaryTree()
	{
		root=null;
	}
	
	
	public class Node
	{
		Node left;
		Node right;
		int data;
		
		public Node(int data)
		{
			this.data=data;
		}
		
	}
	
	public boolean isBinaryTree()
	{
		return isBinaryTree(root);
	}
	
	private boolean isBinaryTree(Node node)
	{
		if(node==null) return false;
		if(node.left.data<node.right.data){
			isBinaryTree(node.left);
			isBinaryTree(node.right);
		}
		else{
			return false;
		}
		return true;
	}
	
	

}
