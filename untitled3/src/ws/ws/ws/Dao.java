package ws.ws.ws;
import java.util.List;
public interface Dao <T>{
    T find(long id);
    List<T> findall();
    void save(T o);
    void delete(T o);
    void update(T o);


}
