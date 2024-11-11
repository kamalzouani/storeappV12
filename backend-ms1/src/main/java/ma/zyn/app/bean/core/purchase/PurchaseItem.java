package ma.zyn.app.bean.core.purchase;






import ma.zyn.app.bean.core.product.Product;


import com.fasterxml.jackson.annotation.JsonInclude;
import ma.zyn.app.zynerator.bean.BaseEntity;
import jakarta.persistence.*;
import java.util.Objects;
import java.math.BigDecimal;

@Entity
@Table(name = "purchase_item")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="purchase_item_seq",sequenceName="purchase_item_seq",allocationSize=1, initialValue = 1)
public class PurchaseItem  extends BaseEntity     {




    private Integer quantity = 0;

    private BigDecimal price = BigDecimal.ZERO;

    private Purchase purchase ;
    private Product product ;


    public PurchaseItem(){
        super();
    }

    public PurchaseItem(Long id){
        this.id = id;
    }





    @Id
    @Column(name = "id")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator="purchase_item_seq")
      @Override
    public Long getId(){
        return this.id;
    }
        @Override
    public void setId(Long id){
        this.id = id;
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "purchase")
    public Purchase getPurchase(){
        return this.purchase;
    }
    public void setPurchase(Purchase purchase){
        this.purchase = purchase;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product")
    public Product getProduct(){
        return this.product;
    }
    public void setProduct(Product product){
        this.product = product;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PurchaseItem purchaseItem = (PurchaseItem) o;
        return id != null && id.equals(purchaseItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

