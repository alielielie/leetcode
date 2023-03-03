package com.zt.leetcode.suixianglu.array;

/**
 * @BelongsProject: leetcode
 * @BelongsPackage: com.zt.leetcode.suixianglu.array
 * @Author: zt
 * @CreateTime: 2023-03-03  13:30
 * @Description:
 */

public class _977 {

    //双指针法，因为是非递减数组，所以平方后最大的值不是在最左侧，就是在最右侧，
    //因此用两个指针，一个在头部，一个在尾部
    public int[] sortedSquares(int[] nums) {
        //新的数组来接收平方后的结果
        int[] arr = new int[nums.length];
        int k = arr.length - 1;
        int i = 0;
        int j = nums.length - 1;
        //<= 不能遗漏=，不然中间的元素会丢掉
        while(i <= j){
            if(nums[i] * nums[i] > nums[j] * nums[j]){
                arr[k] = nums[i] * nums[i];
                k--;
                i++;
            }else{
                arr[k] = nums[j] * nums[j];
                k--;
                j--;
            }
        }
        return arr;
    }

}
