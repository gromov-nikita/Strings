import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Exercise 10: (2) For the phrase "Java now has regular expressions" evaluate whether the
following expressions will find a match:
1)^Java
2)\Breg.*
3)n.w\s+h(a|i)s
4)s?
5)s*
6)s+
7)s{4}
8)S{1}.
9)s{0,3}

 */
public class Runner {
    public static void main(String[] args) {
        String s = "Java now has regular expressions";
        Pattern p = Pattern.compile("^Java");
        Matcher m = p.matcher(s);
        System.out.println("1) " + m.find());
        p = Pattern.compile("\\Breg.*");
        m = p.matcher(s);
        System.out.println("2) " + m.find());
        p = Pattern.compile("n.w\\s+h(a|i)s");
        m = p.matcher(s);
        System.out.println("3) " + m.find());
        p = Pattern.compile("s?");
        m = p.matcher(s);
        System.out.println("4) " + m.find());
        p = Pattern.compile("s*");
        m = p.matcher(s);
        System.out.println("5) " + m.find());
        p = Pattern.compile("s+");
        m = p.matcher(s);
        System.out.println("6) " + m.find());
        p = Pattern.compile("s{4}");
        m = p.matcher(s);
        System.out.println("7) " + m.find());
        p = Pattern.compile("S{1}");
        m = p.matcher(s);
        System.out.println("8) " + m.find());
        p = Pattern.compile("s{0,3}");
        m = p.matcher(s);
        System.out.println("9) " + m.find());
    }
}
