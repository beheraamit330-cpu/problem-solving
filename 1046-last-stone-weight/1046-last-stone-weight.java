class Solution {
    public int lastStoneWeight(int[] stones) {

        ArrayList<Integer> list = new ArrayList<>();
        int x, y;

        for (int i = 0; i < stones.length; i++) {
            list.add(stones[i]);
        }

        Collections.sort(list);

        while (list.size() > 1) {

            y = list.remove(list.size() - 1);
            x = list.remove(list.size() - 1);

            if (x < y) {
                list.add(y - x);
                Collections.sort(list);
            }
        }

        return list.isEmpty() ? 0 : list.get(0);
    }
}