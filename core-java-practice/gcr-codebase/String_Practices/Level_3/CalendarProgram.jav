import java.util.Scanner;

public class CalendarProgram { 
    public static String getMonthName(int month) {
        String[] months = {"January", "February", "March", "April", "May", "June",
                           "July", "August", "September", "October", "November", "December"};
        return months[month - 1];
    } 
    public static boolean isLeapYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
            return true;
        return false;
    } 
    public static int getNumberOfDays(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year))
            return 29;
        return days[month - 1];
    } 
    public static int getFirstDay(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (1 + x + (31 * m) / 12) % 7;
        return d;  
    } 
    public static void printCalendar(int month, int year) {
        System.out.println("    " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        int numberOfDays = getNumberOfDays(month, year); 
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        } 
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day);
            if (((day + firstDay) % 7 == 0) || (day == numberOfDays))
                System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int month = sc.nextInt(); 
        int year = sc.nextInt();
        printCalendar(month, year);
    }
}
