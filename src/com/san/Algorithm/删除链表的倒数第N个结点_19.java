package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/22/15:15
 */
public class 删除链表的倒数第N个结点_19 {


    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i=0;i<n;i++){
            fast = fast.next;
        }
        while (fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode pre = head;
        int last = length(head) - n;
        if (pre == null){
            return head.next;
        }
        for (int i=0;i<last-1;i++){
            pre = pre.next;
        }
        pre.next = pre.next.next;
        return head;
    }


    /**
     * 链表长度
     * @param head
     * @return
     */
    public int length(ListNode head){
        int n = 0;
        while (head!=null){
            n++;
            head = head.next;
        }
        return n;
    }
}
