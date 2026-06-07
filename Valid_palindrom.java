public class Valid_palindrom {
    public static  boolean isPalindrome(String s) {
        String a = "";
        s = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        for(int i =s.length()-1 ; i>=0; i--){
            a = a+s.charAt(i);
        }
        // System.out.println(a);
        // System.out.println(s);

        if (!s.equals(a)) return false;

        return true;

    }
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
}
