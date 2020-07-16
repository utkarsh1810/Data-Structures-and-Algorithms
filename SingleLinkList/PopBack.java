public class PopBack {

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

    head = removeLastNode(head);

    //To print linked list
    print(head);
  }
  static Node removeLastNode(Node head) {
    if(head == null) {
      return null;
    }
    if(head.next == null) {
      return null;
    }

    Node secondLast = head;
    while(secondLast.next.next != null){
      secondLast = secondLast.next;
    }  
    secondLast.next = null; //removing last element of the linked list.
    return head;
  }

  static void print(Node head) {
    Node temp = head;
    while(temp != null) {
      System.out.println(temp.data);
      if(temp.next != null)
        System.out.print("->");
      temp = temp.next;
    }
  }
}