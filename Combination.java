import java.util.ArrayList;
import java.util.List;
public class Combination {

    static void fun(int st,int n,int k,List<Integer> list,List<List<Integer>> ans ){
        if (k==list.size()) {
            ans.add(new ArrayList<>(list));
            return;
        }
            if(st>n) return;
            list.add(st);
            fun(st+1, n, k, list, ans);
            list.remove(list.size()-1);
            fun(st+1, n, k, list, ans);

    }
    static List<List<Integer>> combine(int n, int k){
        List<List<Integer>> ans = new ArrayList<>();
        fun(1,n, k, new ArrayList<>(), ans);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(combine(4, 2));
    }

}
