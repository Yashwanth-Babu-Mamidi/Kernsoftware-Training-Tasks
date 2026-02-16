package feb16th;
public class InvoiceGenerator {
    public static void main(String[] args) {

        StringBuilder invoice = new StringBuilder();

        invoice.append("----- Invoice -----\n");
        invoice.append("Product: Laptop\n");
        invoice.append("Price: 50000\n");
        invoice.append("GST: 18%\n");
        invoice.append("Total: 59000\n");
        invoice.append("-------------------");

        System.out.println(invoice);
    }
}


