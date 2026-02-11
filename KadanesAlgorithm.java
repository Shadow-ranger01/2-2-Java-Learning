public class KadanesAlgorithm {
    public static int maxSubArraySum(int[] nums) {
        // Initialize with the first element
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Decision: Do I start a new subarray here, 
            // or extend the existing one?
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the global maximum if the current one is better
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        // The max subarray here is [4, -1, 2, 1], sum = 6
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(arr));
    }
}
