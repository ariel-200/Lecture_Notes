package Week7.Dates;

import java.util.Date;

public class Dates {
    public static void main(String[] args) {

        // A Date object represents a point in time
        // For example, Wednesday, October 26, 2022 3:05pm, CST

        Date now = new Date();
        System.out.println(now);

        // number of milliseconds since midnight january 1, 1970, UTC
        System.out.println(now.getTime());

        long milliseconds = now.getTime(); // long, not int
        System.out.println(milliseconds);

        long numberOFMilliseconds = 1234567891011L;
        Date date2009 = new Date(numberOFMilliseconds);
        System.out.println(date2009);

        if (date2009.before(now)) {
            System.out.println("2009 is earlier than now");
        }

    }
}
