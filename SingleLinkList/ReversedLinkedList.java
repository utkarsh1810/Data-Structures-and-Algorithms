import java.util.Scanner;
public class ReversedLinkedList {
  
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
     head = reverse(head);
     print(head);
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

   static Node reverse(Node head) {
     Node prev = null;
     Node curr = head;
     Node next = null;
     while(curr != null) {
       next = curr.next;
       curr.next = prev;
       prev = curr;
       curr = next;
     }
     head = prev;
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
    System.out.println();
   }
}