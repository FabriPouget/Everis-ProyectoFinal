import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CrudPlanetaComponent } from './crud-planeta.component';

describe('CrudPlanetaComponent', () => {
  let component: CrudPlanetaComponent;
  let fixture: ComponentFixture<CrudPlanetaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CrudPlanetaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CrudPlanetaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
