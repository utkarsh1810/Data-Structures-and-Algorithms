import java.util.*;
public class Tree
{
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int d) {
            data = d;
            left = right = null;
        }
    }
    static Node root;
	public static void main(String[] args) {
		int arr[] = {4,5,6,7,3,5,6,5};
		int n = arr.length;
		root = tree(arr,n);
		inorder(root);
  }
	static Node tree(int arr[], int n) {
	    Queue<Node> q = new LinkedList<>();
	    int i=0;
	    Node temp = new Node(arr[i++]);
	    q.add(temp);   // This will be head of the tree
	        while(i<n){
	          Node t=q.poll(); // Getting top most value 
	          if(i<n) {
	              t.left=new Node(arr[i++]);
	              q.add(t.left);
	          }
	          if(i<n) {
	              t.right=new Node(arr[i++]);
	              q.add(t.right);
	          }
	        }
	    
	    return temp;
	}
	static void inorder(Node head) {  // Inorder traveresal of binary tree using recursion
	    if(head == null) 
	        return;
	    inorder(head.left);
				System.out.print(head.data +" ");
		inorder(head.right);
    }
    // Tree will look like
            //        4
            //      /   \
            //     5     6
            //    / \   / \
            //   7   3 5   6
            //  /
            // 5 
}
