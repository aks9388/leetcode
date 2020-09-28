/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);
        ListNode head = result;
        int sum = 0;
        while(l1!=null && l2!=null){
            sum = l1.val + l2.val + carry;
            if(sum>9){
                sum = sum%10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            result.next = new ListNode(sum);
            result = result.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1==null && l2!=null){
            sum =l2.val + carry;
            if(sum>9){
                sum = sum%10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            result.next = new ListNode(sum);
            result = result.next;
            l2 = l2.next;
        }
        while(l2==null && l1!=null){
            sum =l1.val + carry;
            if(sum>9){
                sum = sum%10;
                carry = 1;
            }
            else{
                carry = 0;
            }
            result.next = new ListNode(sum);
            result = result.next;
            l1 = l1.next;
        }
        if(carry==1){
            result.next = new ListNode(1);
            result = result.next;
        }
        return head.next;
    }
}