package ma.zyn.app.service.facade.admin.purchase;

import java.util.List;
import ma.zyn.app.bean.core.purchase.PurchaseItem;
import ma.zyn.app.dao.criteria.core.purchase.PurchaseItemCriteria;
import ma.zyn.app.zynerator.service.IService;



public interface PurchaseItemAdminService {



    List<PurchaseItem> findByPurchaseId(Long id);
    int deleteByPurchaseId(Long id);
    long countByPurchaseId(Long id);
    List<PurchaseItem> findByProductId(Long id);
    int deleteByProductId(Long id);
    long countByProductCode(String code);




	PurchaseItem create(PurchaseItem t);

    PurchaseItem update(PurchaseItem t);

    List<PurchaseItem> update(List<PurchaseItem> ts,boolean createIfNotExist);

    PurchaseItem findById(Long id);

    PurchaseItem findOrSave(PurchaseItem t);

    PurchaseItem findByReferenceEntity(PurchaseItem t);

    PurchaseItem findWithAssociatedLists(Long id);

    List<PurchaseItem> findAllOptimized();

    List<PurchaseItem> findAll();

    List<PurchaseItem> findByCriteria(PurchaseItemCriteria criteria);

    List<PurchaseItem> findPaginatedByCriteria(PurchaseItemCriteria criteria, int page, int pageSize, String order, String sortField);

    int getDataSize(PurchaseItemCriteria criteria);

    List<PurchaseItem> delete(List<PurchaseItem> ts);

    boolean deleteById(Long id);

    List<List<PurchaseItem>> getToBeSavedAndToBeDeleted(List<PurchaseItem> oldList, List<PurchaseItem> newList);

    public String uploadFile(String checksumOld, String tempUpladedFile,String destinationFilePath) throws Exception ;

}
