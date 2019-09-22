import { Component, OnInit } from '@angular/core';
import {NavbarService} from '../../services/navbar.service';
import {NgbActiveModal, NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {PlanetaInterface} from '../../interfaces/planeta-interface';
import {EstrellaInterface} from '../../interfaces/estrella-interface';
import {EstrellaServiceService} from '../../services/estrella-service.service';
import {PlanetaServiceService} from '../../services/planeta-service.service';

@Component({
  selector: 'app-modal',
  templateUrl: './modal.component.html',
  styleUrls: ['./modal.component.css']
})
export class ModalComponent implements OnInit {

  private resultado: string;
  private key: string;
  private id: any;
  private planeta: PlanetaInterface;
  private EdPlaneta: PlanetaInterface;
  private EdEstrella: EstrellaInterface;
  private estrella: EstrellaInterface;
  private estrellas: EstrellaInterface[];

  constructor(private nav: NavbarService, public activeModal: NgbActiveModal, private estrellaService: EstrellaServiceService,
              private planetaService: PlanetaServiceService) {
    this.nav.getClave().subscribe(data => {
      this.resultado = data;
    });

    // @ts-ignore
    this.planeta = {};
    // @ts-ignore
    this.estrella = {};
    // @ts-ignore
    this.EdPlaneta = {};
    // @ts-ignore
    this.EdEstrella = {};
  }


  ngOnInit() {

    this.estrellaService.ListarEstrella().subscribe(data => {
      this.estrellas = data;
    });

    this.key = localStorage.getItem('modal');
    if (localStorage.getItem('id') !== null && this.key === 'planetEdit') {
      this.Editar();
    } else if (localStorage.getItem('id') !== null && this.key === 'starEdit') {
      this.Editar2();
    }
  }

  Editar() {
    this.id = localStorage.getItem('id');
    this.planetaService.PlanetaxID(this.id).subscribe(data => {
      this.EdPlaneta = data;
    });
  }

  Editar2() {
    this.id = localStorage.getItem('id');
    this.estrellaService.estrellaxID(this.id).subscribe(data => {
      this.EdEstrella = data;
    });
  }

  Submit() {
    if (this.key === 'starEdit' && this.resultado === 'estrella') {
      this.estrellaService.EditarEstrella(this.EdEstrella).subscribe(data => {
        this.EdEstrella = data;
        alert('Estrella Modificada con Exito!');
        this.activeModal.close();
      });

    } else if (this.key === 'planetEdit' && this.resultado === 'planeta') {
      this.planetaService.EditarPlaneta(this.EdPlaneta).subscribe(data => {
        this.EdPlaneta = data;
        alert('Planeta Modificado con Exito!');
        this.activeModal.close();
      });

    } else if (this.resultado === 'estrella' && this.key !== 'starEdit') {
      this.estrellaService.CrearEstrella(this.estrella).subscribe(data => {
        alert('Estrella Creada con Exito!');
        this.activeModal.close();
      });

    } else if (this.resultado === 'planeta' && this.key !== 'planetEdit') {
      this.planetaService.CrearPlaneta(this.planeta).subscribe( data => {
        alert('Planeta Creado con Exito!');
        this.activeModal.close();
      });
    }
  }
}
