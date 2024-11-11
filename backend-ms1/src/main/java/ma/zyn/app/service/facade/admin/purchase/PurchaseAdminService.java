package ma.zyn.app.service.facade.admin.purchase;

import java.util.List;
import ma.zyn.app.bean.core.purchase.Purchase;
import ma.zyn.app.dao.criteria.core.purchase.PurchaseCriteria;
import ma.zyn.app.zynerator.service.IService;



public interface PurchaseAdminService {







	Purchase create(Purchase t);

    Purchase update(Purchase t);

    List<Purchase> update(List<Purchase> ts,boolean createIfNotExist);

    Purchase findById(Long id);

    Purchase findOrSave(Purchase t);

    Purchase findByReferenceEntity(Purchase t);

    Purchase findWithAssociatedLists(Long id);

    List<Purchase> findAllOptimized();

    List<Purchase> findAll();

    List<Purchase> findByCriteria(PurchaseCriteria criteria);

    List<Purchase> findPaginatedByCriteria(PurchaseCriteria criteria, int page, int pageSize, String order, String sortField);

    int getDataSize(PurchaseCriteria criteria);

    List<Purchase> delete(List<Purchase> ts);

    boolean deleteById(Long id);

    List<List<Purchase>> getToBeSavedAndToBeDeleted(List<Purchase> oldList, List<Purchase> newList);

    public String uploadFile(String checksumOld, String tempUpladedFile,String destinationFilePath) throws Exception ;

}
