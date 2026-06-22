class Solution {
    public String removeStars(String s) {
        StringBuilder str = new StringBuilder();
        int l=0;
        for(char c : s.toCharArray()){
            l=str.length();
            if(c=='*'){
                str.deleteCharAt(l-1);
                continue; }
             str.append(c);
        }
        return str.toString();
    }
}