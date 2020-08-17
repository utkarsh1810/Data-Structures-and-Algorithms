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
    if (root == null)
      return;

    Stack<Node> stk = new Stack<Node>();
    Node curr = root;

    while (curr != null || stk.size() > 0) {
      while (curr != null) {
        stk.push(curr);
        curr = curr.left;
      }
      curr = stk.pop();
      System.out.println(curr.data + " ");
      curr = curr.right;
    }
  } 
  public static void main(String[] args) {
    Iterative tree = new Iterative();
    tree.root = new Node(1);
    tree.root.left = new Node(2);
    tree.root.right = new Node(3);
    tree.root.left.left = new Node(4);
    tree.root.left.right = new Node(5);
    tree.inorder();
  }
}