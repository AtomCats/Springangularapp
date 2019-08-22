import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from '../model/user';
import {Observable} from "rxjs";

@Injectable()
export class UserService {

  private usersUrl: string;

  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/users';
  }

  public findAll() {
    return this.http.get<User[]>("http://localhost:8080/users/all");
  }

  public save(user: User) {
    return this.http.post(`${this.usersUrl}/add`, user);
  }

  public delete(id: number): Observable<any> {
    return this.http.delete(`${this.usersUrl}/${id}`, { responseType: 'text' });
  }
}
