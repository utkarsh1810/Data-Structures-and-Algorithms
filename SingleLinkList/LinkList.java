
public class LinkList {
  
  // Node head;
  static class Node {
    int data;
    Node next;
  
    Node(int data) {
      this.data =data;
      this.next = null;
    }
  }
  public static void main(String[] args) {

    Node first = new Node(10);  //head of the linklist.
    Node second = new Node(15);
    Node third = new Node(20);
    Node forth = new Node(25);

    // head = first;

    //Attaching them together to form a linklist.
    first.next = second;
    second.next = third;
    third.next = forth;

  }
}