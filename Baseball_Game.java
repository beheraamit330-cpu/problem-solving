import java.util.Stack;

public class Baseball_Game {
    public int calPoints(String[] operations) {
        int element;
        Stack<Integer>stack = new Stack<>();

        for(String ch:operations) {
            if(ch.equals("C")){
                stack.pop();
            }
            else if (ch.equals("+")) {
                element = stack.pop();
                int sum = element+stack.peek();
                stack.push(element);
                stack.push(sum);
                
            }
            else if (ch.equals("D")) {
                stack.push(stack.peek()*2);
                
            }
            else  {
                stack.push(Integer.valueOf(ch));
                
            }
            
        }
        element = 0;
        while (!(stack.isEmpty())) {
            element += stack.pop();
            
        }
        return element;
    }
}
