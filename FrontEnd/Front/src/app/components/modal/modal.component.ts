import { Component, OnInit } from '@angular/core';
import {NavbarService} from '../../services/navbar.service';
import {NgbActiveModal, NgbModal} from '@ng-bootstrap/ng-bootstrap';
import {PlanetaInterface} from '../../interfaces/planeta-interface';
import {EstrellaInterface} from '../../interfaces/estrella-interface';
import {EstrellaServiceService} from '../../services/estrella-service.service';
import {PlanetaServiceService} from '../../services/planeta-service.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-modal',
  templateUrl: './modal.component.html',
  styleUrls: ['./modal.component.css']
})
export class ModalComponent implements OnInit {

  private resultado: string;
  private planeta: PlanetaInterface;
  private estrella: EstrellaInterface;
  private estrellas: EstrellaInterface[];

  constructor(private nav: NavbarService, public activeModal: NgbActiveModal, private estrellaService: EstrellaServiceService,
              private planetaService: PlanetaServiceService) {
    this.nav.getClave().subscribe(data => {
      this.resultado = data;
    });
  }


  ngOnInit() {
    this.estrellaService.ListarEstrella().subscribe(data => {
      this.estrellas = data;
    });
  }

  Submit() {
    if (this.resultado === 'estrella') {
      this.estrellaService.CrearEstrella(this.estrella);
      alert('Estrella Creada con Exito!');
      this.activeModal.close();

    } else if (this.resultado === 'planeta') {
      this.planetaService.CrearPlaneta(this.planeta);
      alert('Planeta Creado con Exito!');
      this.activeModal.close();
    }
  }
}
