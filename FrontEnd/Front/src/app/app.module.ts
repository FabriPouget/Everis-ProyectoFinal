import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './components/shared/navbar/navbar.component';
import { HomeComponent } from './components/home/home.component';
import { ModalComponent } from './components/modal/modal.component';
import { FooterComponent } from './components/shared/footer/footer.component';

import {EstrellaServiceService} from './services/estrella-service.service';
import {PlanetaServiceService} from './services/planeta-service.service';
import { CrudComponent } from './components/crud/crud.component';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {NavbarService} from './services/navbar.service';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    ModalComponent,
    FooterComponent,
    CrudComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    NgbModule
  ],
  providers: [
    EstrellaServiceService,
    PlanetaServiceService,
    NavbarService,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
