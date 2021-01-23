package com.san.Algorithm;

import java.util.Stack;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/23/21:45
 */
public class 两数相加Ⅱ_445 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1!=null){
            stack1.push(l1.val);
            l1 = l1.next;
        }

        while (l2!=null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        //表示进位
        int carry = 0;
        ListNode head = new ListNode(-1);
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0){
            int a = stack1.isEmpty() ? 0 : stack1.pop();
            int b = stack2.isEmpty() ? 0 : stack2.pop();
            int cur = a + b + carry;
            carry = cur / 10;
            cur = cur % 10;
            //头插法
            ListNode node = new ListNode(cur);
            node.next = head.next;
            head.next = node;
        }
        return head.next;
    }
}
