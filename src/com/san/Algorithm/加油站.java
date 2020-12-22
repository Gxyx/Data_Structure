package com.san.Algorithm;

/**
 * @Auther: Gxyx
 * @Date: 2020/11/18/19:40
 */
public class 加油站 {
    public static void main(String[] args) {
       int[] gas = {1,2,3,4,5};
       int[] cost = {3,4,5,1,2};
        System.out.println(canCompleteCircuit2(gas,cost));
    }
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n  = gas.length;
        for (int i=0;i<n;i++){
            int j =i;
            int remain = gas[i];
            while (remain-cost[j]>=0){
                remain = remain-cost[j]+gas[(j+1)%n];
                j = (j+1)%n;  // 加油站是环形的
                //能够绕一圈
                if (i==j){
                    return i;
                }
            }
        }
        return -1;
    }

    public static int canCompleteCircuit1(int[] gas, int[] cost) {
        int n  = gas.length;
        //记录能到的最远距离
        int[] farIndex  = new int[n];
        for (int i =0;i<farIndex .length;i++){
            farIndex [i] =-1;
        }
        //记录达到最远距离时剩的汽油
        int[] farIndexRemain = new int[n];
        for (int i=0;i<n;i++){
            int j =i;
            int remain = gas[i];
            while (remain-cost[j]>=0){
                //到达下个点的剩余
                remain = remain-cost[j];
                j = (j+1)%n;  // 加油站是环形的
                //判断之前没有考虑过这个点
                if (farIndex[j]!=-1){
                    //加上当时剩余的汽油
                    remain = remain+farIndexRemain[j];
                    //j进行跳跃
                    j = farIndex[j];
                }else {
                    //加上当前点的补给
                    remain = remain+gas[j];
                }
                //能够绕一圈
                if (j==i){
                    return i;
                }
            }
            //记录当前点最远到达哪里
            farIndex[i] = j;
            //记录当前点的剩余
            farIndexRemain[i] = remain;
        }
        return -1;
    }

    /**
     * 如果 i 最远能够到达 j ，根据上边的结论 i + 1 到 j 之间的节点都不可能绕一圈了。想象成一个圆，所以 i 后边的节点就都不需要考虑了，直接返回 -1 即可。
     * 是因为，i到j之间都不能绕一圈，j到i之间的起点都已经被检查过也不能绕一圈，所以可以直接retrun -1
     *       * * * * * *
     *           ^   ^
     *           j   i
     */
    public static int canCompleteCircuit2(int[] gas, int[] cost) {
        int n  = gas.length;
        for (int i=0;i<n;i++){
            int j =i;
            int remain = gas[i];
            while (remain-cost[j]>=0){
                //减去花费的加上新的点的补给
                remain = remain-cost[j]+gas[(j+1)%n];
                j = (j+1)%n;  // 加油站是环形的
                //能够绕一圈
                if (j==i){
                    return i;
                }
                }
            //最远距离绕到了之前，所以 i 后边的都不可能绕一圈了
            if (j<i){
                return -1;
            }
            //i 直接跳到 j，外层 for 循环执行 i++，相当于从 j + 1 开始考虑
            i=j;
        }
        return -1;
    }
}
