package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._77;
import org.junit.BeforeClass;
import org.junit.Test;

public class _77Test {
    private static _77.Solution1 solution1;
    private static _77.Solution2 solution2;

    @BeforeClass
    public static void setup() {
        solution1 = new _77.Solution1();
        solution2 = new _77.Solution2();
    }

    @Test
    public void test1() {
        CommonUtils.printListList(solution1.combine(4, 2));
        CommonUtils.printListList(solution2.combine(4, 2));
    }
}
