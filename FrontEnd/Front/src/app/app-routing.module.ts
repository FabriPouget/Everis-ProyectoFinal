import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './components/home/home.component';
import {CrudComponent} from './components/crud/crud.component';
import {ModalComponent} from './components/modal/modal.component';


const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'crud', component: CrudComponent},
  {path: 'modal', component: ModalComponent},

  {path: '**', redirectTo: 'home', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
