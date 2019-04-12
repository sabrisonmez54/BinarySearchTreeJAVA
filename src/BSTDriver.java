
public class BSTDriver {

	public static void main(String [] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		
		int [] x = {23,56,2,7,8,12,34,76,89,11};
		
		for(int i = 0; i < x.length; i++) {

			bst.insert(x[i]);
			
		}
		
		System.out.println("count of nodes: " + bst.count());
		
		System.out.println("height of tree: "+ bst.height());
		
		System.out.println("min value: " + bst.min());
		
		System.out.println("max value: " + bst.max());
		
		System.out.println("sum of values: " + bst.sum());
		
		System.out.println("tilt of tree: " + bst.tilt());
	}
}
