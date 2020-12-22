package com.san.datastructure.线性表;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/18/18:17
 *  顺序表结构
 */
public class SequentialList<T> implements ListInterface<T> {
    //数组存储
    private T[] list;
    //数组容量
    private final static int LIST_SIZE = 100;
    //线性表长度
    private  int length;

    /**
     * 初始化空表
     */
    public SequentialList() {
        list = (T[]) (new Object[LIST_SIZE]);
        length = 0;
    }

    /**
     * 初始化非空线性表
     * @param initialList
     * @param n
     * 将参数数组initialList传入list中
     */
    public SequentialList(T[] initialList, int n) throws Exception {
        list = (T[]) (new Object[LIST_SIZE]);
        length = n;
        if (length>LIST_SIZE){
            throw new Exception("构造线性表，长度越界");
        }
        //初始化线性表数据
        for (int i=0;i<length;i++){
            list[i] = initialList[i];
        }
    }

    /**
     * 遍历线性表
     */
    @Override
    public void printList() {
        if (isEmpty()){
            System.out.println("线性表为空");
        }
        for (int i=0;i<length;i++){
            System.out.println(list[i]+" ");
        }
    }

    /**
     * 判断线性表长度
     * @return
     */
    @Override
    public int length() {
       return length;
    }

    /**
     * 按值查找
     * @param element
     * @return
     */
    @Override
    public int locate(T element) {
        int res = 0;
        for (int i=0;i<length;i++){
            if (list[i].equals(element)){
                res = i+1;
                break;
            }
        }
        return res;
    }

    /**
     * 按位置查找
     * @param i
     * @return
     */
    @Override
    public T getElement(int i) throws Exception {
        if (isEmpty()){
            throw new Exception("表为空");
        }
        if (i<1||i>length){
            throw new Exception("查找位置异常");
        }
        T element = list[i - 1];
        return element;
    }

    /**
     * 插入元素
     * @param i
     * @param element
     */
    @Override
    public void insert(int i, T element) throws Exception {
        if (length == list.length){
            throw new Exception("当前表满了");
        }
        if (i<1||i>length){
            throw new Exception("插入位置异常");
        }
//        for (int index =i;index<=length;index++){
//            list[index] = list[index+1];
//        }
        for (int index =length;index>=i;index--){
            list[index] = list[index-1];
        }
        list[i-1] = element;
        length++;
    }

    /**
     * 删除元素
     * @param i
     * @return
     * @throws Exception
     */
    @Override
    public T delete(int i) throws Exception {
        if (isEmpty()){
            throw new Exception("线性表为空");
        }
        if (i<0||i>length){
            throw new Exception("删除位置异常");
        }
        T element = list[i-1];
        for (int j =i;j<length;j++){
            list[j-1] = list[j];
        }
        length--;
        return element;
    }

    /**
     * 判断是否为空
     * @return
     */
    @Override
    public boolean isEmpty() {
        if(length==0){
            return true;
        }
        return false;
    }
}
