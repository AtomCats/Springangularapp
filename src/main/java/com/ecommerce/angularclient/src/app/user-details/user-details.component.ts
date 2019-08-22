import {Component, Input, OnInit} from '@angular/core';
import {User} from "../model/user";
import {UserService} from "../service/user-service.service";
import {UserListComponent} from "../user-list/user-list.component";

@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {

  @Input() user:User;

  constructor(private userService:UserService, private userList:UserListComponent) { }

  ngOnInit() {
  }

  deleteUser(id: number) {
    this.userService.delete(id);
  }

}
