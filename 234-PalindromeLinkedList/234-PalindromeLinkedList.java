// Last updated: 7/9/2026, 9:48:57 AM
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
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        int st =0;
        int end =list.size() -1;
        while(end>st){
            if(!list.get(st).equals(list.get(end))){
                return false;
            }
            st++;
            end--; 
        }
    return true;
    }
}