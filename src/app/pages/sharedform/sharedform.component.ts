import { Component, Input, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';

@Component({
  selector: 'app-sharedform',
  templateUrl: './sharedform.component.html'
})
export class SharedformComponent implements OnInit {
  @Input() inputId = '';
  @Input() control!: FormControl;
  @Input() label:string = '';
  @Input() type:string = 'text';
  @Input() required: boolean = false;
  @Input() placeholder : string = '';
  constructor() { }

  ngOnInit(): void {
  }

}
