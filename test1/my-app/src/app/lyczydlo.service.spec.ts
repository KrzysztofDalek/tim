import { TestBed, inject } from '@angular/core/testing';

import { LyczydloService } from './lyczydlo.service';

describe('LyczydloService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [LyczydloService]
    });
  });

  it('should be created', inject([LyczydloService], (service: LyczydloService) => {
    expect(service).toBeTruthy();
  }));
});
