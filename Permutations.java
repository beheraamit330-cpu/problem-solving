import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {
    private static void fun(boolean[] frq, List<Integer> ds, int [] nums,List<List<Integer>> ans ){
        if(ds.size()== nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0; i<=nums.length-1; i++){
            if (frq[i]) 
                continue;
                frq[i] = true;
                ds.add(nums[i]);
                fun(frq, ds, nums, ans);
                ds.remove(ds.size()-1);
                frq[i] = false;
        }

    }
     public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean frq[] = new boolean[nums.length];
        List<Integer> ds  = new ArrayList<>();
        fun(frq, ds, nums, ans);
        return ans;
        
    }
    public static void main(String[] args) {
        int []nums = {3,2,1};
        System.out.println(permute(nums));
    }
}
