package date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Dave on 2017/8/31
 * Describes
 */
public class DateTest {

    ///////////////////////////////////////////////////////////////////////////
    // Date与String 之间的互转
    ///////////////////////////////////////////////////////////////////////////
    @Test
    public void dateToString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(new Date());
        System.out.println(format);
    }

    @Test
    public void stringToDate() {
        String dateStr = "2017-09-11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date;
        try {
            date = sdf.parse(dateStr);
        } catch (ParseException e) {
            date = new Date();
        }
    }

    ///////////////////////////////////////////////////////////////////////////
    // 获得格林威治时间的几种方式
    ///////////////////////////////////////////////////////////////////////////

    @Test
    public void getTime() {
        //方式一
        long time1 = new Date().getTime();
        System.out.println("Date方式：" + time1);

        //方式二
        Calendar calendar = Calendar.getInstance();
        long time2 = calendar.getTimeInMillis();
        System.out.println("Calendar方式：" + time2);

        //方式三
        System.out.println("System方式：" + System.currentTimeMillis());

        //方式四
        Clock clock = Clock.systemDefaultZone();
        System.out.println("clock方式：" + clock.millis());

    }

    ///////////////////////////////////////////////////////////////////////////
    // Calendar的常用操作
    ///////////////////////////////////////////////////////////////////////////

    @Test
    public void setTime() {
        Calendar c1 = Calendar.getInstance();
        //昨天的这个时间
        c1.set(Calendar.DATE, -1);
        System.out.println("昨天的这个时间是：" + c1.getTime());

        //5小时后
        Calendar c2 = Calendar.getInstance();
        c2.set(Calendar.HOUR, 5);
        System.out.println("5小时后：" + c2.getTime());

        //5天后
        Calendar c3 = Calendar.getInstance();
        c3.add(Calendar.DATE, 5);//默认从当前时间开始计算
        System.out.println("5天后的时间：" + c3.getTime());

        //这个月第几天
        Calendar c4 = Calendar.getInstance();
        System.out.println("今天是这个月的第几天:" + c4.get(Calendar.DAY_OF_MONTH));

        //现在是第几个月 需要+1
        System.out.println("现在是今年的第几月:" + (c4.get(Calendar.MONTH) + 1));

        //年份
        System.out.println("今年是：" + c4.get(Calendar.YEAR));

        //星期的第几天 从星期天开始计算需要减1
        System.out.println("今天是星期几：" + (c4.get(Calendar.DAY_OF_WEEK) - 1));

    }


}
