package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/20/12:59
 */
public class 相交链表_160 {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //tempA和tempB我们可以认为是A,B两个指针
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != tempB) {
            //如果指针tempA不为空，tempA就往后移一步。
            //如果指针tempA为空，就让指针tempA指向headB（注意这里是headB不是tempB）
            tempA = tempA == null ? headB : tempA.next;
            //指针tempB同上
            tempB = tempB == null ? headA : tempB.next;
        }
        //tempA要么是空，要么是两链表的交点
        return tempA;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA != tempB) {
            if(tempA!=null){
                tempA = tempA.next;
            }else {
                tempA = headB;
            }

            if (tempB!=null){
                tempB = tempB.next;
            }else {
                tempB = headA;
            }
        }
        return tempA;
    }
}
