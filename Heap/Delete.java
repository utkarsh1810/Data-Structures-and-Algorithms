// Here we are deleting the root of the tree
//     but you can delete any node with same implementation
public class Delete {
  static void ShiftDown(int arr[], int n, int i) {
    int largest = i;
    int lfChild = 2*i + 1;
    int rtChild = 2*i + 2;
    if(lfChild < n && arr[lfChild] > arr[largest]) {  // Check if leftChild is greater than present 
      largest = lfChild;
    }
    if(rtChild < n && arr[rtChild] > arr[largest]) {  // Check if rightChild is greater than present
      largest = rtChild;
    }
    if(largest != i) {          // If value of is changed with any of its child
      int temp = arr[i];
      arr[i] = arr[largest];
      arr[largest] = temp;
      ShiftDown(arr, n, largest);  // For remaining child nodes
    }
  }

  static int delete(int arr[], int n) {
    int last = arr[n-1];  
    arr[0] = last;           // Swap last element with the root
    n = n-1;                 // disconnect the last one
    ShiftDown(arr,n,0);      // Now just heapify the compelete heap , but downwards
    return n;
  }
  public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 2, 4 }; 
        // Array representation of Max-Heap 
        //     10 
        //    /  \ 
        //   5    3 
        //  / \ 
        // 2   4
        int n = arr.length;
        n = delete(arr, n);

        // To print
        for (int i = 0; i < n; ++i) 
        System.out.print(arr[i] + " "); 
  }
}