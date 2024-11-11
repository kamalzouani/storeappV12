package  ma.zyn.app.dao.criteria.core.purchase;



import ma.zyn.app.zynerator.criteria.BaseCriteria;

import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class PurchaseCriteria extends  BaseCriteria  {

    private LocalDateTime purchaseDate;
    private LocalDateTime purchaseDateFrom;
    private LocalDateTime purchaseDateTo;



    public LocalDateTime getPurchaseDate(){
        return this.purchaseDate;
    }
    public void setPurchaseDate(LocalDateTime purchaseDate){
        this.purchaseDate = purchaseDate;
    }
    public LocalDateTime getPurchaseDateFrom(){
        return this.purchaseDateFrom;
    }
    public void setPurchaseDateFrom(LocalDateTime purchaseDateFrom){
        this.purchaseDateFrom = purchaseDateFrom;
    }
    public LocalDateTime getPurchaseDateTo(){
        return this.purchaseDateTo;
    }
    public void setPurchaseDateTo(LocalDateTime purchaseDateTo){
        this.purchaseDateTo = purchaseDateTo;
    }

}
