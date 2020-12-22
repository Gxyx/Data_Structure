package com.san.Algorithm;

public class x平方根 {
    public static void main(String[] args) {
        System.out.println(mySqrt1(4));
    }

    public static int mySqrt(int x) {
        int n = (int) Math.sqrt(x);
        return n;
    }

    public static int mySqrt1(int x) {

            int l = 0, r = x, ans = -1;
            while (l <= r) {
                int mid = (l+r) / 2;
                if ( mid * mid <= x) {
                    ans = mid;
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            return ans;

        }
    }

