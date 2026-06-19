public class Number_of_Steps_to_Redue_a_Number_to_Zero {
    public static int numberOfSteps(int num) {
        int count = 0;
        while (num>0) {
                count++;
            if (num%2==0) {
                num = num/2;

            }
            else{
                num-=1;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }
    
}