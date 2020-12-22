package com.san.Algorithm;

import java.util.Arrays;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/06/20:49
 */
public class 分配饼干 {
    public static void main(String[] args) {
        int[] grid={1,3};
        int[] size={1,2,4};
        System.out.println(findContentChildren(grid,size));
    }
    public static int findContentChildren(int[] grid, int[] size) {
        Arrays.sort(grid);
        Arrays.sort(size);
        int gi = 0;
        int si = 0;
        while (gi<grid.length&&si<grid.length){
            if (grid[gi]<=size[si]){
                gi++;
            }
            si++;
        }
        return gi;
    }
}
