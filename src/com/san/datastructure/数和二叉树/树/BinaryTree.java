package com.san.datastructure.数和二叉树.树;

import com.san.datastructure.栈和队列.queen.LinkedQueue;
import com.san.datastructure.栈和队列.queen.QueueInterface;
import com.san.datastructure.栈和队列.stack.SequentialStack;
import com.san.datastructure.栈和队列.stack.StackInterface;
import com.san.datastructure.线性表.SequentialList;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/23/20:04
 * 二叉链表实现
 */
public class BinaryTree<T> implements BinaryTreeInterface{

    protected BinNode<T> root;

    /**
     * 二叉树初始化
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * 前序遍历
     */

    public void preOrder() {
        preOrder(root);
    }

    /**
     * 前序非递归
     */
    @Override
    public void iteratorPreOrder() throws Exception {
        StackInterface<BinNode> stack = new SequentialStack();
         BinNode node = root;
        while(node!=null||!stack.isEmpty()){
            while(node!=null){
                System.out.println(node.getData()+" ");
                //工作结点node出栈
                stack.push(node);
                //遍历node左孩子
                node = node.getlChild();
            }
            if (!stack.isEmpty()){
                //栈顶元素出栈
                node = stack.pop();
                //遍历node右孩子
                node = node.getrChild();
            }
        }
    }

    /**
     * 重载方法
     * @param node
     */
    private void preOrder(BinNode node){
        if (node==null){
            return;
        }else {
            //访问当前跟结点数据域
            System.out.println(node.getData()+" ");
            //遍历node左子树
            preOrder(node.getlChild());
            //遍历node的右子树
            preOrder(node.getrChild());
        }
    }
    /**
     * 中序遍历
     */
    public void inOrder() {
        inOrder(root);
    }

    /**
     * 中序非递归
     */
    @Override
    public void iteratorinOrder() throws Exception {
        StackInterface<BinNode> stack = new SequentialStack();
        BinNode node = root;
        while(node!=null||!stack.isEmpty()){
            while(node!=null){
                //工作结点node出栈
                stack.push(node);
                //遍历node左孩子
                node = node.getlChild();
            }
            if (!stack.isEmpty()){
                //栈顶元素出栈
                node = stack.pop();

                System.out.println(node.getData()+" ");
                //遍历node右孩子
                node = node.getrChild();
            }
        }
    }

    /**
     * 重载方法
     * @param node
     */
    private void inOrder(BinNode node){
        if (node==null){
            return;
        }else {
            //遍历node左子树
            inOrder(node.getlChild());
            //访问当前跟结点数据域
            System.out.println(node.getData()+" ");
            //遍历node的右子树
            inOrder(node.getrChild());
        }
    }

    /**
     * 后序遍历
     */

    public void postOrder() {
        postOrder(root);
    }

    /**
     * 后序非递归
     */
    @Override
    public void iteratorpostOrder() throws Exception {
        StackInterface<FlagBiNode> stack = new SequentialStack<>();
        BinNode node = root;
        FlagBiNode flagBiNode;
        while (node!=null||!stack.isEmpty()){
            while(node!=null){
                flagBiNode = new FlagBiNode(node,1);
                stack.push(flagBiNode);
                node = node.getlChild();
            }
            while(!stack.isEmpty()&&(stack.getTop()).getFlag()==2){
                node = (stack.pop()).getNode();
                System.out.println(node.getData()+" ");
                node = null;
            }
            if (!stack.isEmpty()){
                flagBiNode = stack.pop();
                flagBiNode.setFlag(2);
                stack.push(flagBiNode);
                node = flagBiNode.getNode().getrChild();
            }
        }
    }

    /**
     * 重载方法
     * @param node
     */
    private void postOrder(BinNode node){
        if (node==null){
            return;
        }else {
            //遍历node左子树
            postOrder(node.getlChild());
            //遍历node的右子树
            postOrder(node.getrChild());
            //访问当前跟结点数据域
            System.out.println(node.getData()+" ");
        }
    }

    /**
     * 层次遍历:从上至下，从左至右
     */
    @Override
    public void levelOrder() throws Exception {
        QueueInterface<BinNode<T>> queue = new LinkedQueue<>();
        if (root ==null){
            return;
        }else {
            queue.enQueue(root);
            while (!queue.isEmpty()){
                //出队
                BinNode tempNode = queue.deQueue();
                //输出结点数据域
                System.out.println(tempNode.getData()+" ");
                if (tempNode.getlChild()!=null){
                    //结点非空左孩子入队
                    queue.enQueue(tempNode.getlChild());
                }
                if (tempNode.getrChild()!=null){
                    //非空又孩子入队
                    queue.enQueue(tempNode.getrChild());
                }

            }
        }
    }

    /**
     * 建立二叉树
     * @param treeElement
     * 使用遍历构建扩展二叉树
     */
    @Override
    public void creatBiTree(SequentialList treeElement) throws Exception {
          root = creatByPreOrder(treeElement);
    }
    //全局变量记录元素
    private int elementCount = 0;
    private BinNode<T> creatByPreOrder(SequentialList<T> treeElement) throws Exception {
        //定义根节点
        BinNode node;
        //结点数加一
        ++elementCount;
        if (elementCount>treeElement.length()|| treeElement.getElement(elementCount).equals("# ")){
            //递归结束;
            node = null;
        }else {
            //新结点
            node = new BinNode<T>(treeElement.getElement(elementCount));
            //递归建立左子树
            node.setlChild(creatByPreOrder(treeElement));
            //递归建立右子树
            node.setrChild(creatByPreOrder(treeElement));
        }
        return node;
    }
}
