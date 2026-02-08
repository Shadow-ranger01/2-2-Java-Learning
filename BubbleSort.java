public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Before sorting:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("\nAfter sorting:");
        printArray(numbers);
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop: goes through the whole array
        for (int i = 0; i < n - 1; i++) {
            swapped = false; // Reset for this pass

            // Inner loop: compare adjacent elements
            // The "- i" part is there because the last i elements are already sorted!
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    swapped = true;
                }
            }

            // Optimization: if no two elements were swapped in the inner loop, 
            // the array is already sorted, so we can break early.
            if (!swapped) break;
        }
    }

    // Helper method to make the output look nice
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
