/** 
LeetCode 268: Missing Number
Problem:
Given an array containing n distinct numbers from range [0, n], find the missing number.
Example:
Input: nums = [3,0,1]
Numbers should be: 0 1 2 3
Missing number = 2
Approach 1: Sorting (Your first code)
Idea:
Sort the array.
Check each element with its expected index.
The first mismatch is the missing number.
**/

import java.util.Arrays;
public class Missing_Number {
    public int missingNum(int[] nums) {

        int j = 0;

        Arrays.sort(nums);  // sort array

        for(int i : nums){

            if(i != j){
                return j;   // missing number found
            }

            j++;
        }

        return j;  // if missing number is n
    }
}

/** 
Dry Run:
nums = [3,0,1]

After sorting: [0,1,3]
j = 0
i=0: 0 == 0
j=1
i=1: 1 == 1
j=2
i=3: 3 != 2

return 2

Complexity:
Sorting: O(n log n)
Loop: O(n)

Total:
Time:  O(n log n)
Space: O(1)




Approach 2: Sum Formula

The numbers are from: 0 + 1 + 2 + ... + n

The sum of numbers from 0 to n:

S=2
n(n+1)
Then: Missing number = Expected sum - Actual sum
Code:
**/

class Solution {

    public int missingNumber(int[] nums){

        // total numbers should be 0 to n
        int n = nums.length;

        // expected sum
        int sumofno = n * (n + 1) / 2;

        // calculate array sum
        int finalsum = 0;

        for(int num : nums){
            finalsum = finalsum + num;
        }


        // difference gives missing number
        return sumofno - finalsum;
    }
}
/**
Dry Run:

Input: nums = [3,0,1]

Length: n = 3

Expected sum: 0+1+2+3 = 6

sumofno = 3*(3+1)/2 = 6

Actual sum: 3+0+1 = 4

Difference: 6 - 4 = 2

Answer: 2

Complexity:

Loop only runs once: for(int num:nums)

Time: O(n)

Extra variables: sumofno , finalsum

Space: O(1)
**/