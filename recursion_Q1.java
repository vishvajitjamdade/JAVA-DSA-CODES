import java.util.Scanner;

public class recursion_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the key to search in array : ");
        int key = sc.nextInt();
        printIndices(arr,key,0);
        sc.close();
    }

    public static void printIndices(int arr[], int key,int i) {
        if(arr.length == i){
            return;
        }

        if(arr[i] == key){
            System.out.println("Element " + key + " found at index " + i);
        }
        printIndices(arr,key,i+1);
    }
}
