import java.util.Scanner;
public class MergeSort
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        divide(arr, 0, arr.length-1);

        
        for(int i = 0; i < n ; i++){
            System.out.println(arr[i]);
        }
    }

    static void divide(int arr[], int lb , int n){
        if(lb < n) {
            int m = (lb + n)/2;
            divide(arr, lb, m);
            divide(arr, m+1, n);

            merge(arr, lb, m, n);
        }
    }
    
    static void merge(int arr[], int lb, int m, int n){
        int n1 = m - lb + 1;
        int n2 = n - m;

        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        for(int i = 0; i < n1; i++){
            arr1[i] = arr[lb + i];
        }
        for(int i = 0; i < n2; i++){
            arr2[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0;
        int k = lb;
        while(i < n1 && j < n2) {
            if(arr1[i] < arr2[j]){
                arr[k] = arr1[i];
                i++;
            }
            else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
    
}
