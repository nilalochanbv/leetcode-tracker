// Last updated: 7/9/2026, 9:47:12 AM
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
    public int getDecimalValue(ListNode head) {
        int n =0;
        int val;
        while(head!=null){
            n =(n<<1) | head.val;
            head = head.next;
        }
        return n;
        
    }
}