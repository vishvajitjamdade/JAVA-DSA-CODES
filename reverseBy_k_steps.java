public class reverseBy_k_steps {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;
        reverse(arr, 0, k);
        reverse(arr, k+1, n-1);
        reverse(arr, 0, n-1);
        System.out.println("Array after reversing by " + k + " steps");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void reverse(int arr[],int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
