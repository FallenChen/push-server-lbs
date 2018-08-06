package com.supermy.im.utils;

import java.math.BigDecimal;

/**
 * 经纬度
 *
 * @author cy
 * @create 2018-08-06 14:18
 */
public class NumberRam {

    /**
     * 经度
     * @return
     */
    public static final String Longitude(){
        double local = 120.12;
        double s = local + Math.random() * 10 ;
        BigDecimal bg = new BigDecimal(s);
        double v = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return v + "";
    }

    /**
     * 维度
     * @return
     */
    public static final String Latitude(){
        double local = 30.12;
        double s = local + Math.random() * 10 ;
        BigDecimal bg = new BigDecimal(s);
        double v = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return v + "";
    }
}
