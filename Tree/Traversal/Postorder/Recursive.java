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

  static void postorder(Node root) {
    if(root == null) 
      return;
    postorder(root.left); // Moves to left most child

    postorder(root.right); // Moves to the right most child

    System.out.print(root.data+ " ");  // Prints data at last
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
    System.out.println("Postorder traversal of the tree is :"):
    postorder(root);
  }
  
}