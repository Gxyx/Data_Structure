package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/23/22:59
 */
public class 奇偶链表_328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even!=null&&even.next!=null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
