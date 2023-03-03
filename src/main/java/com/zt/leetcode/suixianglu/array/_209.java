package com.zt.leetcode.suixianglu.array;

import static java.lang.Math.min;

/**
 * @BelongsProject: leetcode
 * @BelongsPackage: com.zt.leetcode.suixianglu.array
 * @Author: zt
 * @CreateTime: 2023-03-03  14:09
 * @Description:
 */

public class _209 {

    //滑动窗口
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int num = 0;
        //将结果先记为最大值
        int result = Integer.MAX_VALUE;
        //滑动窗口中，for循环的变量为结束位置，不能为起始位置
        for(int j = 0;j < nums.length;j++){
            //记录滑动窗口中的和
            num = num + nums[j];
            //用while循环，不能用if，因为滑动窗口的起始位置向后缩的时候不一定只缩一次
            while(num >= target){
                num = num - nums[i];
                //取之前记录的值和当前满足条件的新的滑动窗口的长度中的较小者
                result = Math.min(result, j - i + 1);
                //滑动窗口的起始位置向后移
                i++;
            }
        }
        //如果记录的结果始终为最大值，那么就代表没有满足条件的，直接返回0
        if(result == Integer.MAX_VALUE){
            return 0;
        }else{
            return result;
        }
    }

}
