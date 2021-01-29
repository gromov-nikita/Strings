/*
Exercise 20: (2) Create a class that contains int, long, float and double and String
fields. Create a constructor for this class that takes a single String argument, and scans that
string into the various fields. Add a toString( ) method and demonstrate that your class
works correctly.
 */
public class Runner {
    private int a;
    private long b;
    private float c;
    private double d;
    private String s;
    public Runner(String str){
        String[] save = str.split("\\|");
        a = Integer.valueOf(save[0]);
        b = Long.valueOf(save[1]);
        c = Float.valueOf(save[2]);
        d = Double.valueOf(save[3]);
        s = save[4];

    }
    @Override
    public String toString(){
        return a + "\n" + b + "\n" + c + "\n" + d + "\n" + s;
    }

    public static void main(String[] args) {
        Runner obj = new Runner("123|12345|123.34|125.3456745|Hello");
        System.out.println(obj.toString());
    }
}
