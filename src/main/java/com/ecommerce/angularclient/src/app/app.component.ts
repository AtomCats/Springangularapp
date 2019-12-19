import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angularclient';
  acc: HTMLElement;

  constructor() {
    this.title = 'Admin tool';
  }

  openNav() {
    document.getElementById('sidenav').style.width = '250px';
    document.getElementById('main').style.marginLeft = '250px';
  }

  closeNav() {
    document.getElementById('sidenav').style.width = '0';
    document.getElementById('main').style.marginLeft = '0';
  }
  openFilter() {
    document.getElementById('sidefilter').style.width = '250px';
  }

  closeFilter() {
    document.getElementById('sidefilter').style.width = '0';
  }

  collapse(classname: string) {
    this.acc = document.getElementById(classname);
    if (this.acc.style.display === 'block') {
      this.acc.style.display = 'none';
    } else {
      this.acc.style.display = 'block';
    }
  }


}
