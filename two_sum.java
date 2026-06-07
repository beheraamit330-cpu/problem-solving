// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         for (int i = 0; i<nums.length; i++){
//                 if(nums[i]+nums[i+1] == target){
//                     return new int[]{i, i+1};
//                 }
//         } 
        
//         return new int[]{-1, -1};
        
//     }
// }

import java.lang.reflect.Array;
import java.util.Arrays;

class Solution {
    public static  int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        while (i<j) {
            int sum = nums[i]+nums[j];

            if (sum==target){
                return new int[]{i,j};
            }else if (sum<target) {
                i++;  
            }else{
                j--;
            } 
        }

        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [] nums  = {1,5,6,7,2,4};
        int []arr  = twoSum(nums, 5);
        System.out.println(Arrays.toString(arr));
    }
}
// import java.util.*;
// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n1 = nums1.length;
//         int n2 = nums2.length;
//         int [] result = new int[n1+n2] ;

//         for (int i = 0; i<n1;i++){
//             result[i] = nums1[i];
//         }

//         for (int j = 0; j<n2;j++){
//             result[n1+j] = nums1[j];
//         }

//         Arrays.sort(result);

//         if(result.length%2==1){
//             return result[result.length/2];
            
//         }
//         else{
//             return result[result.length/2-1] + result[result.length/2];
//         }


//     }
// }

// class Solution {
//     public static void main(String[]arg) {
//         int [] nums = {1,5,1,4,6,4};
//         int len = nums.length;

//         for (int i = 0; i<len; i++){
//             for(int j = i+1; j<len; j++){
//                 if(nums[i] ==nums[j]){
//                        for (int r = j; r < len - 1; r++) {
//                         nums[r] = nums[r + 1];
//                     }

//                     len--;  // reduce size
//                     j--;    // recheck same position
//                 }
//             }
//         }

//         System.out.println("After removing duplicates:");
//         for (int i = 0; i < len; i++) {
//             System.out.print(nums[i] + " ");
//         }
        
//     }
// }

// class Solution {
//     public int removeDuplicates(int[] nums) {
//         if (nums.length==0) return 0;
//         int k = 1;

//         for (int i=1; i<nums.length;i++){
//             if (nums[i]!=nums[i-1]){
//                 nums[k] = nums[i];
//                 k++;

//             }
                
            
//         }
//         return k;

        
        
//     }
// }

// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int len = nums.length;
//         if (len==0) return 0;

//         int k = 1;
//         for (int i = 0; i<len; i++){
//             if(nums[i]!= val){
//                 k++;
//             }else{
//                 for (int j = i ; j<len; j++){
//                     nums[i] = nums[i+1];
                    
                     
//                 }
//                 len--;
            
//             }
//         }

//         return k;
//     }
// }

