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

// MERGE SORT ON A LINKED-LIST
class Solution {
    public ListNode merger(ListNode node1, ListNode node2){
        ListNode ans = new ListNode();
        ListNode temp = ans;
        while(node1 != null && node2 != null){
            if(node1.val<node2.val) {
                temp.next = node1;
                temp = temp.next;
                node1 = node1.next;
            } else {
                temp.next = node2;
                temp = temp.next;
                node2 = node2.next;
            }
        }
        while(node1!=null){
            temp.next = node1;
            temp = temp.next;
            node1 = node1.next;
        }

        while(node2!=null){
            temp.next = node2;
            temp = temp.next;
            node2 = node2.next;
        }

        return ans.next;
    }
    public ListNode mergeSort(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow = head, fast=head;
        while(fast.next != null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode list2 = slow.next;
        slow.next = null;
        ListNode part1 = mergeSort(head);
        ListNode part2 = mergeSort(list2);
        ListNode ans = merger(part1,part2);
        return ans;
    }
    public ListNode sortList(ListNode head) {
        ListNode ans =  mergeSort(head);
        return ans;
    }
}