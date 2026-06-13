public class missing_number {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5};
        int n = arr.length+1;
        int sum = 0;
        for(int i = 0;i<n-1;i++){
            sum += arr[i];
        }

        int total_sum = n*(n+1)/2;

        System.out.println("Missing Number in array is : " + (total_sum-sum));
    }
}
