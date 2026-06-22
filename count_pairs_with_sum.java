import java.util.HashSet;
import java.util.Scanner;

public class count_pairs_with_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the target : ");
        int target = sc.nextInt();
        int nums[] = new int[n];

        System.out.println("Enter the no in array : ");
        for(int i = 0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int num : nums){
            int diff = target - num;
            if(set.contains(diff)){
                count++;
            }

            set.add(num);
        }

        System.out.println("The no. of  pairs in array : " + count);
    }
}
