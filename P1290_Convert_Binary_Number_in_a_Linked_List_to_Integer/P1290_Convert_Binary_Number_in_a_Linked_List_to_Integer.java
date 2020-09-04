class Solution {
    public int getDecimalValue(ListNode head) {
        int decimalValue =0;
        while(head!=null){
            // it is basically shifting left and adding MSB  and no use of reversing the LL
            //we can also use decimalValue = (decimalValue<<1) + head.val;
            decimalValue = decimalValue*2 + head.val;
            head = head.next;
        }
        return decimalValue;
        
    }
    public ListNode reverseLinkedList(ListNode head){
        ListNode prev=null, curr=head, next=null;
        
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head =  prev;   
        return head;
    }
    public int getDecimalValue1(ListNode head) {
        head = reverseLinkedList(head);
        int decimalValue =0;
        int twoPower = 1;
        while(head!=null){
            decimalValue = decimalValue + head.val* twoPower;
            twoPower *= 2;
            head = head.next;
        }
        return decimalValue;
        
    }
	public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.runningSum();
        System.out.println(result);
    }
}