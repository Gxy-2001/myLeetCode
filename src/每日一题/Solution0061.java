package 每日一题;

/**
 * @program: myLeetCode
 * @description:
 * @author: Gxy-2001
 * @create: 2021-03-27
 */
public class Solution0061 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        // 1. 找尾节点，形成环形链表
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            length++;
            tail = tail.next;
        }
        tail.next = head;
        k = k % length;
        // 2. 尾节点移动 length - k 步
        for (int i = 0; i < length - k; i++) {
            tail = tail.next;
        }
        // 3. 找到头节点，断开头尾连接
        head = tail.next;
        tail.next = null;
        return head;
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
