import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "../model/user";
import {Observable} from "rxjs";
import {Item} from "../model/item";

@Injectable({
  providedIn: 'root'
})
export class ItemServiceService {

  private itemsUrl: string;

  constructor(private http: HttpClient) {
    this.itemsUrl = 'http://localhost:8080/users';
  }

  public findAll() {
    return this.http.get<User[]>("http://localhost:8080/items/all");
  }

  public save(item: Item) {
    return this.http.post(`${this.itemsUrl}/add`, item);
  }

  public delete(id: number): Observable<any> {
    return this.http.delete(`${this.itemsUrl}/${id}`, { responseType: 'text' });
  }

  private convertToUrl
}
