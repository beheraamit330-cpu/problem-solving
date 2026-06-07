import java.util.Arrays;

public class move_all_zero {
    public static void moveZeroes(int[] nums) {
        int j = 0;
        int i = 0;
        int temp;
        Arrays.sort(nums);
        while(i<nums.length){
            if (nums[i]!=0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(nums));
        
    }
    public static void main(String[] args) {
        int []nums = {0,1,0,3,12};
        moveZeroes(nums);
        }
}
