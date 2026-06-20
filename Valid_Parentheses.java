/** 
Algorithm: Valid Parentheses (Using Stack)

Input: String s containing brackets
Output: true if brackets are valid, otherwise false

Steps:
Create an empty stack to store opening brackets.
Traverse each character of the string one by one.
For every character:

If the character is an opening bracket:
( or { or [
Push it into the stack.

Otherwise, it is a closing bracket:
Check if the stack is empty.
If empty, return false because no matching opening bracket exists.
Remove the top element from the stack.

Compare it with the current closing bracket:
If current is ) and top is not ( → return false
If current is ] and top is not [ → return false
If current is } and top is not { → return false

After processing all characters:
If stack is empty → return true
Otherwise → return false
**/

import java.util.Stack;

public class Valid_Parentheses {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'|| c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                int top=stack.pop();
                if(c==')' && top!='(') return false;
                if(c==']' && top!='[') return false;
                if(c=='}' && top!='{') return false;

            }

        }
        return stack.isEmpty();

    }
}

