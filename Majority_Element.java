// Approach 1: Sorting

// import java.util.Arrays;
// public class Majority_element {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         return nums[(nums.length)/2];
//     }
// }

/** Approach 2: HashMap (Counting)

nums = [2,2,1,1,1,2,2]
2 -> 4 times
1 -> 3 times
majority = 2 **/

import java.util.HashMap;

class Solution {
    public int Majority_Element(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n,0)+1);

            if(map.get(n) > nums.length/2){
                return n;
            }
        }

        return -1;
    }
}

/**Approach 3 (Best): Boyer-Moore Voting Algorithm 
Idea:

Maintain:

candidate → possible majority element
count → votes

Rules:

If count becomes 0 → choose new candidate
Same number → increase count
Different number → decrease count

nums = [2,2,1,1,1,2,2]


candidate=2 count=1

2 same
count=2

1 different
count=1

1 different
count=0

choose 1

2 different
count=0

choose 2

2 same
count=1

answer = 2 **/

class Solutio {
    public int majorityElement(int[] nums) {

        int candidate = 0;
        int count = 0;

        for(int num : nums){

            if(count == 0){
                candidate = num;
            }

            if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }

        return candidate;
    }
}