package  ma.zyn.app.ws.converter.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.BeanUtils;
import ma.zyn.app.zynerator.converter.AbstractConverterHelper;

import java.util.ArrayList;
import java.util.List;

import ma.zyn.app.ws.converter.purchase.PurchaseConverter;
import ma.zyn.app.bean.core.purchase.Purchase;
import ma.zyn.app.ws.converter.product.ProductConverter;
import ma.zyn.app.bean.core.product.Product;

import ma.zyn.app.bean.core.purchase.Purchase;


import ma.zyn.app.zynerator.util.StringUtil;
import ma.zyn.app.zynerator.converter.AbstractConverter;
import ma.zyn.app.zynerator.util.DateUtil;
import ma.zyn.app.bean.core.purchase.PurchaseItem;
import ma.zyn.app.ws.dto.purchase.PurchaseItemDto;

@Component
public class PurchaseItemConverter {

    @Autowired
    private PurchaseConverter purchaseConverter ;
    @Autowired
    private ProductConverter productConverter ;
    private boolean purchase;
    private boolean product;

    public  PurchaseItemConverter() {
        initObject(true);
    }

    public PurchaseItem toItem(PurchaseItemDto dto) {
        if (dto == null) {
            return null;
        } else {
        PurchaseItem item = new PurchaseItem();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getQuantity()))
                item.setQuantity(dto.getQuantity());
            if(StringUtil.isNotEmpty(dto.getPrice()))
                item.setPrice(dto.getPrice());
            if(dto.getPurchase() != null && dto.getPurchase().getId() != null){
                item.setPurchase(new Purchase());
                item.getPurchase().setId(dto.getPurchase().getId());
                item.getPurchase().setId(dto.getPurchase().getId());
            }

            if(this.product && dto.getProduct()!=null)
                item.setProduct(productConverter.toItem(dto.getProduct())) ;




        return item;
        }
    }


    public PurchaseItemDto toDto(PurchaseItem item) {
        if (item == null) {
            return null;
        } else {
            PurchaseItemDto dto = new PurchaseItemDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getQuantity()))
                dto.setQuantity(item.getQuantity());
            if(StringUtil.isNotEmpty(item.getPrice()))
                dto.setPrice(item.getPrice());
            if(this.purchase && item.getPurchase()!=null) {
                dto.setPurchase(purchaseConverter.toDto(item.getPurchase())) ;

            }
            if(this.product && item.getProduct()!=null) {
                dto.setProduct(productConverter.toDto(item.getProduct())) ;

            }


        return dto;
        }
    }

    public void init(boolean value) {
        initObject(value);
    }

    public void initObject(boolean value) {
        this.purchase = value;
        this.product = value;
    }
	
    public List<PurchaseItem> toItem(List<PurchaseItemDto> dtos) {
        List<PurchaseItem> items = new ArrayList<>();
        if (dtos != null && !dtos.isEmpty()) {
            for (PurchaseItemDto dto : dtos) {
                items.add(toItem(dto));
            }
        }
        return items;
    }


    public List<PurchaseItemDto> toDto(List<PurchaseItem> items) {
        List<PurchaseItemDto> dtos = new ArrayList<>();
        if (items != null && !items.isEmpty()) {
            for (PurchaseItem item : items) {
                dtos.add(toDto(item));
            }
        }
        return dtos;
    }


    public void copy(PurchaseItemDto dto, PurchaseItem t) {
		BeanUtils.copyProperties(dto, t, AbstractConverterHelper.getNullPropertyNames(dto));
        if(t.getPurchase() == null  && dto.getPurchase() != null){
            t.setPurchase(new Purchase());
        }else if (t.getPurchase() != null  && dto.getPurchase() != null){
            t.setPurchase(null);
            t.setPurchase(new Purchase());
        }
        if(t.getProduct() == null  && dto.getProduct() != null){
            t.setProduct(new Product());
        }else if (t.getProduct() != null  && dto.getProduct() != null){
            t.setProduct(null);
            t.setProduct(new Product());
        }
        if (dto.getPurchase() != null)
        purchaseConverter.copy(dto.getPurchase(), t.getPurchase());
        if (dto.getProduct() != null)
        productConverter.copy(dto.getProduct(), t.getProduct());
    }

    public List<PurchaseItem> copy(List<PurchaseItemDto> dtos) {
        List<PurchaseItem> result = new ArrayList<>();
        if (dtos != null) {
            for (PurchaseItemDto dto : dtos) {
                PurchaseItem instance = new PurchaseItem();
                copy(dto, instance);
                result.add(instance);
            }
        }
        return result.isEmpty() ? null : result;
    }


    public PurchaseConverter getPurchaseConverter(){
        return this.purchaseConverter;
    }
    public void setPurchaseConverter(PurchaseConverter purchaseConverter ){
        this.purchaseConverter = purchaseConverter;
    }
    public ProductConverter getProductConverter(){
        return this.productConverter;
    }
    public void setProductConverter(ProductConverter productConverter ){
        this.productConverter = productConverter;
    }
    public boolean  isPurchase(){
        return this.purchase;
    }
    public void  setPurchase(boolean purchase){
        this.purchase = purchase;
    }
    public boolean  isProduct(){
        return this.product;
    }
    public void  setProduct(boolean product){
        this.product = product;
    }
}
