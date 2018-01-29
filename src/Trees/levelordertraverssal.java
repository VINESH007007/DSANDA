package Trees;

class Node {
	int item;
	Node left,right;
	
	public Node(int item) {
		this.item = item;
//		left = right = null;
	}
}

public class levelordertraverssal {

	
	Node root;
	
	public levelordertraverssal() {
		// TODO Auto-generated constructor stub
		root = null;
	}
	
	void printlevelorder() {
		//System.out.println("hi");
		int h = height(root);
		
		System.out.println(h);
		int i;
		
		for(i=1;i<=h;i++) {
			printGivenLevel(root,i);
			
		}
	}
	void printGivenLevel(Node root, int level) {
		if(root == null)
			return;
		if(level == 1)
			System.out.print(root.item+" ");
		else if(level >1) {
			printGivenLevel(root.left,level-1);
			printGivenLevel(root.right,level-1);
		}		
	}

	int height(Node root) {
		if(root == null)
			return 0;
		else {
			int lheight = height(root.left);
			int rheight = height(root.right);
			
			if(lheight>rheight)
				return (lheight+1);
			else
				return (rheight+1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		levelordertraverssal t = new levelordertraverssal();
		//System.out.println("hi");
		t.root =  new Node(1);		
		t.root.left = new Node(2);
		t.root.right = new Node(3);	
		t.root.left.left = new Node(4);
		t.root.left.right = new Node(5);
		//t.root.left.right.right = new Node(5);
		
		t.printlevelorder();//(t.root);
	}

}


