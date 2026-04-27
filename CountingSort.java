public class CountingSort {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 1, 0, 2, 5, 4, 0, 2, 8, 7, 7, 9, 2, 0, 1, 9 };

        System.out.println("Elements in Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Finding maximum number
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        // Creating count array and storing occurrences
        int count[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Convert count into cumulative count
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];  // ✅ fix here
        }

        // Building sorted array
        int output[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            count[num]--;
            output[count[num]] = num;
        }

        // Copying back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }

        System.out.println("\nSorted Array : ");
        for (int i = 0; i < arr.length; i++) {  // ✅ fix here
            System.out.print(arr[i] + " ");
        }
    }
}
