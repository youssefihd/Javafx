package ws.ws.ws.ws;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductdaoImpl implements ProductDao{

    @Override
    public Product find(long id) {
        Connection connection = Connexion.getConnection();
        try  {
            PreparedStatement pst=connection.prepareStatement("select * from Products where ID=?")
        pst.setLong(1,id);
       ResultSet rs= pst.executeQuery();
         Product p =new Product();
         if(rs.next())
         {
             p.setId(rs.getLong("ID"));
             p.setName(rs.getString("NAME"));
             p.setPrice(rs.getFloat("price"));
         }
        } catch(Exception e){
        e.printStackTrace();
    }
        return null;
    @Override
    public List<Product> findall() {
        List<Product> products=new ArrayList<>();
        Connection connection =Connexion.getConnection();
        try {
            PreparedStatement pst = connection.prepareStatement("select * PRODUCTS");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getLong("ID"));
                p.setName(rs.getString("NAME"));
                p.setPrice(rs.getFloat("price"));
                products.add(p);
            }
        }
          catch(Exception e){
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public void save(Product o) {
            Connection connection =Connexion.getConnection();
        try{
            PreparedStatement pst =connection.prepareStatement("insert into PRODUCTS(NAME,REFERENCE,PRICE,ID_CAT)"+"values(?,?,?,?)");
            pst.setString(1,o.getName());
            pst.setString(2,o.getReference());
            pst.setFloat(3,o.getPrice());
            pst.setLong(4,o.getCategory().getId());
            pst.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
        }

    @Override
    public void delete(Product o) {
            Connection connection =Connexion.getConnection();
            try {
            PreparedStatement pst=connection.prepareStatement("delete from PRODUCTS where id=?");
            pst.setLong(1,o.getId());
            pst.executeUpdate();

            } catch(Exception e){
                e.printStackTrace();
            }
    }

    @Override
    public void update(Product o) {
            Connection connection =Connexion.getConnection();
            try {
                PreparedStatement pst=connection.prepareStatement("update PRODUCTS set name=?,reference=?,price=?");
                pst.setString(1,o.getName());
                pst.setString(2,o.getReference());
                pst.setFloat(3,o.getPrix());
                pst.executeUpdate();

            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Product> findbyquery(String query) {
        return null;
    }

