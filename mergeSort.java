public class mergeSort {

    public static void mergesort(int si, int ei, int arr[]) {
        if (si >= ei) {
            return;
        }

        int mid = si+(ei-si)/2;

        mergesort(si, mid, arr);
        mergesort(mid+1, ei, arr);
        merge(si, ei, mid, arr);
    }

    public static void merge(int si, int ei, int mid,int arr[]){
        int temp[] = new int[ei-si+1];

        int i = si;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i++];
            }
            else{
                temp[k] = arr[j++];
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=ei){
            temp[k++] = arr[j++];
        }

        int m = si;
        for(int num : temp){
            arr[m++] = num;
        }
    }

    public static void print(int arr[]) {
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        int arr[] = { 1, 5, 1, 7, 3, 9, 2 };
        System.out.println("Before Sorting : ");
        print(arr);
        mergesort(0, arr.length-1, arr);
        System.out.println("After Sorting");
        print(arr);
    }
}