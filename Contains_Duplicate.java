import java.util.Arrays;
import java.util.HashSet;

// using sorting
public class Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        int chak = 0;
        Arrays.sort(nums);
        for(int i :nums){
            if (i==chak) {
                return true;
            }
            chak = i;
        }
        return false;
        
    }
}

// using hashset
class Solution {
    public boolean containsDuplicate(int[] nums) {
      HashSet<Integer> set = new HashSet<>();
      for(int num : nums){
        
        if(set.contains(num)){
            return true;
        }
        set.add(num);
      }
      return false;
    }
}  