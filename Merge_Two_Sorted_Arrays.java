import java.util.Scanner;

public class Merge_Two_Sorted_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array : ");
        int len1 = sc.nextInt();
        int arr1[] = new int[len1];
        System.out.println("Enter the data in first array : ");
        for(int i = 0;i<len1;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second array : ");
        int len2 = sc.nextInt();
        int arr2[] = new int[len2];
        System.out.println("Enter the data in second array : ");
        for(int i = 0;i<len2;i++){
            arr2[i] = sc.nextInt();
        }

        int arr[] = new int[len1+len2];

        int i = 0,j = 0;
        int len = len1+len2;
        int idx = 0;
        while(i<len1 && j<len2 && idx<len){
            if(arr2[j]<=arr1[i]){
                arr[idx++] = arr2[j++];
            }
            else if(arr1[i]<=arr2[j]){
                arr[idx++] = arr1[i++];
            }
        }

        while(i<len1 && idx<len){
            arr[idx++] = arr1[i++];
        }

        while(j<len2 && idx<len){
            arr[idx++] = arr2[j++];
        }

        System.out.println("Merged two sorted array : ");
        for(int num : arr){
            System.out.println(num);
        }

        sc.close();
    }
}
