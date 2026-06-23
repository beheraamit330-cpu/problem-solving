// 1. Sort prices
// 2. Start from largest price
// 3. Take two expensive candies
// 4. Skip the third (free)
// 5. Repeat until all candies processed
// 6. Return sum

class Solution {
   public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int count = 0;
        int sum = 0;
        int i = cost.length-1;
        while (0<=i) {
            if (count==2) {
                count = 0;
                i--;
            }else{
                sum += cost[i];
                count++;
                i--;
            }
            
        }
        return sum;
    }    
}