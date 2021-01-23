package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/21/23:25
 */
public class 反转链表_206 {



    /**
     * 迭代
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr!=null){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev;
    }

    /**
     * 递归
     * @param head
     * @return
     */
    public ListNode reverseList1(ListNode head) {
            if (head == null || head.next==null){
                return head;
            }
            ListNode next = head.next;
            ListNode newhead = reverseList(next);
            next.next = head;
            head.next = null;
            return newhead;
    }

    /**
     * 头插法
     * @param head
     * @return
     */
    public ListNode reverseList2(ListNode head) {
        ListNode newHead = new ListNode(-1);
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead.next;
            newHead.next = head;
            head = next;
        }
        return newHead.next;
    }
}
