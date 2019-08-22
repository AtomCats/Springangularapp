import { Component, OnInit } from '@angular/core';
import {User} from "../model/user";
import {UserService} from "../service/user-service.service";
import {Observable} from "rxjs";
import {log} from "util";

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  users: User[];
  selectedUser:User;
  selectedRow:Number;
  setClickedRow : Function;

  constructor(private  userService:UserService) {
  }

  ngOnInit() {
    // this.userService.findAll().subscribe((data: User[]) => this.users = {...data });
    this.userService.findAll().subscribe(data => this.users = data);
    this.setClickedRow = function(index){
      this.selectedRow = index;
    }
  }

  select(user: User) {
    this.selectedUser = user
    log("user selected: " + user.id)
  }
}
