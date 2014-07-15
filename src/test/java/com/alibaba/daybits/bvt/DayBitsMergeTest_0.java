package com.alibaba.daybits.bvt;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.daybits.DayBits;

public class DayBitsMergeTest_0 extends TestCase {

    public void test_merge_0() throws Exception {
        DayBits a = new DayBits();
        DayBits b = new DayBits();

        a.set(20140301);
        b.set(20140301);
        
        a.merge(b);
        
        Assert.assertEquals(1, a.count());
        Assert.assertTrue(a.get(20140301));
    }
    
    public void test_merge_n0() throws Exception {
        DayBits a = new DayBits();
        DayBits b = new DayBits();

        a.set(20080301);
        b.set(20080301);
        
        a.merge(b);
        
        Assert.assertEquals(1, a.count());
        Assert.assertTrue(a.get(20080301));
    }
    
    public void test_merge_1() throws Exception {
        DayBits a = new DayBits();
        DayBits b = new DayBits();
        
        a.set(20140301);
        b.set(20140302);
        
        a.merge(b);
        
        Assert.assertEquals(2, a.count());
        Assert.assertTrue(a.get(20140301));
        Assert.assertTrue(a.get(20140302));
    }
    
    public void test_merge_n1() throws Exception {
        DayBits a = new DayBits();
        DayBits b = new DayBits();
        
        a.set(20080301);
        b.set(20080302);
        
        a.merge(b);
        
        Assert.assertEquals(2, a.count());
        Assert.assertTrue(a.get(20080301));
        Assert.assertTrue(a.get(20080302));
    }

    public void test_merge_2() throws Exception {
        DayBits a = new DayBits();
        DayBits b = new DayBits();
        
        a.set(20140301);
        b.set(20150302);
        
        a.merge(b);
        
        Assert.assertEquals(2, a.count());
        Assert.assertTrue(a.get(20140301));
        Assert.assertTrue(a.get(20150302));
    }
    
    public void test_merge_3() throws Exception {
        DayBits a = new DayBits();
        DayBits b = new DayBits();
        
        a.set(20140101);
        b.set(20140302);
        
        a.merge(b);
        
        Assert.assertEquals(2, a.count());
        Assert.assertTrue(a.get(20140101));
        Assert.assertTrue(a.get(20140302));
    }
    
    public void test_merge_summer() throws Exception {
        DayBits a = new DayBits();
        DayBits b = new DayBits();
        
        a.set(20140501);
        b.set(20140602);
        
        a.merge(b);
        
        Assert.assertEquals(2, a.count());
        Assert.assertTrue(a.get(20140501));
        Assert.assertTrue(a.get(20140602));
    }
    
    public void test_merge_autumn() throws Exception {
        DayBits a = new DayBits();
        DayBits b = new DayBits();
        
        a.set(20140701);
        b.set(20140802);
        b.set(20140903);
        
        a.merge(b);
        
        Assert.assertEquals(3, a.count());
        Assert.assertTrue(a.get(20140701));
        Assert.assertTrue(a.get(20140802));
        Assert.assertTrue(a.get(20140903));
    }
    
    public void test_merge_winter() throws Exception {
        DayBits a = new DayBits();
        DayBits b = new DayBits();
        
        a.set(20141001);
        a.set(20141102);
        b.set(20141203);
        
        a.merge(b);
        
        Assert.assertEquals(3, a.count());
        Assert.assertTrue(a.get(20141001));
        Assert.assertTrue(a.get(20141102));
        Assert.assertTrue(a.get(20141203));
    }
    
}
