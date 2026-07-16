public class Lesson7 {
    public static void main(String[] args) {
        String customerName = "Andrew Ryder";
        double item1 = 299.50;
        double item2 = 1200.75;
        double item3 = 450.25;

        double total = (item1 + item2 + item3);
        double vat = total * 0.12;
        double grandTotal = total + vat;
        int wholeTotal = (int) grandTotal;

        System.out.println("Customer Name: " + customerName);
        System.out.println("Jacket:" + item1);
        System.out.println("Headphones: " + item2);
        System.out.println("Pants: " + item3);
        System.out.println("Total: " + total);
        System.out.println("VAT (12%): " + vat);
        System.out.println("Grand Total: " + grandTotal);
        System.out.println("Whole Total: " + wholeTotal);
        System.out.println("Do you get free shipping? " + (grandTotal > 500));

    }
}
