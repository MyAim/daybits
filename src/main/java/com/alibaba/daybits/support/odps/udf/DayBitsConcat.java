package com.alibaba.daybits.support.odps.udf;

import com.alibaba.daybits.DayBits;
import com.alibaba.daybits.DayBitsUtils;
import com.aliyun.odps.udf.UDAF;
import com.aliyun.odps.udf.UDAFEvaluator;

public class DayBitsConcat extends UDAF {

    public static class DateBitsConcatEvaluator implements UDAFEvaluator {

        private DayBits daybits;

        @Override
        public void init() {
            daybits = new DayBits();
        }

        public void iterate(String date) {
            if (daybits == null) {
                daybits = new DayBits();
            }

            daybits.set(date, true);
        }

        public void merge(String pr) {
            DayBits prDaybits = DayBitsUtils.parse(pr);
            if (this.daybits != null) {
                this.daybits.merge(prDaybits);
            } else {
                this.daybits = prDaybits;
            }
        }

        public String terminatePartial() {
            return DayBitsUtils.toString(daybits);
        }

        public String terminate() {
            return DayBitsUtils.toString(daybits);
        }

        public void setPartial(String pr) {
            this.daybits = DayBitsUtils.parse(pr);
        }
    }
}
