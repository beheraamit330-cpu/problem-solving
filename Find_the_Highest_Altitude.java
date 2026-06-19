public class Find_the_Highest_Altitude {
    public int largestAltitude(int[] gain) {
        int current_gain = 0;
        int high = 0;
        for(int i:gain){
            current_gain = current_gain+(i);
            if (current_gain>high) {
                high =current_gain;
            }
        }
        return high;
    }
}
