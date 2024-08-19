public class SearchRotatedSortedArray {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int search(int arr[], int si, int ei, int target) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        // Case 1: Target found
        if (arr[mid] == target) {
            return mid;
        }

        // Case 2: Left part is sorted
        if (arr[si] <= arr[mid]) {
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, si, mid - 1, target); // Search in the left half
            } else {
                return search(arr, mid + 1, ei, target); // Search in the right half
            }
        }

        // Case 3: Right part is sorted
        if (arr[mid] <= target && target <= arr[ei]) {
            return search(arr, mid + 1, ei, target); // Search in the right half
        } else {
            return search(arr, si, mid - 1, target); // Search in the left half
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 9, 2, 8, 1, 2};
        int target = 9; // Change the target as needed

        // Perform the search
        int result = search(arr, 0, arr.length - 1, target);

        // Print the result
        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }
}
