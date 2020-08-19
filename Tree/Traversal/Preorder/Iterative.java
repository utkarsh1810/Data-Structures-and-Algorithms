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

  void preorder() {
    if (root == null)     // If tree is empty
      return;

    Stack<Node> stk = new Stack<Node>();
    stk.push(root);

    while (stk.empty() == false) {      
            // Pop the top item from stack and print it 
            Node temp = stk.peek(); 
            System.out.print(temp.data + " "); 
            stk.pop(); 
  
            // Push right and left children of the popped node to stack 
            if (temp.right != null) { 
                stk.push(temp.right); 
            } 
            if (temp.left != null) { 
                stk.push(temp.left); 
            } 
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

    tree.preorder();
  }
}