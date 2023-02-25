package ws.ws.ws.ws;

import ws.ws.ws.Dao;
import java.util.List;

public interface ProductDao extends Dao<ProductdaoImpl.Product> {
    List<ProductdaoImpl.Product> findbyquery(String query);

}
