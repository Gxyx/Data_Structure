package com.san.datastructure;

/**
 * @Auther: Gxyx
 * @Date: 2020/12/19/4:21
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class Joseph {

        public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
            List<String> output = new ArrayList<String>();
            String kk = "";
            while(!(kk = cin.nextLine()).equals("0")){
                int k = Integer.parseInt(kk);
                int m = k+1;
                int index = -1;
                //标记是否被杀掉
                int[] isKilled = new int[k*2];
                for(int i=0;i<k*2;i++){
                    isKilled[i] = -1;
                }

                for(int i=0;i<k;i++){
                    //重要优化，考虑最后一次杀得是坏人，必然是杀第k+1个人或者第2k个人
                    while(m%(k+1) != 0 && m%(k+1) != 1){
                        m++;
                    }
                    //考虑m很大的时候，只有余数是有效的
                    int temp = m % (k*2 - i);
                    temp = (temp==0?m:temp);
                    int j = 1;
                    while(j <= temp){
                        index ++ ;
                        if(index >= (k*2)){
                            index = index - (k*2);
                        }
                        //依次移动，没有被杀就+1
                        if(isKilled[index] == -1){
                            j++;
                        }
                    }
                    //index小于k说明杀得是好人
                    if(index < k){
                        i = -1;
                        index = -1;
                        for(int l=0;l<k*2;l++){
                            isKilled[l] = -1;
                        }
                        m++;
                    }else{
                        isKilled[index] = i;
                    }
                }
                output.add(m+"");
            }
            cin.close();
            for(int i=0;i<output.size();i++){
                System.out.println(output.get(i));
            }
        }
    }

