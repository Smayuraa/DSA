import java.util.ArrayList;

public class DeleteHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int currentIndex = arr.size() - 1;
            int parentIndex = (currentIndex - 1) / 2;

            while (currentIndex > 0 && arr.get(currentIndex) < arr.get(parentIndex)) {
                // Swap
                int temp = arr.get(currentIndex);
                arr.set(currentIndex, arr.get(parentIndex));
                arr.set(parentIndex, temp);

                currentIndex = parentIndex;
                parentIndex = (currentIndex - 1) / 2;
            }
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(left) < arr.get(minIdx)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(right) < arr.get(minIdx)) {
                minIdx = right;
            }
            if (minIdx != i) {
                // Swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }
        }

        public int remove() {
            if (arr.size() == 0) {
                return -1; 
            }
            int data = arr.get(0);

            int lastElement = arr.get(arr.size() - 1);
            arr.set(0, lastElement);
            arr.remove(arr.size() - 1);

            heapify(0);

            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

        public int peek() {
            if (isEmpty()) {
                return -1; 
            }
            return arr.get(0);
        }
    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}
