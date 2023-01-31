package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class problem_21_merge_two_sorted_lists {
    public void main(String[] args) {

    }
    public class ListNode {
    int val;
    ListNode next;
      ListNode() {}
    ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    class Solution {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(-1);
            ListNode cur = head;

            while(l1 != null && l2 != null) {
                if (l1.val < l2.val){
                    //l1 is smaller
                    cur.next = l1;
                    l1 = l1.next;

                }else {
                    //l2 is smaller
                    cur.next = l2;
                    l2 = l2.next;
                }

            }
            cur.next = l1 == null ? l2 :l1;
            return head;
        }
    }
}
