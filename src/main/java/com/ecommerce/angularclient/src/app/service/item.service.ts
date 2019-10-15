import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "../model/user";
import {Observable, Subscription} from "rxjs";
import {Item} from "../model/item";

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  private itemsUrl: string;

  constructor(private http: HttpClient) {
    this.itemsUrl = 'http://localhost:8080/items';
  }

  public findAll() : Item[] {
    var items
    this.http.get<Item[]>("http://localhost:8080/items/all").subscribe(data => data.forEach(function (value) {
      var uints = new Uint8Array(value.imageSrc);
      var base64 = btoa(String.fromCharCode.apply(null, uints));
      value.imageUrl = 'data:image/jpeg;base64,' + base64;
      items.add(value)
    }))
    return items
  }

  public save(item: Item) {
    return this.http.post(`${this.itemsUrl}/add`, item);
  }

  public delete(id: number): Observable<any> {
    return this.http.delete(`${this.itemsUrl}/${id}`, { responseType: 'text' });
  }

  private convertToUrl
}
