package com.alibaba.daybits.bvt;

import org.junit.Assert;

import junit.framework.TestCase;

import com.alibaba.daybits.DayBits;
import com.alibaba.daybits.DayBitsUtils;

public class DayBitsParserTest_1 extends TestCase {
    public void test_0 () throws Exception {
        x_test(";;;;AAAAgA==#");
//        //20130106,20130109,20130116,20130124,20130129,20130222,20130226,20130303,20130311,20130314,20130315
//        //20130106,20130116,20130124,20130129, 20130222,20130226,20130303,20130314,20130315
//        DayBits a = new DayBits();
//        a.set(20080201);
//        a.set(20130106);
//        a.set(20130116);
//        a.set(20130124);
//        a.set(20130129);
//        a.set(20130222);
//        a.set(20130226);
//        a.set(20130303);
//        a.set(20130314);
//        a.set(20130315);
//        
//        String text = a.toString();
//        
//        DayBits b = DayBitsUtils.parse(text);
//        
//        System.out.println(a.toString());
//        System.out.println(b.toString());
//        
//        Assert.assertEquals(10, b.count());
//        Assert.assertTrue(b.get(20080201));
//        Assert.assertTrue(b.get(20130315));
    }
    
    void x_test(String text) {
        DayBits daybits = DayBitsUtils.parse(text);
        Assert.assertEquals(text, daybits.toString());
    }
}
