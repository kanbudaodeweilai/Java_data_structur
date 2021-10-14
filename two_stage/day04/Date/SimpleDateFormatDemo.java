package two_stage.day04.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS'Z'");
        System.out.println(sdf.format(d));

        String s = "2021-09-05T14:02:29:195Z";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS'Z'");
        Date date = sdf2.parse(s);
        System.out.println(date);


    }
}
