package com.zt.leetcode;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @BelongsProject: leetcode
 * @BelongsPackage: com.zt.leetcode
 * @Author: zt
 * @CreateTime: 2023-02-28  20:48
 * @Description:
 */

@SpringBootTest
public class array {

    @Test
    public void test(){
        int[] test = new int[]{-1,0,3,5,9,12};
        int target = 9;
        array.search(test, target);
    }


    public static int search(int[] nums, int target) {
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        int middle = (left + right) / 2;
        while(left <= right){
            if(target == nums[middle]){
                return middle;
            }else if(target < nums[middle]){
                right = middle - 1;
            }else if(target > nums[middle]){
                left = middle + 1;
            }
        }
        return -1;
    }

}
