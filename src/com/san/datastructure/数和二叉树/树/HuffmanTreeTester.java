package com.san.datastructure.数和二叉树.树;

/**
 * @Auther: Gxyx
 * @Date: 2021/01/01/16:28
 */
public class HuffmanTreeTester {

    public static void main(String[] args) throws Exception {
        int[] leafs = {2,4,5,3};
        HuffmanTree tree = new HuffmanTree(leafs);
        HuffmanNode[] nodeList = tree.huffmanTree;
        for (HuffmanNode node : nodeList) {
            System.out.println(node);
        }
    }
}
