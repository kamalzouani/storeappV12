import {Component, OnInit} from '@angular/core';


import {DatePipe} from '@angular/common';
import {Router} from '@angular/router';
import {Inject, Injectable, PLATFORM_ID} from '@angular/core';


import {environment} from 'src/environments/environment';

import {RoleService} from 'src/app/zynerator/security/shared/service/Role.service';
import {AbstractService} from 'src/app/zynerator/service/AbstractService';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';
import {StringUtilService} from 'src/app/zynerator/util/StringUtil.service';
import {ServiceLocator} from 'src/app/zynerator/service/ServiceLocator';
import {ConfirmationService, MessageService,MenuItem} from 'primeng/api';
import {FileTempDto} from 'src/app/zynerator/dto/FileTempDto.model';


import {PurchaseAdminService} from 'src/app/shared/service/admin/purchase/PurchaseAdmin.service';
import {PurchaseDto} from 'src/app/shared/model/purchase/Purchase.model';
import {PurchaseCriteria} from 'src/app/shared/criteria/purchase/PurchaseCriteria.model';

import {ProductDto} from 'src/app/shared/model/product/Product.model';
import {ProductAdminService} from 'src/app/shared/service/admin/product/ProductAdmin.service';
import {PurchaseItemDto} from 'src/app/shared/model/purchase/PurchaseItem.model';
import {PurchaseItemAdminService} from 'src/app/shared/service/admin/purchase/PurchaseItemAdmin.service';
@Component({
  selector: 'app-purchase-view-admin',
  templateUrl: './purchase-view-admin.component.html'
})
export class PurchaseViewAdminComponent implements OnInit {


	protected _submitted = false;
    protected _errorMessages = new Array<string>();

    protected datePipe: DatePipe;
    protected messageService: MessageService;
    protected confirmationService: ConfirmationService;
    protected roleService: RoleService;
    protected router: Router;
    protected stringUtilService: StringUtilService;


    purchaseItems = new PurchaseItemDto();
    purchaseItemss: Array<PurchaseItemDto> = [];

    constructor(private service: PurchaseAdminService, private productService: ProductAdminService, private purchaseItemService: PurchaseItemAdminService){
		this.datePipe = ServiceLocator.injector.get(DatePipe);
        this.messageService = ServiceLocator.injector.get(MessageService);
        this.confirmationService = ServiceLocator.injector.get(ConfirmationService);
        this.roleService = ServiceLocator.injector.get(RoleService);
        this.router = ServiceLocator.injector.get(Router);
        this.stringUtilService = ServiceLocator.injector.get(StringUtilService);
	}

    ngOnInit(): void {
    }


    get product(): ProductDto {
        return this.productService.item;
    }
    set product(value: ProductDto) {
        this.productService.item = value;
    }
    get products(): Array<ProductDto> {
        return this.productService.items;
    }
    set products(value: Array<ProductDto>) {
        this.productService.items = value;
    }

    public hideViewDialog() {
        this.viewDialog = false;
    }

    get items(): Array<PurchaseDto> {
        return this.service.items;
    }

    set items(value: Array<PurchaseDto>) {
        this.service.items = value;
    }

    get item(): PurchaseDto {
        return this.service.item;
    }

    set item(value: PurchaseDto) {
        this.service.item = value;
    }

    get viewDialog(): boolean {
        return this.service.viewDialog;
    }

    set viewDialog(value: boolean) {
        this.service.viewDialog = value;
    }

    get criteria(): PurchaseCriteria {
        return this.service.criteria;
    }

    set criteria(value: PurchaseCriteria) {
        this.service.criteria = value;
    }

    get dateFormat(){
        return environment.dateFormatView;
    }

    get dateFormatColumn(){
        return environment.dateFormatList;
    }


}
