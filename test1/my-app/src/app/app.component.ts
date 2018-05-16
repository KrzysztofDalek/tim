import { Component } from '@angular/core';
import {LyczydloService} from "./lyczydlo.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Srednia liczb';
  liczba: number;
  lyczbys:Array<any>;
  listas:Array<any>;



  constructor(private lyczydloService: LyczydloService) { }

  Wylycz():void{
      this.lyczydloService.getAll().subscribe(data=> { this.lyczbys = data;});

  }

  Losuj() :void{

    this.lyczydloService.getAll2(this.liczba).subscribe(data=>{this.listas = data;});
  }



}

