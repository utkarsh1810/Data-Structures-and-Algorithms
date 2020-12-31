import java.util.Scanner;

class Find {
  
  static class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data) {
      this.data = data;
      left = right = null;
    }
  }
  
  static void find(int key, Node root) {
    if(root == null)                  // If tree is empty or key not found
      System.out.println("Key not found !");
    if(key == root.data)              // If key is found in the tree
      System.out.println("Key found in the tree :)");
    else if(key < root.data)          // Serching in the left tree as, it key is less than root
      find(key, root.left);
    else if(key > root.data)          // Serching in the right tree as, it key is greater than root
      find(key, root.right);
  }

  public static void main(String[] args) {
    Node root = new Node(50);
    root.left = new Node(40);
    root.right = new Node(60);
    root.left.left = new Node(35);
    root.left.right = new Node(45);
    root.right.left = new Node(55);
    root.right.right = new Node(65);
                    // Tree is like : 
                    //       50
                    //     /    \
                    //    40     60
                    //   /  \    /  \ 
                    //  35   45 55  65

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the key you want to find in the tree :");
    int key = sc.nextInt();

    find(key, root); 
    sc.close();
  }
}