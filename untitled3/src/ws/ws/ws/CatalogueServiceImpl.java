package ws.ws.ws;

import ws.ws.ws.ws.ProductDao;
import ws.ws.ws.ws.Productcontroller;
import ws.ws.ws.ws.ProductdaoImpl;

import java.util.List;

public class CatalogueServiceImpl implements CategoryDao.CatalogueService {
    private ProductDao productDao;
    private CategoryDao categoryDao;

    public CatalogueServiceImpl(ProductDao productDao, CategoryDao categoryDao) {
        this.productDao = productDao;
        this.categoryDao = categoryDao;
    }

    @Override
    public List<ProductdaoImpl.Product> getAllproducts() {
        return null;
    }

    @Override
    public void addProduct(ProductdaoImpl.Product p) {

    }

    @Override
    public void updateProduct(ProductdaoImpl.Product p) {

    }

    @Override
    public void deleteProduct(ProductdaoImpl.Product p) {

    }

    @Override
    public List<Productcontroller.Category> getAllcatagorys() {
        return null;
    }

    @Override
    public void addcategory(Productcontroller.Category c) {

    }

    @Override
    public void deletecategory(Productcontroller.Category c) {

    }
}
