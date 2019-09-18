import { Injectable } from '@angular/core';
import {BehaviorSubject, Observable, Subject} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class NavbarService {

  private clave = new BehaviorSubject<string>('home');

  constructor() { }

  setClave(cod: string) {
    this.clave.next(cod);
  }

  getClave(): Observable<string> {
    return this.clave.asObservable();
  }
}
