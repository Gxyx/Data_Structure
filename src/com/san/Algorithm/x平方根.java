package com.san.Algorithm;

public class x平方根 {
    public static void main(String[] args) {
        System.out.println(mySqrt1(2147395600));
    }

    public static int mySqrt(int x) {
        int n = (int) Math.sqrt(x);
        return n;
    }

    public static int mySqrt1(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
        }

    public static int mySqrt2(int x) {
        for (long i = 1; i <= x; i++) {
            if(i * i > x) {
                return (int)(i - 1);
            }else if(i * i == x) {
                return (int)i;
            }
        }
        return 0;
    }
    }

