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
        System.out.println("1) " + s.matches("^Java"));
        System.out.println("2) " + s.matches("\Breg.*"));
        System.out.println("3) " + s.matches("n.w\s+h(a|i)s"));
        System.out.println("4) " + s.matches("s?"));
        System.out.println("5) " + s.matches("s*"));
        System.out.println("6) " + s.matches("s+"));
        System.out.println("7) " + s.matches("s{4}"));
        System.out.println("8) " + s.matches("S{1}"));
        System.out.println("9) " + s.matches("s{0,3}"));
    }
}
