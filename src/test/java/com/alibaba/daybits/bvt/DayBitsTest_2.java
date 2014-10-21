package com.alibaba.daybits.bvt;

import junit.framework.TestCase;

import com.alibaba.daybits.support.odps.udf.DayBitsCount;


public class DayBitsTest_2 extends TestCase {
    public void test_count() throws Exception {
        DayBitsCount udf = new DayBitsCount();
        
        udf.evaluate(";,AAMAIAAAAAAAAEA=,");
        udf.evaluate(" ;,AAAAAAAAAAAAQA==,,");
    }
}
