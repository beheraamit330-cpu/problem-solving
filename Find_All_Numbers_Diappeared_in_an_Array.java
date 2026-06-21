import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Diappeared_in_an_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            int ind = Math.abs(i)-1;
            if (nums[ind]>0) {
                nums[ind] = -nums[ind];
                
            } 
        }

        for(int i = 0;i<nums.length;i++){
            if (nums[i]>0) {
                list.add(i+1);
                
            }
        }
        return list;
    }
}