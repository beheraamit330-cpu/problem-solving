// 2-Pointer Solution

public class Container_With_Most_Water {
    public static int maxArea(int[] height) {
        int left =0;
        int right = height.length-1;
        int maxwater = 0;  
        while (left<right) {
            int curentwater = Math.min(height[left], height[right])*(right-left);
            maxwater = Math.max(maxwater, curentwater);
            if (height[left]<height[right]) {
                left++;
            }else{
                right--;
            }
            
        }
        return maxwater;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
    
}

// Two Pointer problems:
// Start from both ends
// Calculate answer
// Move the pointer with the smaller value
// Repeat until pointers meet

// Time: O(n)
// Because every element is visited at most once.

// Space: O(1)
// Only variables are used.
