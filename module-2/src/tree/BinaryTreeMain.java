package tree;

public class BinaryTreeMain {

	public static void main(String[] args) {
		BinarySearchTree ob=new BinarySearchTree();
		ob.insert(40);
		ob.insert(50);
		ob.insert(30); 
		ob.insert(20);
		ob.insert(100);
		ob.insert(90);
		ob.insert(12);
		ob.insert(35);
		System.out.println("search 90 : " +ob.search(90));
		System.out.println("IN ORDER TRAVERSING");
		ob.traverseInOrder(ob.getRoot());
		System.out.println();
		System.out.println("LEVEL ORDER TRAVERSING");
		ob.traverseLevelOrder(ob.getRoot());
		ob.deleteData(100);
		System.out.println();
		System.out.println("AFTER DELETE 100");
		ob.traverseLevelOrder(ob.getRoot());

	}

}
