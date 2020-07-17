import java.util.Scanner;

public class PushFront {
  
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
    int toInsert = sc.nextInt();
    sc.close(); 

    //To insert node at first of the linked-list
    head=addItem(head, toInsert);
    //To print linked-list
    print(head);
       
  } 
  static Node addItem(Node head, int toInsert) {
    Node nowAtFirst = new Node(toInsert); // Data to append in front of the list
    nowAtFirst.next = head;   // Point new node to first node of the linklist
      // point head of linklist to the newly added element
    return nowAtFirst;
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
}