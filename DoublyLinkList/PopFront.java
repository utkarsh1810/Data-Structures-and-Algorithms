import java.util.Scanner;
public class PopFront {

  static Node head;  //Pointer that always point to the first node of the linked-list
  static Node tail;  //Pointer that always point to the last node of the linked-list
  static class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
      this.data = data;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the linked-list :");
    int n = sc.nextInt();
    for(int i = 0; i < n; i++) {
      int entry = sc.nextInt();
      head = addAtLast(head , entry);
    }
    sc.close();
    print(head);
    head = popFront(head); 
    print(head);
    
  }
  static Node addAtLast(Node head, int entry) {
    Node newNode = new Node(entry);
    if(head == null) {
      head = newNode;
      newNode.next = null;
      newNode.prev = null;
      tail = newNode;
    }
    Node temp = head;
    while(temp.next != null) {
      temp = temp.next;
    }
    temp.next = newNode;
    newNode.next = null;
    newNode.prev = temp;
    tail = newNode;
    return head; 
  }

  static Node popFront(Node head) {
    if(head == null)
      System.out.println("The list is empty");
    Node temp = head.next;
    head = temp;
    head.prev = null;
    return head;
  }

  static void print(Node head) {
    System.out.println("\nThe doubly linked-list is :");
    while(head != null) {
      System.out.print(head.data);
      if(head.next != null) 
        System.out.print("<->");
     head = head.next;
    }
  }
}