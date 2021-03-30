package 每日一题;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-30
 */
public class Solution0042 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((x, y) -> x.val - y.val);
        for (ListNode node : lists) {
            if (node != null) pq.add(node);
        }
        ListNode head = new ListNode(0);
        ListNode tail = head;
        while (!pq.isEmpty()) {
            tail.next = pq.poll();
            tail = tail.next;
            if (tail.next != null) {
                pq.add(tail.next);
            }
        }
        return head.next;
    }

    class ListNode {
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
