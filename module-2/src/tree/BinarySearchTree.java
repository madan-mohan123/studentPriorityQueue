package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
TreeNode root;
public TreeNode getRoot() {
	return root;
}
public void insert(int data) {
	TreeNode node=new TreeNode(data);
	if(root==null) {
		root=node;
	}
	else {
		TreeNode temp=root;
		TreeNode parent=null;
		while(temp!=null) {
			parent=temp;
			if(data<=temp.getData()) {
				temp=temp.getLeft();
			}
				else {
					temp=temp.getRight();
				}
			}
		if(node.getData()<=parent.getData()) {
			parent.setLeft(node);
		}
			else {
				parent.setRight(node);
			}
		}
		
		}
public boolean search(int data) {
	boolean res=false;
	TreeNode temp=root;
	while(temp!=null) {
		if(temp.getData()==data) {
			
				res=true;
				break;
			}
		else {
			if(data<=temp.getData()) {
				temp=temp.getLeft();
			}
			else {
				temp=temp.getRight();
			}
		}
		}
	return res;
}
void traverseInOrder(TreeNode node) {
	if(node!=null) {
		traverseInOrder(node.getLeft());
		System.out.print(node.getData()+" ");
		traverseInOrder(node.getRight());
	}
}
void traverseLevelOrder(TreeNode node) {
	if(root==null) {
		System.out.println("empty tree");
	}
	else {
		Queue<TreeNode> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode currentNode;
			currentNode=queue.remove();
			System.out.print(currentNode.getData()+" ");
			if(currentNode.getLeft()!=null) {
				queue.add(currentNode.getLeft());
			}
			if(currentNode.getRight()!=null) {
				queue.add(currentNode.getRight());
			}
		}
	}
}
public void deleteData(int data) {
	root=deleteRec(root,data);
	
}
TreeNode deleteRec(TreeNode root,int data) {
	if(root==null) {
		return root;
	}
	if(data < root.getData() ) {
		root.setLeft(deleteRec(root.getLeft(),data));
	}
	else if(data > root.getData()) {
		root.setRight(deleteRec(root.getRight(),data));
	}
	else {
		if(root.getLeft() == null) {
			return root.getRight();
		
		}
		else if(root.getRight()== null) {
			return root.getLeft();
		}
		root.setData(minValue(root.getRight()));
		root.setRight(deleteRec(root.getRight(),root.getData()));
	}
	return root;
	
}
int minValue(TreeNode root) {
	int min=root.getData();
	while(root.getLeft()!=null) {
		min=root.getLeft().getData();
		root=root.getLeft();
	}
	return min;
}


}

