package  ma.zyn.app.dao.specification.core.purchase;

import ma.zyn.app.dao.criteria.core.purchase.PurchaseItemCriteria;
import ma.zyn.app.bean.core.purchase.PurchaseItem;
import ma.zyn.app.zynerator.specification.AbstractSpecification;


public class PurchaseItemSpecification extends  AbstractSpecification<PurchaseItemCriteria, PurchaseItem>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateInt("quantity", criteria.getQuantity(), criteria.getQuantityMin(), criteria.getQuantityMax());
        addPredicateBigDecimal("price", criteria.getPrice(), criteria.getPriceMin(), criteria.getPriceMax());
        addPredicateFk("purchase","id", criteria.getPurchase()==null?null:criteria.getPurchase().getId());
        addPredicateFk("purchase","id", criteria.getPurchases());
        addPredicateFk("product","id", criteria.getProduct()==null?null:criteria.getProduct().getId());
        addPredicateFk("product","id", criteria.getProducts());
        addPredicateFk("product","code", criteria.getProduct()==null?null:criteria.getProduct().getCode());
    }

    public PurchaseItemSpecification(PurchaseItemCriteria criteria) {
        super(criteria);
    }

    public PurchaseItemSpecification(PurchaseItemCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
