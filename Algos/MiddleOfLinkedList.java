/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode one = head;
        ListNode two = head;
        while(two != null && two.next != null){
            one = one.next;
            two = two.next.next;
        }
        return one;
    }
}

        // Array output approach... TLE
        // ListNode[] A = new ListNode[100];
        // int i = 0;
        // while(head != null)
        //     // System.out.println(head);
        //     A[i] = head; 
        //     i++;
        //     head = head.next;
        // return A[i/2];
