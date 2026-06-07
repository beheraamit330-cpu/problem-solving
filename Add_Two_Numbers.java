class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
public class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = null;
        ListNode current = null;
        int sum ;
        while (l1.next!=null||l2.next!=null||carry!=0) {
            sum = carry;
            if (l1!=null) {
                sum = sum+l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum = sum+l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;

            ListNode newnode = new ListNode(sum%10);
            if (head == null) {
                head = newnode;        // first Node
                current = head;
            } else {
                current.next = newnode; // link Node
                current = newnode;      // move pointer
            }
        }
        return head;
    }
}
