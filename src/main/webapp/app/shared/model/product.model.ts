import dayjs from 'dayjs';
import { ProductCategory } from 'app/shared/model/enumerations/product-category.model';

export interface IProduct {
  id?: number;
  name?: string;
  description?: string | null;
  producer?: string;
  exporter?: string | null;
  expirationDate?: string;
  category?: ProductCategory;
}

export const defaultValue: Readonly<IProduct> = {};
