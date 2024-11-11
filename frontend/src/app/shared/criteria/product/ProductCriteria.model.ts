
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';

export class ProductCriteria extends BaseCriteria {

    public id: number;
    public code: string;
    public codeLike: string;
    public label: string;
    public labelLike: string;
    public description: string;
    public descriptionLike: string;
     public price: number;
     public priceMin: number;
     public priceMax: number;
     public stock: number;
     public stockMin: number;
     public stockMax: number;
    public imageUrl: string;
    public imageUrlLike: string;

}
