import com.polban.jtk.sales.Product;
import com.polban.jtk.sales.Sales;

public class MainProSales2 {
    public static void main(String[] args) {

        Product product = new Product("Laptop",15000000,10);
        Sales sales = new Sales(product);

        int stockbuyed = 3;
        sales.sellProduct(stockbuyed);

        int restock = 5;
        sales.restockProduct(restock);

        double newprice = 14000000;
        sales.updateProductPrice(newprice);


    }
}