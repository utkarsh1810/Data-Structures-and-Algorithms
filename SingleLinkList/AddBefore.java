import java.util.Scanner;

public class AddBefore {
  
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
    Node first = new Node(10);  //head of the linklist.
    Node second = new Node(15);
    Node third = new Node(20);
    Node forth = new Node(25);

    //Attaching them together to form a linklist.
    head = first;
    first.next = second;
    second.next = third;
    third.next = forth;

    Scanner sc = new Scanner(System.in);
    int toAdd = sc.nextInt();
    int addBeforeThis = sc.nextInt();
    sc.close();
    
    //Function to add node 
    addBefore(head , toAdd, addBeforeThis);
    //To print the linked-list
    print(head);
  }

  static void addBefore(Node head , int toAdd , int addBeforeThis) {
    if(head == null) {
       System.out.println("List is empty");
    }
    Node temp = head;
    Node forward = head.next;
    while(true) {
      if(temp.next.data == addBeforeThis) {
        Node toappend = new Node(toAdd); 
        temp.next = toappend;
        toappend.next = forward;
        break;
       }
      temp = temp.next;
      forward = forward.next;
      if(temp.next == null){
        System.out.println("Please enter node from the linked-list.");
        break;
      }
    }
  }
  static void print(Node head) {
    System.out.println("the linked list is :");
    while(head != null) {
      System.out.print(head.data);
      if(head.next != null)
        System.out.print("->");
      head = head.next;
    }
  }
}
