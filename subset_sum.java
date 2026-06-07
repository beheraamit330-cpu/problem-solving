import java.util.ArrayList;
import java.util.Collections;

public class subset_sum {

    public static void fun(int ind, int n, ArrayList<Integer> sumsubset, ArrayList<Integer> arr, int sum) {
        if (ind == n) {
            sumsubset.add(sum);
            return;
        }

        // include element
        fun(ind + 1, n, sumsubset, arr, sum + arr.get(ind));

        // exclude element
        fun(ind + 1, n, sumsubset, arr, sum);
    }

    ArrayList<Integer> subsetsum(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> sumsubset = new ArrayList<>();
        fun(0, n, sumsubset, arr, 0);

        Collections.sort(sumsubset);
        return sumsubset;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1);

        subset_sum obj = new subset_sum();
        ArrayList<Integer> result = obj.subsetsum(arr, arr.size());

        System.out.println(result);
    }
}