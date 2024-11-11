package ma.zyn.app.dao.facade.core.product;

import org.springframework.data.jpa.repository.Query;
import ma.zyn.app.zynerator.repository.AbstractRepository;
import ma.zyn.app.bean.core.product.Product;
import org.springframework.stereotype.Repository;
import ma.zyn.app.bean.core.product.Product;
import java.util.List;


@Repository
public interface ProductDao extends AbstractRepository<Product,Long>  {
    Product findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Product(item.id,item.label) FROM Product item")
    List<Product> findAllOptimized();

}
