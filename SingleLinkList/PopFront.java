public class PopFront {
  
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

    //To insert node at first of the linked-list
    head=deleteItem(head);
    //To print linked-list
    print(head);
       
  } 
  static Node deleteItem(Node head) {
    if(head == null)
      return null;
    return head = head.next;
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