package FirstProject.Hafta25;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class ShopWebsite {

    private static final String HTML_HEADER = "<html><head><title>Sales Website</title></head><body>";
    private static final String HTML_FOOTER = "</body></html>";

    private static final Map<String, String> PRODUCTS = new HashMap<>();

    static {
        PRODUCTS.put("Product 1", "This is a product.");
        PRODUCTS.put("Product 2", "This is another product.");
        PRODUCTS.put("Product 3", "This is one more product.");
    }

    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter(System.out);

        out.println(HTML_HEADER);

        out.println("<h1>Sales Website</h1>");

        out.println("<ul>");
        for (Map.Entry<String, String> product : PRODUCTS.entrySet()) {
            out.println("<li><a href=\"" + product.getKey() + "\">" + product.getValue() + "</a></li>");
        }
        out.println("</ul>");

        out.println(HTML_FOOTER);

        out.close();
    }
}

