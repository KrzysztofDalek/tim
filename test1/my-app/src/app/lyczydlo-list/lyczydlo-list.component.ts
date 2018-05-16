import { Component, OnInit } from '@angular/core';
import {LyczydloService} from "../lyczydlo.service";

@Component({
  selector: 'app-lyczydlo-list',
  templateUrl: './lyczydlo-list.component.html',
  styleUrls: ['./lyczydlo-list.component.css']
})
export class LyczydloListComponent implements OnInit {

  lyczbys:Array<any>;
  listat:Array<any>;
  constructor(private lyczydloService: LyczydloService) { }



  ngOnInit() {
  }


  //Wylycz():void{
  //  this.lyczydloService.getAll().subscribe(data=> { this.lyczbys = data;});



}
