// QUESTION LINK

/*  https://leetcode.com/problems/reverse-linked-list/  */

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        
        ListNode prev = null ;
        ListNode temp = head;
        ListNode nex = temp.next;
        
        while(temp != null){
            temp.next = prev;
            prev = temp;
            temp = nex;
            if(nex != null)
                nex = temp.next;
        }
        head = prev;
        return head;
    }
}
