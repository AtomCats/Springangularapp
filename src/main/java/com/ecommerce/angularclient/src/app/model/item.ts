import {SafeUrl} from "@angular/platform-browser";

export class Item {
  id : number;
  name : string;
  price : number;
  image : number[];
  imageUrl: SafeUrl;
}
