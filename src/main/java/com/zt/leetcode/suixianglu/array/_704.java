package com.zt.leetcode.suixianglu.array;

/**
 * @BelongsProject: leetcode
 * @BelongsPackage: com.zt.leetcode.array
 * @Author: zt
 * @CreateTime: 2023-02-28  21:44
 * @Description:
 */

public class _704 {

    //二分法，采用左闭右闭区间的做法
    public int search(int[] nums, int target) {
        //如果target小于最左边或大于最右边，直接返回-1
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        int middle = 0;
        //左闭右闭区间，所以left=right时这个区间是合法的，因此while的循环条件是<=而不是<
        while(left <= right){
            middle = (left + right) / 2;
            if(target == nums[middle]){
                return middle;
            }else if(target < nums[middle]){
                //如果target < nums[middle]，因为我们判断的是左闭右闭区间，所以我们已经确定target < nums[middle]的情况下，
                //就不需要再次判断nums[middle]这个位置了，因此区间的右边界就比middle小1
                right = middle - 1;
            }else if(target > nums[middle]){
                //同右边界
                left = middle + 1;
            }
        }
        return -1;
    }

}
