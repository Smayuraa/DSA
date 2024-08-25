import java.util.*;

public class Histogram {

    public static int HistogramFun(int arr[], int nextLeft[], int nextRight[]) {
        int MaxArea = 0;
        Stack<Integer> s = new Stack<>();

        // Calculate nextLeft
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextLeft[i] = -1;
            } else {
                nextLeft[i] = s.peek();
            }
            s.push(i);
        }

        // Clear the stack to reuse it
        s.clear();

        // Calculate nextRight
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextRight[i] = arr.length;
            } else {
                nextRight[i] = s.peek();
            }
            s.push(i);
        }

        // Find the maximum area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nextRight[i] - nextLeft[i] - 1;
            int area = height * width;
            MaxArea = Math.max(MaxArea, area);
        }
        return MaxArea;
    }

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3};
        int nextLeft[] = new int[arr.length];
        int nextRight[] = new int[arr.length];
        System.out.println(HistogramFun(arr, nextLeft, nextRight));
    }

}
