export * from './accounts.service';
import { AccountsService } from './accounts.service';
export * from './customer.service';
import { CustomerService } from './customer.service';
export * from './directDebits.service';
import { DirectDebitsService } from './directDebits.service';
export * from './payees.service';
import { PayeesService } from './payees.service';
export * from './products.service';
import { ProductsService } from './products.service';
export const APIS = [AccountsService, CustomerService, DirectDebitsService, PayeesService, ProductsService];
