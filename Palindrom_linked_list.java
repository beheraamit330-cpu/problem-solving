// USING STACK

/**
Algorithm
Create an empty stack.
Traverse the linked list:
Push every node value into the stack.
Traverse the linked list again:
Compare current node value with stack top.
If values are different → return false.
Otherwise pop stack and move forward.
If all values match → return true.
**/

import java.util.Stack;;
class ListNode {
    int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}

class Solution {
    public boolean isPalindrome(ListNode head) {

        Stack<Integer> stack = new Stack<>();

        ListNode current = head;

        // Store all linked list values
        while(current != null){
            stack.push(current.val);
            current = current.next;
        }

        current = head;

        // Compare with stack
        while(current != null){

            if(current.val != stack.pop()){
                return false;
            }

            current = current.next;
        }

        return true;
        
    }
}