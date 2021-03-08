import java.util.Formatter;

/*
Exercise 6: (2) Create a class that contains int, long, float and double fields. Create a
toString( ) method for this class that uses String.format( ), and demonstrate that your
class works correctly.
 */
public class Runner {
    private int i;
    private long l;
    private float f;
    private double d;
    public Runner (int q,long w, float e,double r){
        i = q;
        l = w;
        f = e;
        d = r;
    }
    @Override
    public String toString(){
        return String.format("%d\n%d\n%f\n%f\n",i,l,f,d);
    }

    public static void main(String[] args) {
        Runner obj = new Runner(10,1000,0.423F,0.123455D);
        System.out.println(obj.toString());
    }
}
