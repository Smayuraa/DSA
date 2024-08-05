package Sorting;

public class CountingSort {
    public static void Sorting(int arr[]) {
        if (arr.length == 0) return;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Find the maximum and minimum values
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        // Create count array with size based on the range of the input values
        int range = max - min + 1;
        int count[] = new int[range];

        // Store the count of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        // Reconstruct the sorted array
        int j = 0;
        for (int i = 0; i < range; i++) {
            while (count[i] > 0) {
                arr[j++] = i + min;
                count[i]--;
            }
        }
    }

    public static void PrintArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Add a newline after printing the array
    }

    public static void main(String[] args) {
        int arr[] = {8, 9, 5, 7, 3, 0, 2};
        Sorting(arr);
        PrintArr(arr);
    }
}
