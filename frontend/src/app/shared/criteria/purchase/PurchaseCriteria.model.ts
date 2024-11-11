import {PurchaseItemCriteria} from './PurchaseItemCriteria.model';

import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';

export class PurchaseCriteria extends BaseCriteria {

    public id: number;
    public purchaseDate: Date;
    public purchaseDateFrom: Date;
    public purchaseDateTo: Date;
      public purchaseItems: Array<PurchaseItemCriteria>;

}
