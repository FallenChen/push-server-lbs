package com.supermy.im.netty.handler;

import java.math.BigDecimal;
import java.util.Random;

/**
 * 随机数测试
 *
 * @author cy
 * @create 2018-08-06 13:50
 */
public class RandomNumbertest {

    public static void main(String[] args) {
        double lat = 120.02;
        double s = lat + Math.random() * 10 ;
        BigDecimal bg = new BigDecimal(s);
        double v = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        System.out.println(v);
    }
}
