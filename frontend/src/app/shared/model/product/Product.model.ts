
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class ProductDto extends BaseDto{

    public code: string;

    public label: string;

    public description: string;

    public price: null | number;

    public stock: null | number;

    public imageUrl: string;



    constructor() {
        super();

        this.code = '';
        this.label = '';
        this.description = '';
        this.price = null;
        this.stock = null;
        this.imageUrl = '';

        }

}
