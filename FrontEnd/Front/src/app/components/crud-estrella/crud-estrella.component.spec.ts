import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CrudEstrellaComponent } from './crud-estrella.component';

describe('CrudEstrellaComponent', () => {
  let component: CrudEstrellaComponent;
  let fixture: ComponentFixture<CrudEstrellaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CrudEstrellaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CrudEstrellaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
