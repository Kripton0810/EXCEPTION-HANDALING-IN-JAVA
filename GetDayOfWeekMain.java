import java.time.LocalDate;
 
public class GetDayOfWeekMain {
 
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2001, 10, 8);
        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println("Day of week in number:"+dayOfWeek.getValue());
        System.out.println("Day of week in text:"+dayOfWeek.toString());
    }
}