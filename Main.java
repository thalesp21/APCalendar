public class Main
{
    public static void main(String[] args)
    {
        System.out.println(APCalendar.numberOfLeapYears(1899, 2025));
        System.out.println(APCalendar.dayOfWeek(4,27,2025));
        System.out.println(APCalendar.dayOfWeek(4,28,2025));
        System.out.println(APCalendar.dayOfWeek(4,29,2025));
        System.out.println(APCalendar.dayOfWeek(4,30,2025));
        System.out.println(APCalendar.dayOfWeek(5,1,2025));
        System.out.println(APCalendar.dayOfWeek(5,2,2025));
        System.out.println(APCalendar.dayOfWeek(5,3,2025));
    }
}