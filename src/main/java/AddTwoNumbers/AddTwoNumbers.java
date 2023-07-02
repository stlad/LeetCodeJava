package AddTwoNumbers;

// https://leetcode.com/problems/add-two-numbers/

public class AddTwoNumbers {
    public static void main(String[] args){

    }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode next1 = l1;
        ListNode next2 = l2;
        ListNode resultHead = new ListNode( (next1.val + next2.val ) % 10);
        ListNode currentResult = resultHead;
        int div = (next1.val + next2.val ) / 10;
        while(next1.next != null || next2.next != null){
            next2 = next2.next==null ? new ListNode(0) : next2.next;
            next1 = next1.next==null ? new ListNode(0) : next1.next;

            currentResult.next = new ListNode((next1.val + next2.val +div) % 10);
            currentResult = currentResult.next;
            div = (next1.val + next2.val +div) / 10;

        }
        if(div>0) currentResult.next = new ListNode(div);
        return resultHead;
    }
}


/**
Definition for singly-linked list.
*/
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
