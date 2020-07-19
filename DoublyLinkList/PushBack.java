import java.util.Scanner;
public class PushBack {
  static Node head;
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
    System.out.println("Enter the length of the linked-list:");
    int n = sc.nextInt();
    for(int i = 0; i < n; i++) {
      int entry = sc.nextInt();
      head = insertAtEnd(head, entry);
    }
    sc.close();
    print(head);
    toprint(head);
  }
  static Node insertAtEnd(Node head, int entry) {
    Node newNode = new Node(entry);
    if(head == null) {
      head = newNode;
      newNode.next = null;
      newNode.prev = null;
    }
    Node temp = head;
    while(temp.next != null) 
      temp = temp.next;
    temp.next = newNode;
    newNode.next = null;  //Assigning next pointer of the node to null as it's the last node of list
    newNode.prev = temp;  //Getting add. of second last Node to the prev pointer 
    return head;
  }
  static void print(Node head) {
    System.out.println("The doubly linked-list is :");
    while(head != null) {
      System.out.print(head.data);
      if(head.next != null) 
        System.out.print("->");
     head = head.next;
    }
  }
  static void toprint(Node head) {
    Node tail = head;
    while(tail.next != null)
      tail = tail.next;
      System.out.println("\nThe reverse of the linked-list is :");
    while(tail != head){
      System.out.print(tail.data+"->");
      tail = tail.prev;
    }
    System.out.println(tail.data);

     
  }
}