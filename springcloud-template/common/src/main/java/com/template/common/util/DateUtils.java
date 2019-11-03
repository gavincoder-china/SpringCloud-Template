package com.template.common.util;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;


/**
 * @author ltl
 * @date 2019/10/20 21:09
 */

public class DateUtils {

    //获取当天剩余的秒数
    public static long getLeftSecond() {
        LocalDateTime midnight = LocalDateTime.now().plusDays(1).withHour(0).withMinute(0).withSecond(0).withNano(0);
        // 毫秒
        // long millSeconds = ChronoUnit.MILLIS.between(LocalDateTime.now(), midnight);
        //秒
        long seconds = ChronoUnit.SECONDS.between(LocalDateTime.now(), midnight);
        return seconds;
    }

    //判断两个日期是否为同一天
    public static boolean sameDate(Date d1, Date d2){
        SimpleDateFormat fmt = new SimpleDateFormat("yyyyMMdd");
        //fmt.setTimeZone(new TimeZone()); // 如果需要设置时间区域，可以在这里设置
        return fmt.format(d1).equals(fmt.format(d2));
    }

}