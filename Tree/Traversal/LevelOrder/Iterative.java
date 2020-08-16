import java.util.Queue;
import java.util.LinkedList;

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
  void levelOrder() {
    if(root == null) 
      return;
    
  Queue<Node> q = new LinkedList<>();
  q.add(root);
  System.out.println("Level order traversal of the tree is :");
  while(true) {

    int qSize = q.size();
    if(qSize == 0) 
      break;
    
    while(qSize > 0) {
      Node temp = q.peek();
      System.out.print(temp.data + " ");
      q.remove();
      if(temp.left != null) 
        q.add(temp.left);
      if(temp.right != null) 
        q.add(temp.right);
      qSize--;
    }
    System.out.println();
  }

}
  public static void main(String[] args) {
    Iterative tree = new Iterative();
    tree.root = new Node(1);
    tree.root.left = new Node(2); 
    tree.root.right = new Node(3); 
    tree.root.left.left = new Node(4); 
    tree.root.left.right = new Node(5); 
    tree.root.right.right = new Node(6); 

    tree.levelOrder();
  }
}