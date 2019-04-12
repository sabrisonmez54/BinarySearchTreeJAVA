
public class BinarySearchTree {
	
	private BSTNode root = null;
	
	private int [] A;
	private int i;
	
	public void insert(int value) {
		if(isEmpty()) 	root = new BSTNode(value);
		
		else 	root.insert(value);
	}
	
	public int min() {
		return root.min();
	}
	
	public int max() {
		return root.max();
	}
	
	public int sum() {
		if (isEmpty())  return 0;
		
		else 			return root.sum();	
	}
	
	public int tilt() {
		if (isEmpty())  return 0;
		
		else 			return root.tilt();	
	}
	
	public int count() {
		if (isEmpty())  return 0;
		
		else 			return root.count();	
	}
	
	public int height() {
		if (isEmpty())	return 0;
		
		else 			return root.height();
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void inOrder() {
		if(!isEmpty()) {
			A = new int[count()];
			
			i = 0;
			
			root.inOrder();
		}
	}
	
	public class BSTNode {
		int x;
		BSTNode left = null;
		BSTNode right = null;
		
		public BSTNode(int x) { //constructor
			this.x = x;
		}
		
		public void insert(int value) {
			if (value < x) {
				if (left != null) 	left.insert(value);
				
				else 		left = new BSTNode(value);
			}
			if (value > x) {
				if (right != null) 	right.insert(value); //insert recursively into right subtree
				
				else 		right = new BSTNode(value);  //if there is no right subtree then make a right subtree by creating a new node
			}
		}
		
		public int min() {
			if(left != null) 	return left.min();
			
			else 				return x;
		}
		
		public int max() {
			if(right != null) 	return right.max();
			
			else 				return x;
		}
		
		public void inOrder() {
			if(left != null) 	left.inOrder();
			
			A[i++] = x; // i++ assigns after
			
			if(right != null) 	right.inOrder();
			
		}
		
		public int count() {
			int c = 1; //counts in the root node
			
			if(left != null)  c+= left.count(); //recursive calls to left and right; they are also bst.
			if(right != null)  c+= right.count();
			
			return c;
		}
		
		public int sum() {
		int s = x;
		
		if(left != null)  s+= left.sum(); 
		if(right != null)  s+= right.sum();
		
		return s;
		}
		
		public int tilt() {
		
			return abs(left.sum() - right.sum());
		}
		
		public int height() {
			int LH = 0; 	//left height
			int RH = 0; 	//right height ; 0 if there is no subtree
			
			if(left != null)  LH+= left.height(); 
			if(right != null)  RH+= right.height();
			
			return 1 + max(LH,RH);
		}
		
		public int max(int a, int b) {
			if (a >= b) return a;
						//return b;
			else  		return max(b,a); //  recursive call
			
		}
	}
	
		public int abs(int val) {
			if (val >= 0) return val;
		
			else 	return abs(-val);
	}
}
