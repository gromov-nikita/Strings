/*
Exercise 19: (8) Building on the previous two exercises, write a program that examines
Java source code and produces all the class names used in a particular program.

Exercise 17: (8) Write a program that reads a Java source-code file (you provide the file
name on the command line) and displays all the comments.

Exercise 18: (8) Write a program that reads a Java source-code file (you provide the file
name on the command line) and displays all the string literals in the code.
 */

import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Runner {
    public static void directoryR(File file) throws FileNotFoundException {
        for(File x : file.listFiles()) {
            if(x.isDirectory()) {
                directoryR(x);
            }
            else {
                javaFileFinderClassName(x);
            }
        }
    }
    public static void javaFileFinderClassName(File f) throws FileNotFoundException {
        Pattern name = Pattern.compile("^\\D+\\.java$");
        Matcher mat = name.matcher(f.getName());
        if(mat.find()) {
            System.out.println(f.getName());
            FileReader file = new FileReader(f);
            Scanner scanner = new Scanner(file);
            List<String> vector = new LinkedList<String>();
            while (scanner.hasNextLine()) {
                vector.add(scanner.nextLine());
            }
            Pattern p = Pattern.compile("class\\s+[A-Z]\\w+");
            Matcher m;
            Iterator<String> it = vector.iterator();
            while (it.hasNext()) {
                m = p.matcher(it.next());
                if (m.find()) {
                    System.out.println(m.group());
                }
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File f = new File(System.getProperty("user.dir"));
        directoryR(f);

    }
}
class Number2 extends Runner{

}
class Number3 extends Runner{

}
abstract class Number4 {
    public abstract void print();
}
class Number5 {

}
class             Number6        extends Runner{

}
