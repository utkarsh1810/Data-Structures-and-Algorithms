import java.util.ArrayList;
import java.util.*;
class Insert {
  static void insert(int arr[], int n, int key) {
    arr.add(key);
    n = n + 1;
    ShiftUp(arr, n, n-1);
  }
  static void ShiftUp(int arr[], int n, int i) {
    int parent = (i-1)/2;
    if(arr[i] > arr[parent]) {
      int temp = arr[i];
      arr[i] = arr[parent];
      arr[parent] = temp;

      ShiftUp(arr, n, parent);
    }
  }

  public static void main(String[] args) {
    List<Integer> arr = new ArrayList<Integer>(); 

    arr.add(10);
    arr.add(5);
    arr.add(3);
    arr.add(2);
    arr.add(4);

    // Representation as a Max Heap
              //       10
              //     /    \
              //    5      3
              //  /  \
              // 2    1
    int n = arr.length;
    Scanner sc = new Scanner(System.in);
    int key =  sc.nextInt();
    sc.close();
    insert(arr, n, key);

    for(int i = 0; i < arr.length; i++)   
      System.out.print(arr[i] + " ");
  }
}