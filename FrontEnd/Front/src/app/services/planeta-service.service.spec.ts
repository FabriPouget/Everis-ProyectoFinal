import { TestBed } from '@angular/core/testing';

import { PlanetaServiceService } from './planeta-service.service';

describe('PlanetaServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: PlanetaServiceService = TestBed.get(PlanetaServiceService);
    expect(service).toBeTruthy();
  });
});
