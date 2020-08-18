import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Delete {

  static class Node {
    int data;
    Node left;   // For left nodes of the tree
    Node right;  // For right nodes of the tree
  
    Node(int data) {
      this.data = data;
      left = right = null;
    }
  }
  static Node deleteNode(int key, Node root) {
    if(root == null)  
      return root;

    // To find which element to delete
    if(key < root.data) 
      root.left = deleteNode(key, root.left);
    else if(key > root.data) 
      root.right = deleteNode(key, root.right);
    else {
      if(root.left == null) //  For having either one child or for not any child
        root = root.right;
      else if(root.right == null) 
        root = root.left;
      else {      // For more than one child 
        root.data = minRight(root.right);  // Finding appropriate node to change with
        // root.data = maxLeft(root.left);  Can also use this 
        root.right = deleteNode(root.data, root.right);
      }
    }
    return root;
  }
  static int minRight(Node root) {
    int minimum = root.data;
    while(root.left != null) {
      minimum = root.left.data;
      root = root.left;
    }
    return minimum;
  }
  public static void main(String[] args) {
    Node root = new Node(7);
    root.left = new Node(4);
    root.right = new Node(13);
    root.left.left = new Node(1);
    root.left.right = new Node(6);
    root.right.left = new Node(10);
    root.right.right = new Node(15);
                    // Tree is like : 
                    //       7
                    //      / \
                    //     4    13
                    //   /  \  /  \ 
                    //  1   6 10  15

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the key you want to delete from the tree :");
    int key = sc.nextInt();
    sc.close();

    Node temp = deleteNode(key, root);
    levelOrder(temp);  
  }
  static void levelOrder(Node root) {
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
}