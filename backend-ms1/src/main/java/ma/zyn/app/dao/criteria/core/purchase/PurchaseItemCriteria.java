package  ma.zyn.app.dao.criteria.core.purchase;


import ma.zyn.app.dao.criteria.core.product.ProductCriteria;

import ma.zyn.app.zynerator.criteria.BaseCriteria;

import java.util.List;

public class PurchaseItemCriteria extends  BaseCriteria  {

    private String quantity;
    private String quantityMin;
    private String quantityMax;
    private String price;
    private String priceMin;
    private String priceMax;

    private PurchaseCriteria purchase ;
    private List<PurchaseCriteria> purchases ;
    private ProductCriteria product ;
    private List<ProductCriteria> products ;


    public String getQuantity(){
        return this.quantity;
    }
    public void setQuantity(String quantity){
        this.quantity = quantity;
    }   
    public String getQuantityMin(){
        return this.quantityMin;
    }
    public void setQuantityMin(String quantityMin){
        this.quantityMin = quantityMin;
    }
    public String getQuantityMax(){
        return this.quantityMax;
    }
    public void setQuantityMax(String quantityMax){
        this.quantityMax = quantityMax;
    }
      
    public String getPrice(){
        return this.price;
    }
    public void setPrice(String price){
        this.price = price;
    }   
    public String getPriceMin(){
        return this.priceMin;
    }
    public void setPriceMin(String priceMin){
        this.priceMin = priceMin;
    }
    public String getPriceMax(){
        return this.priceMax;
    }
    public void setPriceMax(String priceMax){
        this.priceMax = priceMax;
    }
      

    public PurchaseCriteria getPurchase(){
        return this.purchase;
    }

    public void setPurchase(PurchaseCriteria purchase){
        this.purchase = purchase;
    }
    public List<PurchaseCriteria> getPurchases(){
        return this.purchases;
    }

    public void setPurchases(List<PurchaseCriteria> purchases){
        this.purchases = purchases;
    }
    public ProductCriteria getProduct(){
        return this.product;
    }

    public void setProduct(ProductCriteria product){
        this.product = product;
    }
    public List<ProductCriteria> getProducts(){
        return this.products;
    }

    public void setProducts(List<ProductCriteria> products){
        this.products = products;
    }
}
