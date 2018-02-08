import { TestBed, inject } from '@angular/core/testing';

import { AdderService } from './adder.service';

describe('AdderService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [AdderService]
    });
  });

  it('should be created', inject([AdderService], (service: AdderService) => {
    expect(service).toBeTruthy();
  }));
});
