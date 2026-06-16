import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of tha array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array : ");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num : arr){
            if(num > firstMax){
                secondMax = firstMax;
                firstMax = num;
            }
            else if(num != firstMax && num > secondMax){
                secondMax = num;
            }
        }

        System.out.println("FirstMax = " + firstMax);
        System.out.println("SecondMax = " + secondMax);

        sc.close();
    }
}
