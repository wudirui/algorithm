package test1.linkedlist;

/**
 * 86.分割链表
 * 给你一个链表和一个特定值 x ，请你对链表进行分隔，使得所有小于 x 的节点都出现在大于或等于 x 的节点之前。
 * 你应当保留两个分区中每个节点的初始相对位置。
 * <p>
 * 示例：
 * 输入：head = 1->4->3->2->5->2, x = 3
 * 输出：1->2->2->4->3->5
 */
public class SplitList {
    public ListNode partition(ListNode head, int x) {
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(0);
        ListNode node1 = listNode1;
        ListNode node2 = listNode2;
        while (head != null) {
            if (head.val < x) {
                node1.next = head;
                head = head.next;
                node1 = node1.next;
                node1.next = null;
            } else {
                node2.next = head;
                head = head.next;
                node2 = node2.next;
                node2.next = null;
            }
        }
        node1.next = listNode2.next;
        return listNode1.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
