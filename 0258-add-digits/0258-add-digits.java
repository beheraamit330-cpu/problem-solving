class Solution {

    public int addDigits(int num) {
        int sum = 0;

        if (num<10)return num ;

        while(0<num){
            sum = sum + (num/10);
            num = (num%10)*10;
        }
        
        return addDigits(sum);

    }
}