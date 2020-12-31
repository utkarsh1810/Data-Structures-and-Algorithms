import java.util.Scanner;
class Insert {
  
  static class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data) {
      this.data = data;
      left = right = null;
    }
  }
  
  static Node find(int key, Node root) {
    if(root == null) 
      return root;
    else if(key < root.data) {         
      if(root.left != null)  
        return find(key, root.left);  //To find accurate positon at left(as its smaller) than root
        
       return root;         // If we found the exact position to insert the new node   --1
    }  
    else if(key > root.data) {
      if(root.right != null) 
        return find(key, root.right);   //To find accurate positon at right(as its greater) than root
       return root;    // If we found the exact position to insert the new node      --2 
    }
    return root;     // 1 & 2 can be ignored, need not to write(but are mentoined for ease of understanding)
  }

  static void insert(int key, Node root) { 
    Node position = find(key, root);
    if(position.data > key) {
      Node toInsert = new Node(key);
      position.left = toInsert;
      System.out.println("Inserted at left " +position.data);
    }
    else if(position.data < key) {
      Node toInsert = new Node(key);
      position.right = toInsert;
      System.out.println("Inserted at right "+position.data);
    }
    else if(position.data == key) {
      System.out.println("Please don't enter a key, that's already there in tree ! ");
    }
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
                    //        7
                    //      /  \
                    //     4    13
                    //   /  \   /  \ 
                    //  1   6  10  15

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the key you want to insert in the tree :");
    int key = sc.nextInt();

    insert(key, root);
    sc.close();
  }
}