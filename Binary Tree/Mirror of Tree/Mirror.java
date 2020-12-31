import java.util.*;
public class Mirror {
  static class Node {
    int data;
    Node left;
    Node right;
  
    public Node(int item) {
      data = item;
      left = right = null;
    }
  }

  static void inorder(Node root) {  // Inorder traversal of binary tree
    if(root == null) 
      return;
    inorder(root.left); 

    System.out.print(root.data+ " "); 

    inorder(root.right); 
  }
  
 static Node mirror(Node root) {
     if(root == null) 
        return null;
        Node mrr = new Node(root.data);  // Creating new Tree 
        mrr.left = mirror(root.right);   // Assigning left to the right side 
        mrr.right = mirror(root.left);   // Assigning right to the left side 
        return mrr;
 }
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2); 
    root.right = new Node(3); 
    root.left.left = new Node(4); 
    root.left.right = new Node(5); 
    root.right.left = new Node(6); 
    root.right.right = new Node(7); 
                    // Tree is like : 
                    //       1
                    //      / \
                    //     2    3
                    //   /  \  / \
                    //  4   5 6   7
    System.out.println("Inorder traversal of the tree is :");
    inorder(root);
    Node rooot = new Node(root.data);
    rooot = mirror(root);
    System.out.println("Inorder traversal of the mirror tree is :");
    inorder(rooot);
  }
  
}