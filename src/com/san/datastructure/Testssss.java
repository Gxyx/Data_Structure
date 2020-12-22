package com.san.datastructure;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/19/4:47
 */
public class Testssss {
        public static void main(String []args){
            GetMinM();
        }
        private static void GetMinM() {
            int k,m;
            for ( k = 1; k < 14; k++) {
                for ( m = k+1; ; m++) {
                    if (Test(k,m) == true) {
                        System.out.println(k+":"+m);
                        break;
                    }
                }
            }
        }
        private static boolean Test(int k, int m) {
            int i,t = 0,curr = 2*k;
            for (i  = 1; i <= k; i++) {
                t = (t+m-1)%curr;
                curr--;
                if (t < k) {
                    return false;
                }
            }
            return true;
        }
    }

