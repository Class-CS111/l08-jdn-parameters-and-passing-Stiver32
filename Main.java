// PARTNER NAME: 
// PARTNER NAME: 
// CS111 SECTION #: 
// DATE:

public class Main
{
    public static void main(String[] args)
    {
        int month = 0;
        int day = 0;
        int year = 0;
        int jdnDate = 0;

        month = 02;
        day = 26;
        year = 2025;

        jdnDate = Main.calcJulianDate(month, day, year);
        System.out.println("The calculated Julian date for today is: " + jdnDate);

    }
    public static int calcJulianDate(int month, int day, int year)
    {
        int a = 0;
        int m = 0;
        int y = 0;
        int jdnToday = 0;

        a = (14 - month) /12;
        m = month + 12 * a - 3;
        y = year+ 4800 - a;
        jdnToday = day + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;
        return jdnToday;

    }





}