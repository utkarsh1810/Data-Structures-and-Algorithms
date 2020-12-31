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

  static void preorder(Node root, int level) {
    if(root == null) 
      return;
      if (level == 1) 
      System.out.print(root.data + " "); 
      else if (level > 1) { 
          preorder(root.left, level-1); 
          preorder(root.right, level-1); 
      } 
  }

  static int height(Node root) {
    if (root == null) 
           return 0; 
        else
        { 
            /* compute  height of each subtree */
            int lheight = height(root.left); 
            int rheight = height(root.right); 
              
            /* use the larger one */
            if (lheight > rheight) 
                return(lheight+1); 
            else return(rheight+1);  
        } 
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

    int hgt = height(root);
    System.out.println("Levelorder traversal of the tree is :");
    for(int i = 0; i<=hgt; i++) 
      preorder(root, i);
  }
  
}