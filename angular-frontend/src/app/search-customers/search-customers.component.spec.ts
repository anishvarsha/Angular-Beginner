import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SeachCustomersComponent } from './search-customers.component';

describe('SeachCustomersComponent', () => {
  let component: SeachCustomersComponent;
  let fixture: ComponentFixture<SeachCustomersComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SeachCustomersComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SeachCustomersComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
