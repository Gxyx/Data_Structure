package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/23/21:01
 */
public class 两两交换链表中的节点_24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;
        while (temp.next!=null&&temp.next.next!=null){
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;

            temp = node1;
        }
        return dummy.next;
    }
}
