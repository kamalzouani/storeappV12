package  ma.zyn.app.dao.criteria.core.product;



import ma.zyn.app.zynerator.criteria.BaseCriteria;

import java.util.List;

public class ProductCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private String label;
    private String labelLike;
    private String description;
    private String descriptionLike;
    private String price;
    private String priceMin;
    private String priceMax;
    private String stock;
    private String stockMin;
    private String stockMax;
    private String imageUrl;
    private String imageUrlLike;



    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getLabel(){
        return this.label;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public String getLabelLike(){
        return this.labelLike;
    }
    public void setLabelLike(String labelLike){
        this.labelLike = labelLike;
    }

    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescriptionLike(){
        return this.descriptionLike;
    }
    public void setDescriptionLike(String descriptionLike){
        this.descriptionLike = descriptionLike;
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
      
    public String getStock(){
        return this.stock;
    }
    public void setStock(String stock){
        this.stock = stock;
    }   
    public String getStockMin(){
        return this.stockMin;
    }
    public void setStockMin(String stockMin){
        this.stockMin = stockMin;
    }
    public String getStockMax(){
        return this.stockMax;
    }
    public void setStockMax(String stockMax){
        this.stockMax = stockMax;
    }
      
    public String getImageUrl(){
        return this.imageUrl;
    }
    public void setImageUrl(String imageUrl){
        this.imageUrl = imageUrl;
    }
    public String getImageUrlLike(){
        return this.imageUrlLike;
    }
    public void setImageUrlLike(String imageUrlLike){
        this.imageUrlLike = imageUrlLike;
    }


}
