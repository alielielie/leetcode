package com.zt.leetcode.suixianglu.array;

/**
 * @BelongsProject: leetcode
 * @BelongsPackage: com.zt.leetcode.suixianglu.array
 * @Author: zt
 * @CreateTime: 2023-03-03  15:20
 * @Description:
 */

public class _59 {

    //螺旋矩阵，是一个正方形，顺时针循环，首先要明确的是我们循环每一个边的时候，
    //都只向这个边的开始位置添加元素，不往边的结束位置添加元素
    public int[][] generateMatrix(int n) {
        //定义我们每一圈循环开始的时候的起始位置
        int startX = 0;
        int startY = 0;
        //定义一个边界，用来保证我们给每一个边填充元素的时候能不填充结束位置的元素，这个值每循环一圈还会增大一
        int offset = 1;
        int count = 1;
        int[][] arr = new int[n][n];
        int i = 0;
        int j = 0;
        //循环n / 2次
        int loop = n / 2;
        while(loop -- > 0){
            //第一条边，注意n - offset，保证不会填充每一条边的结束位置
            for(j = startY;j < n - offset;j++){
                arr[startX][j] = count++;
            }
            //第二条边
            for(i = startX;i < n - offset;i++){
                arr[i][j] = count++;
            }
            //第三条边，j代表列，现在要逐渐缩小，因此改为>，然后要=offset，因为数组索引从0开始，不然会遗漏掉最左侧（非结束位置）的元素
            for(;j >= offset;j--){
                arr[i][j] = count++;
            }
            //第四条边
            for(;i >= offset;i--){
                arr[i][j] = count++;
            }
            startX++;
            startY++;
            offset++;
        }
        //如果n是奇数，最中间的元素就要单独添加
        if(n % 2 != 0){
            arr[n / 2][n / 2] = count++;
        }
        return arr;
    }

}
