package com.san;

import java.util.*;

/**
 * @Auther: Gxyx
 * @Date: 2021/05/14/15:18
 */
public class N数之和 {
    /*
	做的一家公司笔试题，两数之和解决，N数之和想了半天，最终参考了别人的思路，收货不错
	参考地址：https://blog.csdn.net/dengz_j/article/details/114540948?ops_request_misc=%257B%2522request%255Fid%2522%253A%2522161832685216780264062836%2522%252C%2522scm%2522%253A%252220140713.130102334.pc%255Fall.%2522%257D&request_id=161832685216780264062836&biz_id=0&utm_medium=distribute.pc_search_result.none-task-blog-2~all~first_rank_v2~rank_v29-1-114540948.first_rank_v2_pc_rank_v29&utm_term=%E7%BB%99%E5%AE%9A%E4%B8%80%E4%B8%AA%E5%8C%85%E6%8B%AC++n+%E4%B8%AA%E6%95%B4%E6%95%B0%E7%9A%84%E6%95%B0%E7%BB%84++nums++%E5%92%8C+%E4%B8%80%E4%B8%AA%E7%9B%AE%E6%A0%87%E5%80%BC++target%E3%80%82%E6%89%BE%E5%87%BA++nums++%E4%B8%AD%E7%9A%84+%E4%BB%BB%E6%84%8F%E4%B8%AA%E6%95%B0%E4%B9%8B%E5%92%8C+%E7%AD%89%E4%BA%8E+target%EF%BC%8C%E5%B9%B6%E6%89%93%E5%8D%B0%E5%87%BA%E6%89%80%E6%9C%89%E7%BB%93%E6%9E%9C%E7%9A%84%E7%B4%A2%E5%BC%95%EF%BC%8C%E7%B4%A2%E5%BC%95%E4%B8%8D%E8%83%BD%E9%87%8D%E5%A4%8D%E3%80%82
*/
        private static int result_count = 0;
        public static void main(String[] args) {
            int[] nums = {1,5,8,17,29,33,39,11,16};
            int target =33;

            int[] map_key = new int[nums.length];//记录map的key值
            int map_key_index = 0;

            // 创建一个map，因为后续需要排序，为了避免下标混乱，使用key来存储下标值
            Map<Integer,Integer> map = new HashMap<Integer,Integer>();
            for(int i=0;i<nums.length;i++) {
                map.put(i, nums[i]);
            }
            // map转换成list进行排序
            List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
            // 排序
            //然后通过比较器来实现排序
            Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {
                //升序排序
                @Override
                public int compare(Map.Entry<Integer, Integer> o1,
                                   Map.Entry<Integer, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());
                }

            });
            // 遍历map，并获取对应key 存入map_key数组中
            for(Map.Entry<Integer,Integer> mapping:list){
                map_key[map_key_index] = mapping.getKey();
                System.out.println(map_key[map_key_index]);
                map_key_index++;
            }

            get_index2(map,0,new int[nums.length],0,target,map_key,new boolean[nums.length]);
        }

        private static void get_index2(Map<Integer,Integer> maps, int current_Index,
                                       int[] middle_result,int result_index,int target,int[] map_key,boolean[] mark) {
            // 上一轮操作后，target的值为：0，说明前面的元素累加等于：target
            if(target == 0) {
                StringBuffer sb = new StringBuffer();
                int[] copy_nums = Arrays.copyOf(middle_result, result_index);
                // 判断当前符合的元素是否又被使用过
                for(int i : copy_nums) {
                    if(mark[i]==false) {
                        continue;
                    }else {
                        return;
                    }
                }
                System.out.print("结果为"+(++result_count)+"：");
                for(int i : copy_nums) {
                    System.out.print(i+",");
                    mark[i] = true;
                }
                System.out.println();
                return;
            }
            // 若当前元素大于target 或者当前元素以及被使用，则直接判断下一个元素
            while(current_Index<maps.size()&&maps.get(map_key[current_Index])>target) {
                current_Index++;
            }
            // 递归调用，maps.get(map_key[current_Index])：用key访问value值
            while(current_Index<maps.size()&&maps.get(map_key[current_Index])<=target) {
                middle_result[result_index] = map_key[current_Index];
                get_index2(maps,current_Index+1,middle_result,result_index+1,target-maps.get(map_key[current_Index]),map_key,mark);
                current_Index++;
            }
        }
    }


