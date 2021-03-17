package leetcode;

public class _92_ReverseLinkedListII {
    /**
     * 题目: 92. 反转链表 II
     * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
     *
     * 说明:
     * 1<=m<=n<=链表长度。
     *
     * 示例:
     *
     * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
     * 输出: 1->4->3->2->5->NULL
     *
     * time: O(n）
     * space: O(1)
     *
     */

    /**
     * 思路：
     * 1. 翻转列表需要找起始位置和它前面的结点
     *
     * 例子：
     * 1->2->3->4->5  m = 2, n = 4
     * p  c
     *
     * 1->2->3->4->5
     * p  c  t
     *    2->4  cur.next = temp.next
     *       3->2  temp.next = pre.next;
     * 1->3         pre.next = temp;
     *
     * return 1->3->2->4->5
     */

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy; //起始位置前面的结点
        ListNode cur = dummy.next; //起始位置
        //找到起始位置和它前面的结点
        for (int i = 1; i < m; i++) {
            cur = cur.next; //到2的位置
            pre = pre.next; //到1的位置
        }
        //翻转链表
        for (int i = 0; i < n - m; i++) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return dummy.next;
    }


     // Definition for singly-linked list.
     public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

}
