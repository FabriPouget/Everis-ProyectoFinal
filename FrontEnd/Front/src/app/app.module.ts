import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SharedComponent } from './components/shared/shared.component';
import { NavbarComponent } from './components/shared/navbar/navbar.component';
import { HomeComponent } from './components/home/home.component';
import { CrudPlanetaComponent } from './components/crud-planeta/crud-planeta.component';
import { CrudEstrellaComponent } from './components/crud-estrella/crud-estrella.component';
import { ActionsComponent } from './components/actions/actions.component';
import { AccionesComponent } from './components/acciones/acciones.component';

@NgModule({
  declarations: [
    AppComponent,
    SharedComponent,
    NavbarComponent,
    HomeComponent,
    CrudPlanetaComponent,
    CrudEstrellaComponent,
    ActionsComponent,
    AccionesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
