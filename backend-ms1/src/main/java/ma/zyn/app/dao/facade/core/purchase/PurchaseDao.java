package ma.zyn.app.dao.facade.core.purchase;

import ma.zyn.app.zynerator.repository.AbstractRepository;
import ma.zyn.app.bean.core.purchase.Purchase;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface PurchaseDao extends AbstractRepository<Purchase,Long>  {



}
