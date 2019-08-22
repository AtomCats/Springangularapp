import { Component, OnInit } from '@angular/core';
import {User} from "../model/user";
import {UserService} from "../service/user-service.service";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent {

  user:User;

  constructor(private route: ActivatedRoute, private router: Router, private userService: UserService) { }

  onSubmit() {
    this.userService.save(this.user).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate(['/users']);
  }

}
