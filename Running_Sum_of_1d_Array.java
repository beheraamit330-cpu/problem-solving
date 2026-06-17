// Using for loop
// runningSum[i] = nums[0] + nums[1] + ... + nums[i]

/** 
                                          Logic / Approach
Start from the second element (i = 1), because the first element already contains its own sum.
Add the previous running sum (nums[i-1]) to the current element (nums[i]).
Store the updated value back into the same array.
After completing the loop, the array itself becomes the running sum array
 **/

public class Running_Sum_of_1d_Array {
    public int[] runningSum(int[] nums) {
        
        for(int i = 1; i<nums.length; i++){
            nums[i] +=nums[i-1];
        }
        return nums;
    }
}

/**

Input: nums = [1, 2, 3, 4]

Initial:
            index:  0  1  2  3
            nums:   1  2  3  4

Iteration 1:
i = 1
nums[1] = nums[1] + nums[0]
nums[1] = 2 + 1 = 3
Array: [1, 3, 3, 4]

Iteration 2:
i = 2
nums[2] = nums[2] + nums[1]
nums[2] = 3 + 3 = 6
Array: [1, 3, 6, 4]

Iteration 3:
i = 3
nums[3] = nums[3] + nums[2]
nums[3] = 4 + 6 = 10

Final: [1, 3, 6, 10]

// Time Complexity: O(n)
// Because we traverse the array once.

// Space Complexity: O(1)
**/