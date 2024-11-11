package  ma.zyn.app.dao.specification.core.product;

import ma.zyn.app.dao.criteria.core.product.ProductCriteria;
import ma.zyn.app.bean.core.product.Product;
import ma.zyn.app.zynerator.specification.AbstractSpecification;


public class ProductSpecification extends  AbstractSpecification<ProductCriteria, Product>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("label", criteria.getLabel(),criteria.getLabelLike());
        addPredicateBigDecimal("price", criteria.getPrice(), criteria.getPriceMin(), criteria.getPriceMax());
        addPredicateInt("stock", criteria.getStock(), criteria.getStockMin(), criteria.getStockMax());
        addPredicate("imageUrl", criteria.getImageUrl(),criteria.getImageUrlLike());
    }

    public ProductSpecification(ProductCriteria criteria) {
        super(criteria);
    }

    public ProductSpecification(ProductCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
