public class LinearSearch {
    public static int search(int[] arr, int target) {
        // Iterate through the entire array
        for (int i = 0; i < arr.size; i++) {
            // Check if the current element matches the target
            if (arr[i] == target) {
                return i; // Target found, return the index
            }
        }
        // Target not found after checking all elements
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 5, 8, 2, 7};
        int target = 8;
        
        int result = search(numbers, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
