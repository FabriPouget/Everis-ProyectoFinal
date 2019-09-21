import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {PlanetaServiceService} from '../../services/planeta-service.service';
import {EstrellaServiceService} from '../../services/estrella-service.service';
import {PlanetaInterface} from '../../interfaces/planeta-interface';
import {EstrellaInterface} from '../../interfaces/estrella-interface';
import {NavbarService} from '../../services/navbar.service';
import {NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {ModalComponent} from '../modal/modal.component';

@Component({
  selector: 'app-crud',
  templateUrl: './crud.component.html',
  styles: []
})
export class CrudComponent implements OnInit {

  private resultado: string;
  private planetas: PlanetaInterface [];
  private estrellas: EstrellaInterface [];

  constructor(private planetaService: PlanetaServiceService, private estrellaService: EstrellaServiceService,
              private router: Router, private nav: NavbarService, private modalService: NgbModal) {
  }

  ngOnInit() {
    this.resultado = localStorage.getItem('clave');

    this.nav.getClave().subscribe(data => {
      this.resultado = data;
      localStorage.setItem('clave', this.resultado);
    });

    this.planetaService.ListarPlanetas().subscribe(data => {
      this.planetas = data;
    });

  }

Nuevo() {
    const modalRef = this.modalService.open(ModalComponent);
    modalRef.componentInstance.title = 'About';
  }

Acciones(object, tipo): void {
    const bid: string = (tipo.target as Element).id;

    switch (bid) {
      case 'starEdit':
        localStorage.setItem('id', object.id.toString());
        break;

      case 'planetEdit':
        localStorage.setItem('id', object.id.toString());
        break;

      case 'starDelete':
        this.estrellaService.EliminarEstrella(object).subscribe(data =>
            this.estrellas = this.estrellas.filter(p => p !== object));
        alert('Estrella eliminada exitosamente');
        break;

      case 'planetDelete':
        this.planetaService.EliminarPlaneta(object).subscribe(data =>
          this.planetas = this.planetas.filter(p => p !== object));
        alert('Planeta eliminado exitosamente');
        break;
    }
  }
/*
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
*/
}
