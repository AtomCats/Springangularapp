import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {UserListComponent} from './user-list/user-list.component';
import {CreateUserComponent} from "./create-user/create-user.component";
import {AppComponent} from "./app.component";
import {ItemListComponent} from "./item-list/item-list.component";

const routes: Routes = [
  { path: 'users', component: UserListComponent },
  { path: 'adduser', component: CreateUserComponent },
  { path: 'showItems', component: ItemListComponent },
  { path: '', redirectTo: 'showItems', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
