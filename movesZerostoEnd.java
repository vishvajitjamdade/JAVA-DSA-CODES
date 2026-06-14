import java.util.Scanner;

public class movesZerostoEnd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Enter the number in array : ");
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int idx = 0;
        for(int num : arr){
            if(num != 0){
                arr[idx++] = num;
            }
        }

        while(idx<arr.length){
            arr[idx++] = 0;
        }

        System.out.println("After moving all zeros to end");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}