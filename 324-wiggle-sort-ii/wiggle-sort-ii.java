import java.util.Arrays;

class Solution {

    public void wiggleSort(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;
        int[] arr = new int[n];

        int low = (n - 1) / 2;  // end of first half
        int high = n - 1;       // end of second half

        int i = 0;

        while (i < n) {

            arr[i] = nums[low];
            low--;
            i++;

            if (i < n) {
                arr[i] = nums[high];
                high--;
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            nums[j] = arr[j];
        }
    }
}