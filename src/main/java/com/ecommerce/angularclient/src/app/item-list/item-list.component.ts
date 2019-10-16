import { Component, OnInit } from '@angular/core';
import {User} from "../model/user";
import {Item} from "../model/item";
import {log} from "util";
import {ItemService} from "../service/item.service";
import {DomSanitizer} from "@angular/platform-browser";

@Component({
  selector: 'app-item-list',
  templateUrl: './item-list.component.html',
  styleUrls: ['./item-list.component.css']
})
export class ItemListComponent implements OnInit {

  items: Item[];
  selectedItem:Item;
  selectedRow:Number;
  setClickedRow : Function;

  constructor(public itemService:ItemService, public sanitizer: DomSanitizer) {
  }

  ngOnInit() {
    this.items = [];
    var self = this;
    this.itemService.findAll().subscribe((data : Item[]) => data.forEach(function(data) {
      var imageUrl = 'data:image/jpeg;base64,' + data.image;
      data.imageUrl = self.sanitizer.bypassSecurityTrustUrl(imageUrl);
      self.items.push(data);
    }));

    this.setClickedRow = function(index){
      self.selectedRow = index;
    }
  }

  select(item: Item) {
    this.selectedItem = item
    log("user selected: " + item.id)
  }

}
