import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {PlanetaServiceService} from '../../services/planeta-service.service';
import {EstrellaServiceService} from '../../services/estrella-service.service';
import {PlanetaInterface} from '../../interfaces/planeta-interface';
import {EstrellaInterface} from '../../interfaces/estrella-interface';
import {NavbarService} from '../../services/navbar.service';

@Component({
  selector: 'app-crud',
  templateUrl: './crud.component.html',
  styles: []
})
export class CrudComponent implements OnInit {

  private resultado: string;
  private planetas: PlanetaInterface [];
  private estrellas: EstrellaInterface [];

  constructor(private route: ActivatedRoute, private planetaService: PlanetaServiceService, private estrellaService: EstrellaServiceService,
              private router: Router, private nav: NavbarService) {
  }

  ngOnInit() {
    this.nav.getClave().subscribe(data => {this.resultado = data; });

    if (this.resultado === 'planeta') {
      this.planetaService.ListarPlanetas().subscribe(data => {
        this.planetas = data;
      });
    } else if (this.resultado === 'estrella') {
      this.estrellaService.ListarEstrella().subscribe(data => {
        this.estrellas = data;
      });
    }
  }

  Nuevo() {
    this.router.navigate(['modal']);
  }

  Editar(planeta: PlanetaInterface) {
    localStorage.setItem('id', planeta.id.toString());
    this.router.navigate(['modal']);
  }

  Eliminar(planeta: PlanetaInterface) {
    this.planetaService.EliminarPlaneta(planeta)
      .subscribe(data =>
        this.planetas = this.planetas.filter(p => p !== planeta));
    alert('Planeta eliminado exitosamente');
  }

  Editar2(estrella: EstrellaInterface) {
    localStorage.setItem('id', estrella.id.toString());
    this.router.navigate(['modal']);
  }

  Eliminar2(estrella: EstrellaInterface) {
    this.estrellaService.EliminarEstrella(estrella)
      .subscribe(data =>
        this.estrellas = this.estrellas.filter(p => p !== estrella));
    alert('Estrella eliminada exitosamente');
  }

}
