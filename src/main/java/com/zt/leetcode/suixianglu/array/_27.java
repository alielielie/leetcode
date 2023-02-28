package com.zt.leetcode.suixianglu.array;

import org.springframework.stereotype.Component;

/**
 * @BelongsProject: leetcode
 * @BelongsPackage: com.zt.leetcode.suixianglu.array
 * @Author: zt
 * @CreateTime: 2023-02-28  22:28
 * @Description:
 */

@Component
public class _27 {

    //快慢指针法
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int slowIndex = 0;
        //当快指针遇到不等于目标值的元素，就把这个元素赋值给慢指针的位置，然后慢指针向后移
        //如果快指针遇到了等于目标值的元素，直接不做任何操作，就相当于删除了这个元素，慢指针不做移动
        for(int fastIndex = 0;fastIndex < nums.length;fastIndex++){
            if(nums[fastIndex] != val){
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
                count++;
            }
        }
        return count;
    }

}
