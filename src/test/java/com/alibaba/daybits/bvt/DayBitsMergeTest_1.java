package com.alibaba.daybits.bvt;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.daybits.DayBits;
import com.alibaba.daybits.DayBitsUtils;

public class DayBitsMergeTest_1 extends TestCase {

    public void test_merge_0() throws Exception {
        DayBits a = DayBitsUtils.parse("IIGAEAAAECEgAw==");
        DayBits b = DayBitsUtils.parse("IICAEAAAECEAAw==");

        a.merge(b);
        
        Assert.assertEquals(11, a.count());
        Assert.assertFalse(a.get(20140301));
    }
    
        
}
