
public class LinkList {
  
  static Node head;
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

    //Attaching them together to form a linklist.
    head = first;
    first.next = second;
    second.next = third;
    third.next = forth;

    //To print linked list
    print(head);
  }
  static void print(Node head){
    Node temp = head;
    while(temp != null) {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
  
}