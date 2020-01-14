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
    document.getElementsByClassName('container').item(0).setAttribute('style', 'margin-left:250px');
    document.getElementsByClassName('opensidenav').item(0).setAttribute('style', 'display:none');
  }
  closeNav() {
    document.getElementById('sidenav').style.width = '0';
    document.getElementById('main').style.marginLeft = '0';
    document.getElementsByClassName('container').item(0).setAttribute('style', 'margin-left:0px');
    document.getElementsByClassName('opensidenav').item(0).setAttribute('style', 'display:block');
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
