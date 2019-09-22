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
    this.nav.getClave().subscribe(data => {
      this.resultado = data;
    });

    this.planetaService.ListarPlanetas().subscribe(data => {
        this.planetas = data;
      });

    this.estrellaService.ListarEstrella().subscribe(data => {
        this.estrellas = data;
      });

  }

Nuevo() {
    localStorage.clear();
    const modalRef = this.modalService.open(ModalComponent);
    modalRef.componentInstance.title = 'New';
  }

Acciones(object, tipo): void {
    const bid: string = (tipo.target as Element).id;

    switch (bid) {
      case 'starEdit':
        localStorage.setItem('modal', bid);
        localStorage.setItem('id', object.id.toString());
        const modalE = this.modalService.open(ModalComponent);
        modalE.componentInstance.title = 'starEdit';
        break;

      case 'planetEdit':
        localStorage.setItem('modal', bid);
        localStorage.setItem('id', object.id.toString());
        const modalP = this.modalService.open(ModalComponent);
        modalP.componentInstance.title = 'planetEdit';
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
}
