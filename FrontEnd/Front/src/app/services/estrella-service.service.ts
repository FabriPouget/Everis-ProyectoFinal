import { Injectable } from '@angular/core';
import {EstrellaInterface} from '../interfaces/estrella-interface';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EstrellaServiceService {

  url = 'http://localhost:8080/api/v1/estrellas';

  constructor(private http: HttpClient) { }

  ListarEstrella() {
    return this.http.get<EstrellaInterface[]>(this.url + '/');
  }

  estrellaxID(id: number) {
    return this.http.get<EstrellaInterface>(this.url + '/' + id);
  }

  CrearEstrella(estrella: EstrellaInterface) {
    return this.http.post<EstrellaInterface>(this.url + '', estrella);
  }

  EditarEstrella(estrella: EstrellaInterface) {
    return this.http.put<EstrellaInterface>(this.url + '/' + estrella.id, estrella);
  }

  EliminarEstrella(estrella: EstrellaInterface) {
    return this.http.delete<EstrellaInterface>(this.url + '/' + estrella.id);
  }
}
