// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int l = nums.length;
//         int k = 0;
//         if (l==0) return 0;
//         for (int i = 0; i<l; i++){

//             if (nums[i]==val) {
//                 for(int j = i; j<l-1; j++ ){
//                     nums[j] =nums[j+1];
//                 }
//                 l--;
//                 k++;
                
//             }

//         }
        
//     }
// }

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        if (nums.length==0) return 0;
        for (int i = 0; i<nums.length; i++){
            if (nums[i]!=val) {
                nums[k]=nums[i];
                k++;
                 }
        }

        return k;
    }     


}