import ws.ws.ws.CatalogueServiceImpl;
import ws.ws.ws.CategoryDao;
import ws.ws.ws.ws.CategoryDaoImp;
import ws.ws.ws.ws.Productcontroller;
import ws.ws.ws.ws.ProductdaoImpl;

public class Main {
    public static void main(String[] args) {
        CategoryDao.CatalogueService catal = new CatalogueServiceImpl(new ProductdaoImpl(),new CategoryDaoImp());
        Productcontroller.Category c = new Productcontroller.Category();
        ProductdaoImpl.Product p = new ProductdaoImpl.Product();
        p.setId(1);
        p.setName("MSI");
        p.setCategory(c);
        List<ProductdaoImpl.Product> products = catal.getAllproducts();
        for (ProductdaoImpl.Product p:products)
        {
            system.out.println("id"+p.getId()+"Name"+p.getName()+"price"+p.getPrice());
        }
    }
}