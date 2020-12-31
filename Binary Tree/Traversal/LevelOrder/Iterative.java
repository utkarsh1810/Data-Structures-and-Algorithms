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
    if(root == null)     // If tree is empty
      return;
    
  Queue<Node> q = new LinkedList<>();
  q.add(root);
  System.out.println("Level order traversal of the tree is :");

  while(true) {
    int qSize = q.size();
    if(qSize == 0)    // Loop will break when queue will empty
      break;
    
    while(qSize > 0) {  
      // Because of traversing acc to qSize each element get chance to check its left and right
      Node temp = q.peek();    // To get the root 
      System.out.print(temp.data + " "); 
      q.remove();
      // Both if condition will help to add left as well as right element to add in sequence
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
     // Tree is like : 
                    //       1
                    //      / \
                    //     2    3
                    //   /  \    \  
                    //  4   5     6
    System.out.println("Levelorder traversal of the tree is :");
    tree.levelOrder();
  }
}