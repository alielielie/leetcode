package com.zt.leetcode;

import com.zt.leetcode.suixianglu.array._27;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private _27 testObj;

    @Test
    public void test(){
        int[] arr = new int[]{3,2,2,3};
        testObj.removeElement(arr,3);
    }

}
