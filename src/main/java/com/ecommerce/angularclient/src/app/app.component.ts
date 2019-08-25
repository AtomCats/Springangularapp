import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angularclient';

  constructor() {
    this.title = 'Admin tool';
  }

  openNav() {
    document.getElementById("sidenav").style.width = "250px";
    document.getElementById("main").style.marginLeft = "250px";
  }

  closeNav(){
    document.getElementById("sidenav").style.width = "0";
    document.getElementById("main").style.marginLeft = "0";
  }
}
