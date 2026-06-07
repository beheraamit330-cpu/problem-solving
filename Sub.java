import java.lang.reflect.Array;
import java.util.*;

public class Sub {
    static void subset(int ind,int n,int[] nums,List<Integer> ds,List<List<Integer>> ans){
        if (ind==n) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[ind]);
        subset(ind+1, n, nums, ds, ans);
        ds.remove(ds.size()-1);
        subset(ind+1, n, nums, ds, ans);
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subset(0, nums.length, nums,new ArrayList<>(),ans);
        Set<List<Integer>> set = new HashSet<>(ans);
        ans = new ArrayList<>(set);
        
        return ans;
    }
    public static void main(String[] args) {
        int[]nums = {4,4,4,1,4};
        Arrays.sort(nums);
        System.out.println(subsets(nums));

    }
}