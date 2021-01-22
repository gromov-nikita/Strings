/*
Exercise 7: (5) Using the documentation for java.util.regex.Pattern as a resource,
write and test a regular expression that checks a sentence to see that it begins with a capital
letter and ends with a period.

 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("Qwer.".matches("[QWERTYUIOPASDFGHJKLZXCVBNM]{1}\\D+\\.{1}"));
    }
}
