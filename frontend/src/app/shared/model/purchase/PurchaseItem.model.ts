import {PurchaseDto} from './Purchase.model';
import {ProductDto} from '../product/Product.model';

import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class PurchaseItemDto extends BaseDto{

    public quantity: null | number;

    public price: null | number;

    public purchase: PurchaseDto ;
    public product: ProductDto ;


    constructor() {
        super();

        this.quantity = null;
        this.price = null;
        this.product = new ProductDto() ;

        }

}
