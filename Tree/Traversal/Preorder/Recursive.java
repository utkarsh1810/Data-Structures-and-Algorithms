public class Recursive {
  static class Node {
    int data;
    Node left;
    Node right;
  
    public Node(int item) {
      data = item;
      left = right = null;
    }
  }

  static void preorder(Node root) {
    if(root == null) 
      return;
    System.out.print(root.data+ " "); // It prints root at first 
    
    preorder(root.left);   // Secondly left child

    preorder(root.right);  // Then the right child
  }
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
                    // Tree is like : 
                    //       1
                    //      / \
                    //     2    3
                    //   /  \  
                    //  4   5 
    System.out.println("Preorder traversal of the tree is :");
    preorder(root);
  }
  
}