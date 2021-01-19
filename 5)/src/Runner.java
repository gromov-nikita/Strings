/*
Exercise 5: (5) For each of the basic conversion types in the above table, write the most
complex formatting expression possible. That is, use all the possible format specifiers
available for that conversion type.
 */
import java.util.*;
public class Runner {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        int a = 100000000;
        f.format("%+-,20d   %d\n",a,3);
        char b = 'q';
        f.format("%-20c %d\n",b,3);
        boolean c = true;
        f.format("%-20b %d\n",c,3);
        String d = "QWER";
        f.format("%-20s %d\n",d,3);
        double e = 1234567.7654321D;
        f.format("%+-,20.10f %d\n",e,3);
        float g = 1234.4321F;
        f.format("%+-20e %d\n",g,3);
        int h = 348451;
        f.format("0x%-20X %d\n",h,3);
        int i = 348451;
        f.format("%-20h %d\n",i,3);
        int j = 348451;
        f.format("%-20% %d\n",j,3);

    }
}
