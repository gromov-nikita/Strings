/*
Exercise 19: (8) Building on the previous two exercises, write a program that examines
Java source code and produces all the class names used in a particular program.

Exercise 17: (8) Write a program that reads a Java source-code file (you provide the file
name on the command line) and displays all the comments.

Exercise 18: (8) Write a program that reads a Java source-code file (you provide the file
name on the command line) and displays all the string literals in the code.
 */
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.*;
public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader file = new FileReader("src\\Runner.java");
        Scanner scanner = new Scanner(file);
        Vector<String> vector= new Vector();
        while(scanner.hasNextLine()){
            vector.add(scanner.nextLine());
        }
        System.out.println(vector.toString());
        Pattern p = Pattern.compile("^.*");
        Matcher m;
        Iterator<String> it = vector.iterator();
        int i = 1;
        while(it.hasNext()) {
            m = p.matcher(it.next());
            try {
                System.out.println(i++ + "; "+ m.start() + " " + m.group());
            }
            catch(IllegalStateException ex) {
                System.out.println(i + "; не найдено");
            }
        }
        m = p.matcher("public class Runner");
        System.out.println(m.group());

    }
}
