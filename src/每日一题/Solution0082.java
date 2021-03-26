package 每日一题;

import java.util.List;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-25
 */
public class Solution0082 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode(0);
        ListNode save = res;
        ListNode dummy = new ListNode(0, head);
        while (dummy.next != null && dummy.next.next != null) {
            if (dummy.next.val != dummy.next.next.val) {
                dummy = dummy.next;
                res.next = dummy;
                res = res.next;
                continue;
            }
            while (dummy.next.next != null && dummy.next.next.val == dummy.next.val) {
                dummy.next.next = dummy.next.next.next;
            }
            dummy = dummy.next;
        }
        res.next = dummy.next;
        return save.next;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(2,new ListNode(3)))));
        ListNode listNode = new ListNode(0, node);
        new Solution0082().deleteDuplicates(listNode);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
