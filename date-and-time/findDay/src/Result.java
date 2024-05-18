import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.YEAR, year);
        Date date = calendar.getTime();
        int dayInNumber = date.getDay();
        String dayOfWeek = "";
        switch(dayInNumber){
            case 1:
                dayOfWeek = "MONDAY";
                break;
            case 2:
                dayOfWeek = "TUESDAY";
                break;
            case 3:
                dayOfWeek = "WEDNESDAY";
                break;
            case 4:
                dayOfWeek = "THURSDAY";
                break;
            case 5:
                dayOfWeek = "FRIDAY";
                break;
            case 6:
                dayOfWeek = "SATURDAY";
                break;
            default:
                dayOfWeek = "SUNDAY";
                break;
        }
        System.out.println(dayOfWeek);
        return dayOfWeek;
    }
}