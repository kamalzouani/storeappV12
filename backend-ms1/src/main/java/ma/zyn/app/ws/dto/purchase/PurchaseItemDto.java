package  ma.zyn.app.ws.dto.purchase;

import ma.zyn.app.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


import ma.zyn.app.ws.dto.product.ProductDto;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class PurchaseItemDto  extends AuditBaseDto {

    private Integer quantity  = 0 ;
    private BigDecimal price  ;

    private PurchaseDto purchase ;
    private ProductDto product ;



    public PurchaseItemDto(){
        super();
    }




    public Integer getQuantity(){
        return this.quantity;
    }
    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }


    public BigDecimal getPrice(){
        return this.price;
    }
    public void setPrice(BigDecimal price){
        this.price = price;
    }


    public PurchaseDto getPurchase(){
        return this.purchase;
    }

    public void setPurchase(PurchaseDto purchase){
        this.purchase = purchase;
    }
    public ProductDto getProduct(){
        return this.product;
    }

    public void setProduct(ProductDto product){
        this.product = product;
    }






}
