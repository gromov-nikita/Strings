/*
Exercise 4: (3) Modify Receipt.java so that the widths are all controlled by a single set of
constant values. The goal is to allow you to easily change a width by changing a single value
in one place.
 */
import java.util.*;
public class Receipt {
    private double total = 0;
    private static String lengthItem = "%-16s";
    private static String lengthQty = "%6s";
    private static String lengthPrice = "%10s";
    private static String lengthDoublePrice = "%10.2f";
    private static String lengthName = "%-16.15s";
    private static final int indent = 15;
    private Formatter f = new Formatter(System.out);
    public static String getLengthItem() {
        return lengthItem;
    }
    public static void setLengthItem(String lengthItem) {
        Receipt.lengthItem = lengthItem;
    }

    public static String getLengthQty() {
        return lengthQty;
    }

    public static void setLengthQty(String lengthQty) {
        Receipt.lengthQty = lengthQty;
    }

    public static String getLengthPrice() {
        return lengthPrice;
    }
    public static void setLengthPrice(String lengthPrice) {
        Receipt.lengthPrice = lengthPrice;
    }


    public void printTitle() {
        f.format(lengthItem + lengthQty + lengthPrice + "\n", "Item", "Qty", "Price");
        f.format(lengthItem + lengthQty + lengthPrice +"\n", "----", "---", "-----");
    }
    public void print(String name, int qty, double price) {
        f.format(lengthName + lengthQty + lengthDoublePrice + "\n", name, qty, price);
        total += price;
    }
    public void printTotal() {
        f.format(lengthItem + lengthQty + lengthDoublePrice + "\n", "Tax", "", total*0.06);
        f.format(lengthItem + lengthQty + lengthPrice + "\n", "", "", "-----");
        f.format(lengthItem + lengthQty + lengthDoublePrice + "\n", "Total", "",
                total * 1.06);
    }
    public static void main(String[] args) {
        Receipt receipt = new Receipt();
        receipt.printTitle();
        receipt.print("Jack’s Magic Beans", 4, 4.25);
        receipt.print("Princess Peas", 3, 5.1);
        receipt.print("Three Bears Porridge", 1, 14.29);
        receipt.printTotal();
    }
}