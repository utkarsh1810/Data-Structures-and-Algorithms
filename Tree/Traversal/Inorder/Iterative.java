import java.util.Stack;

class Node {
  int data;
  Node left;
  Node right;

  public Node(int item) {
    data = item;
    left = right = null;
  }
} 

class Iterative {
  Node root;

  void inorder() {
    if (root == null)     // If tree is empty
      return;

    Stack<Node> stk = new Stack<Node>();
    Node curr = root;

    while (curr != null || stk.size() > 0) {
      while (curr != null) {
        stk.push(curr);    // Inserting left elements 
        curr = curr.left;  
      }
      curr = stk.pop();   // Poping as printing start from the last left node than root
      System.out.println(curr.data + " ");
      curr = curr.right;  // Right after poping left as it needs to print at last
    }
  } 
  public static void main(String[] args) {
    Iterative tree = new Iterative();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
                    // Tree is like : 
                    //       1
                    //      / \
                    //     2    3
                    //   /  \  
                    //  4   5 
    System.out.println("Inorder traversal of the tree is :");
    tree.inorder();
  }
}