import java.util.*;
public class QuickSort {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    quicksort(arr,0,n-1);

    for(int i = 0; i < n ; i++) {
      System.out.println(arr[i]);
    }
  }

  static void quicksort(int arr[], int lb, int n){
    if(lb < n){

      int pt = partition(arr, lb ,n);

      quicksort(arr, lb, pt-1);
      quicksort(arr, pt+1, n);
    }
  }
  

  static int partition(int arr[], int lb , int n) {
    int pivot = arr[n];
    int i = lb-1;
    for(int j = lb; j<n; j++){

      if(arr[j] < pivot) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
      }
    } 
    int temp = arr[i+1];
    arr[i+1] = arr[n];
    arr[n] = temp;

    return i+1;
  }
}