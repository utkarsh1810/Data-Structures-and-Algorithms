import java.util.Scanner;

public class PushBack {
  
  static Node head; //head pointer
  static Node tail; //tail pointer
  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static void main(String[] args) {
    Node first = new Node(10);  //head of the linklist.
    Node second = new Node(15);
    Node third = new Node(20);
    Node forth = new Node(25);

    //Attaching them together to form a linklist.
    head = first;
    first.next = second;
    second.next = third;
    third.next = forth;
    tail = forth;

    //To add node at last of the linked-list
    pushBack(head);

    //To print linked list
    print(head);
  }

  static void pushBack(Node head) {
    Scanner sc = new Scanner(System.in);  
    int toInsert = sc.nextInt();
    Node nowAtLast = new Node(toInsert);
    Node temp = head;
    while(temp.next != null) {
      temp = temp.next;
    }
    temp.next = nowAtLast;
    sc.close();
  }
 

  static void print(Node head) {
    Node temp = head;
    System.out.println("The linked-list is :");
    while(temp != null) {

      System.out.print(temp.data+"->");
      temp = temp.next;
    }
  }
}