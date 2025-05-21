package leetcode;

import java.util.*;

public class _4Sum2 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, -1};

        int[] nums2 = {-2, -1, 0};

        int[] nums3 = {-1, 2, 2};

        int[] nums4 = {0, 2, -1};

//        for(int i = 0; i < nums1.length; i++) {
//            for(int j = 0; j < nums2.length; j++) {
//                for(int k = 0; k < nums3.length; k++) {
//                    for(int l = 0; l < nums4.length; l++) {
//                        if(nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0) {
//                            System.out.println("4 Sum 2 Tuple->"+"("+i+","+j+","+k+","+l+")");
//                        }
//                    }
//                }
//            }
//        }



        int length = nums1.length;
        Map<Integer[],Integer> sum1 = new HashMap<>();
        Map<Integer[],Integer> sum2 = new HashMap<>();

        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                Integer[] k = new Integer[]{i,j};
                sum1.put(k, (nums1[i]+nums2[j]));
            }
        }

        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                Integer[] k = new Integer[]{i,j};
                sum2.put(k, (nums3[i]+nums4[j]));
            }
        }

        Set<Map.Entry<Integer[],Integer>> entrySet1 = sum1.entrySet();
        Set<Map.Entry<Integer[],Integer>> entrySet2 = sum2.entrySet();
        for(Map.Entry<Integer[],Integer> entry1 : entrySet1) {
            for(Map.Entry<Integer[],Integer> entry2 : entrySet2) {
                if(entry1.getValue()+entry2.getValue() == 0) {
                    System.out.println(Arrays.asList(entry1.getKey())+","+Arrays.asList(entry2.getKey()));
                }
            }
        }

        /*Map<Integer,Integer> sum1 = new HashMap<>();
        int count = 0;
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                int sum = nums1[i]+nums2[j];
                sum1.put(sum, sum1.getOrDefault(sum,0)+1);
            }
        }

        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                int sum = -(nums3[i]+nums4[j]);
                count = count + sum1.getOrDefault(sum,0);
            }
        }*/

        //System.out.println("count:"+count);
    }
}
