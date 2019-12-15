import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "../model/user";
import {Observable, Subscription} from "rxjs";
import {Item} from "../model/item";
import {DomSanitizer, SafeUrl} from "@angular/platform-browser";

@Injectable({
  providedIn: 'root'
})
export class ItemService {

  private itemsUrl: string;

  constructor(private http: HttpClient) {
    this.itemsUrl = 'http://localhost:8080/items';
  }

  public findAll() {
    return this.http.get<Item[]>("http://localhost:8080/items/all");
  }

  public save(item: Item) {
    return this.http.post(`${this.itemsUrl}/add`, item);
  }

  public delete(id: number): Observable<any> {
    return this.http.delete(`${this.itemsUrl}/${id}`, { responseType: 'text' });
  }
}
