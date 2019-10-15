import { Component, OnInit } from '@angular/core';
import {User} from "../model/user";
import {Item} from "../model/item";
import {log} from "util";
import {ItemService} from "../service/item.service";

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

  constructor(private itemService:ItemService) {
  }

  ngOnInit() {
    // this.userService.findAll().subscribe((data: User[]) => this.users = {...data });
    this.items = this.itemService.findAll();
    this.setClickedRow = function(index){
      this.selectedRow = index;
    }
  }

  select(item: Item) {
    this.selectedItem = item
    log("user selected: " + item.id)
  }

}
