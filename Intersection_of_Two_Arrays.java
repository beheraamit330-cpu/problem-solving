import java.util.HashSet;

public class Intersection_of_Two_Arrays {
    
    private void fun(int[] nums1, int[] nums2,HashSet<Integer> set,HashSet<Integer> set2){
        for(int i:nums1){  //convert array to Hashset
            set.add(i);
        }

        for(int i:nums2){
            if (set.contains(i)) {
                set2.add(i);
            }
        }
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        fun(nums1, nums2, set,set2);
        int[] result = new int[set2.size()];

        int index = 0;

        for(int i : set2){
            result[index++] = i;
        }

        return result;
    }
}
