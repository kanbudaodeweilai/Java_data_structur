package two_stage.day04.Date;

import java.text.ParseException;
import java.util.Date;

public class DateUtilsDemo {
    public static void main(String[] args) throws ParseException {
        String s = "2021-09-05 14:08:56";
        System.out.println(DateUtils.stingToDate(s,"yyyy-MM-dd HH:mm:ss"));
        Date d = new Date();
        System.out.println(DateUtils.dateToSting(d,"yyyy-MM-dd HH:mm:ss"));
    }
}
