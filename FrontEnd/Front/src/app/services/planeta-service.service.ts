import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {PlanetaInterface} from '../interfaces/planeta-interface';

@Injectable({
  providedIn: 'root'
})
export class PlanetaServiceService {
  url = 'http://localhost:8080/api/v1/planetas';

  constructor(private http: HttpClient) { }

  ListarPlanetas() {
    return this.http.get<PlanetaInterface[]>(this.url + '/');
  }

  PlanetaxID(id: number) {
    return this.http.get<PlanetaInterface>(this.url + '/' + id);
  }

  CrearPlaneta(planeta: PlanetaInterface) {
    return this.http.post<PlanetaInterface>(this.url + '', planeta);
  }

  EditarPlaneta(planeta: PlanetaInterface) {
    return this.http.put<PlanetaInterface>(this.url + '/' + planeta.id, planeta);
  }

  EliminarPlaneta(planeta: PlanetaInterface) {
    return this.http.delete<PlanetaInterface>(this.url + '/' + planeta.id);
  }
}
