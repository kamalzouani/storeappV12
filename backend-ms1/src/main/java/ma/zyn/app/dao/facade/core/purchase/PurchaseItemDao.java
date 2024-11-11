package ma.zyn.app.dao.facade.core.purchase;

import ma.zyn.app.zynerator.repository.AbstractRepository;
import ma.zyn.app.bean.core.purchase.PurchaseItem;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PurchaseItemDao extends AbstractRepository<PurchaseItem,Long>  {

    List<PurchaseItem> findByPurchaseId(Long id);
    int deleteByPurchaseId(Long id);
    long countByPurchaseId(Long id);
    List<PurchaseItem> findByProductId(Long id);
    int deleteByProductId(Long id);
    long countByProductCode(String code);


}
