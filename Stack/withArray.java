import java.util.Scanner;
class Stack {
  int size;
  int top;
  int[] StackArray;
  Stack(int size) {
    this.size = size;
    top = -1;
    StackArray = new int[size];
  }
  public void push(int data) // put item on top of stack
  {
    if(!isFull()) {
      StackArray[++top] = data;
    }
  }
  
  public int pop() // take item from top of stack
  {
    if(isEmpty()) {
      System.out.println("Stack is empty !");
    }
    int temp = StackArray[top];
    StackArray[top] = StackArray[top--];
    return temp;
  }

  public boolean isEmpty() // true if stack is empty
  {
    return top == -1;
  }
  public boolean isFull() // true if stack is full
  {
    return top == size;
  }
  public void print() {
    int temp = size-1;
    System.out.println("The stack is :");
    while(temp >= 0) {
      // if(StackArray[temp] != 0)
      System.out.println(StackArray[temp--]);
    }
  }
}
class ithArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter operations you want to enter :");
    int size = sc.nextInt();
    Stack stk = new Stack(size);
    while(size > 0) {
      System.out.println("Please enter 1 for Push(), 2 for Pop(), 3 to print the Stack");
      int entry = sc.nextInt();
      if(entry == 1) {
        int data = sc.nextInt();
        stk.push(data);
      }
      else if(entry == 2)
        stk.pop();
      else if(entry == 3)
        stk.print();
      else 
        System.out.println("Please enter valid entry :");
      size--;
    }
    sc.close();
    
  }
}