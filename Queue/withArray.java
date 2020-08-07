import java.util.Scanner;
class Queue {
  int size;
  int front;
  int rear;
  int[] QueueArray;
  Queue(int size) {
    this.size = size;
    QueueArray = new int[size];
    front = rear = -1;
  }

  void Enqueue(int data) {
    if(size == rear) {
      System.out.println("Queue is full");
      return;
    } 
    else if(front == -1 && rear == -1) {
      front++;
      rear++;
    }
    else
      rear++;
    QueueArray[rear] = data;
  }

  int Dequeue() {
    if(front == -1) {
      System.out.println("Queue is empty:");
      return -1;
    }
    int data = QueueArray[front];
    front++;
    return data;
  }

  void print() {
    if(front == rear) {
      System.out.println("Queue is empty");
    }
    System.out.println("Queue is :");
    for(int i = front; i <= rear; i++) {
      System.out.print(QueueArray[i]+" ");
    }
    System.out.println("\n");
  }

}

class withArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int size = sc.nextInt();
    Queue q = new Queue(size);
    System.out.println("Please enter no of operations you want to perform :");
    int n = sc.nextInt();
    while(n > 0) {
      System.out.println("Please enter 1 for Enqueue(), 2 for Dequeue(), 3 for print(), 4 for front()");
      int entry = sc.nextInt();
      if(entry == 1) {
        int data = sc.nextInt();
        q.Enqueue(data);
      }
      else if(entry == 2)
        q.Dequeue();
      else if(entry == 3)
        q.print();
      else if(entry == 4) {
        // int latestEntry = q.front();
        // System.out.println(latestEntry);
      }
      else 
        System.out.println("Please enter valid entry :");
      n--;
      System.out.println(size+" operations left");
    }
    sc.close();
  }
}
