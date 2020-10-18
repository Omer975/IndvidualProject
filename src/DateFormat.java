import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


class DateFormat{
    public static Date stringToDate(String dateValue) {
        Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        try {

            date = formatter.parse(dateValue);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
