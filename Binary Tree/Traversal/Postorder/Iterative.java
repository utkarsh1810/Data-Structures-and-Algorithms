import java.util.Stack;

class Node {
  int data;
  Node left;
  Node right;

  Node(int item) {
    data = item;
    left = right = null;
  }
}

class Iterative {
  Node root;
  void postOrder() {
    if(root == null) 
      return;

    Stack<Node> stk1, stk2;
    stk1 = new Stack<>();
    stk2 = new Stack<>();

    stk1.push(root);
    
    while(!stk1.isEmpty()) {
      Node temp = stk1.pop();
      stk2.push(temp);

      if(temp.left != null) 
        stk1.push(temp.left);

      if(temp.right != null) 
        stk1.push(temp.right);
    }
    while (!stk2.isEmpty()) { 
      Node temp = stk2.pop(); 
      System.out.print(temp.data + " "); 
    } 


  }
  public static void main(String[] args) {
    Iterative tree = new Iterative();
    tree.root = new Node(1);
    tree.root.left = new Node(2); 
    tree.root.right = new Node(3); 
    tree.root.left.left = new Node(4); 
    tree.root.left.right = new Node(5); 
    tree.root.right.left = new Node(6); 
    tree.root.right.right = new Node(7); 
                    // Tree is like : 
                    //       1
                    //      / \
                    //     2    3
                    //   /  \  /  \
                    //  4   5 6    7
    System.out.println("Postorder traversal of the tree is :"):                   
    tree.postOrder(); 

  }
}
