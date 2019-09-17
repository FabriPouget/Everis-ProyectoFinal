import { TestBed } from '@angular/core/testing';

import { EstrellaServiceService } from './estrella-service.service';

describe('EstrellaServiceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EstrellaServiceService = TestBed.get(EstrellaServiceService);
    expect(service).toBeTruthy();
  });
});
