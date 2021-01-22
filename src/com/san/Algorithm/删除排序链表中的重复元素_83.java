package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/22/0:33
 */
public class 删除排序链表中的重复元素_83 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

}
