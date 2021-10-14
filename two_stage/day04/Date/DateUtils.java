package two_stage.day04.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static  String dateToSting(Date date,String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String d = sdf.format(date);
        return d;

    }

    public static Date stingToDate(String s, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = sdf.parse(s);
        return d;
    }
}
