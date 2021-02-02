package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2021/02/02/23:14
 */
public class 有序链表转换二叉搜索树_109 {

    /**
     * 找到中间结点
     * @param head
     * @return
     */
    public TreeNode sortedListToBST(ListNode head) {
        //边界条件的判断
        if (head == null) return null;
        if (head.next == null) return new TreeNode(head.val);
        //中间结点slow，pre就是中间结点slow的前一个结点
        ListNode preMid = preMid(head);
        ListNode mid = preMid.next;
        //断开链表  链表断开为两部分，一部分是node的左子节点，一部分是node的右子节点
        preMid.next = null;
        TreeNode node  = new TreeNode(mid.val);
        //从head节点到pre节点是node左子树的节点
        node .left = sortedListToBST(head);
        //从slow.next到链表的末尾是node的右子树的结点
        node .right = sortedListToBST(mid.next);
        return node ;
    }

    private ListNode preMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode pre = head;
        while (fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return pre;
    }
}
