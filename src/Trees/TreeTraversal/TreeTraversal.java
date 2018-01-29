package Trees.TreeTraversal;

public class TreeTraversal {

	Node root;
	
	
	public TreeTraversal() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	public void preorder(Node node) {
		if(node == null) {
			return;
		}
		
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	
	public void inorder(Node node) {
		if(node == null) {
			return;
		}
		
		
		preorder(node.left);
		System.out.print(node.data+" ");
		preorder(node.right);
	}
	
	public void postorder(Node node) {
		if(node == null) {
			return;
		}
		
		
		preorder(node.left);
		preorder(node.right);
		System.out.print(node.data+" ");
	}
	
	
	public void callpreorder() { preorder(root);}
	public void callinorder() { inorder(root);}
	public void callpostorder() { postorder(root);}
	
	public void calldeleteTree(Node noderef) { deleteTree(noderef); noderef= null;}
		
	private void deleteTree(Node node) {
		// TODO Auto-generated method stub
		if(node == null) {
			return;
		}
		
		
		deleteTree(node.left);
		deleteTree(node.right);
		System.out.println("The deleted node is "+node.data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		
		TreeTraversal tree = new TreeTraversal();
		
		tree.root =  new Node(1);
		
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		 
		tree.callpreorder();
		System.out.println();
		tree.callinorder();
		System.out.println();
		tree.callpostorder();
		
		System.out.println();
		tree.calldeleteTree(tree.root);
	}

}

class Node {
	int data;
	Node left,right;
	public Node(int data) {
		this.data = data;
	}
}
