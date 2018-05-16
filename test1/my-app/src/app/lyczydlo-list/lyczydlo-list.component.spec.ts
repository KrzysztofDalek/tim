import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LyczydloListComponent } from './lyczydlo-list.component';

describe('LyczydloListComponent', () => {
  let component: LyczydloListComponent;
  let fixture: ComponentFixture<LyczydloListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LyczydloListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LyczydloListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
