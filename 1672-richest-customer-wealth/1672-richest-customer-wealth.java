class Solution {
    public int maximumWealth(int[][] accounts) {

        int sum2 = 0;

        for (int i = 0; i < accounts.length; i++) {

            int sum = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }

            if (sum2 < sum) {
                sum2 = sum;
            }
        }

        return sum2;
    }
}