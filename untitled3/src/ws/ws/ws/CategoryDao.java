package ws.ws.ws;

import ws.ws.ws.ws.Productcontroller;
import ws.ws.ws.ws.ProductdaoImpl;

import java.util.List;

public interface CategoryDao extends Dao<Productcontroller.Category> {

    interface CatalogueService {

            List<ProductdaoImpl.Product> getAllproducts();
            void addProduct(ProductdaoImpl.Product p);
        void updateProduct(ProductdaoImpl.Product p);
        void deleteProduct(ProductdaoImpl.Product p);
        List<Productcontroller.Category> getAllcatagorys();
        void addcategory(Productcontroller.Category c);
        void deletecategory(Productcontroller.Category c);


    }
}
