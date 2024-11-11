import {PurchaseItemDto} from './PurchaseItem.model';

import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class PurchaseDto extends BaseDto{

   public purchaseDate: Date;

     public purchaseItems: Array<PurchaseItemDto>;


    constructor() {
        super();

        this.purchaseDate = null;
        this.purchaseItems = new Array<PurchaseItemDto>();

        }

}
