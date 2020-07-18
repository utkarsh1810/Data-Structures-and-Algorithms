import java.util.Scanner;
public class ReversePrint {
  
  static Node head;
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter no. of Nodes of linked-list");
     int n = sc.nextInt();
     for(int i = 0; i < n; i++ ) {
       int entry = sc.nextInt();
       head = addAtEnd(head , entry);
     }
     sc.close();
     print(head);
     System.out.println("\nReversed linked-list is");
     reverse(head);
   }
   static Node addAtEnd(Node head , int entry) {
     Node newNode = new Node(entry);
     if(head == null) {
       head = newNode;
       return head;
     }
     Node temp = head;
     while(temp.next != null) 
        temp = temp.next;
     temp.next = newNode;
     return head;
   }
   static void print(Node head) {
    System.out.println("The linked-list is :");
    while(head != null) {
      System.out.print(head.data);
      if(head.next != null) {
        System.out.print("->");
      }
      head = head.next;
    }
   }
   static void reverse(Node head) {
     if(head != null) {
       reverse(head.next);
       if(head.next != null)
        System.out.print("->");
       System.out.print(head.data);
       
     }
   }
}