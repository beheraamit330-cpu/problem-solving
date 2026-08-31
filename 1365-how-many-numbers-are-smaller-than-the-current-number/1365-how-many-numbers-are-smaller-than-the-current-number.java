class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] count = Arrays.copyOf(nums, nums.length);

        Arrays.sort(count);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < count.length; i++) {
            if (!map.containsKey(count[i])) {
                map.put(count[i], i);

            }
        }

        for (int i = 0; i < nums.length; i++) {
            count[i] = map.get(nums[i]);
        }

        return count;
    }
}

// HASH_MAP + Array sort + loop