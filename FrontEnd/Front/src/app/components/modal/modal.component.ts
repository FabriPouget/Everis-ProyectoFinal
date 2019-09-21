import { Component, OnInit } from '@angular/core';
import {NavbarService} from '../../services/navbar.service';
import {NgbActiveModal, NgbModal} from '@ng-bootstrap/ng-bootstrap';

@Component({
  selector: 'app-modal',
  templateUrl: './modal.component.html',
  styleUrls: ['./modal.component.css']
})
export class ModalComponent implements OnInit {

  private resultado: string;

  constructor(private nav: NavbarService, public activeModal: NgbActiveModal) {
    this.nav.getClave().subscribe(data => {
      this.resultado = data;
    });
  }


  ngOnInit() {
  }
}
