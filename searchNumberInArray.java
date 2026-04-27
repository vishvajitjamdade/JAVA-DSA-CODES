import java.util.Scanner;

public class searchNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter element in array");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key to find occurrence : ");
        int k = sc.nextInt();
        int result = isPresent(arr,k,0);
        System.out.println("Index of first occured : "+result);
        sc.close();
    }

    public static int isPresent(int arr[],int key,int i){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }
        return isPresent(arr, key, i+1);
    }
}
