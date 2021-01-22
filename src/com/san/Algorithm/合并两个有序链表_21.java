package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/22/0:01
 */
public class 合并两个有序链表_21 {



    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode pre = prehead;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                pre.next = l1;
                l1 = l1.next;
            }else{
                pre.next = l2;
                l2 = l2.next;
            }
            pre = pre.next;
        }
        if(l1 == null){
            pre.next = l2;
        }else{
            pre.next = l1;
        }
        return prehead.next;
    }

    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
