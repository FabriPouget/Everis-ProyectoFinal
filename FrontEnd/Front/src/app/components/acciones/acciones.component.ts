import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-acciones',
  templateUrl: './acciones.component.html',
  styleUrls: ['./acciones.component.css']
})
export class AccionesComponent implements OnInit {

  private resultado: string;

  constructor(private route: ActivatedRoute) {
    this.resultado = route.snapshot.url[0].path;
  }

  ngOnInit() {
  }

}
