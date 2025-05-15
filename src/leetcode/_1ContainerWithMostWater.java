package leetcode;

import java.util.Arrays;

/**
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 */
public class _1ContainerWithMostWater {

    public static void main(String[] args) {
        int[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(array));
    }

    public static int maxArea(int[] height) {
        int maxArea = 0;
        for(int i = 0; i < height.length; i++) {
            for(int j = i+1; j < height.length; j++) {
                int temp = 0;
                if(height[i] < height[j]) {
                    temp = height[i]*(j-i);
                } else {
                    temp = height[j]*(j-i);
                }
                maxArea =  temp > maxArea ? temp: maxArea;
            }
        }
        return maxArea;
    }

//    public static int maxArea2(int[] height) {
//        int[] sortedArray = new int[height.length];
//        System.arraycopy(height,0,sortedArray,0,height.length);
//        Arrays.sort(sortedArray);
//        int maxArea = 0;
//        for(int i = sortedArray.length -1; i > 0; i--) {
//            int width = height.
//        }
//        return maxArea;
//    }
}
