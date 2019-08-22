import { Component, OnInit } from '@angular/core';
import {UserService} from "../service/user-service.service";
import {User} from "../model/user";

@Component({
  selector: 'app-create-user',
  templateUrl: './create-user.component.html',
  styleUrls: ['./create-user.component.css']
})
export class CreateUserComponent implements OnInit {

  user = new User();
  submitted = false;

  constructor(private userService: UserService) { }

  ngOnInit() {
  }

  newUser():void {
    this.submitted = false;
    this.user = new User();
  }

  save(){
    this.userService.save(this.user)
      .subscribe(data => console.log(data), error => console.log(error));
    this.user = new User();
  }

  onSubmit(){
    this.submitted = true;
    this.save();
  }

}
