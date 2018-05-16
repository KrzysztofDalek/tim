import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/internal/Observable";

@Injectable({
  providedIn: 'root'
})
export class LyczydloService {

  constructor(private http: HttpClient) {}
    getAll(): Observable<any>{
      console.log("aaaaa");
      return this.http.get('//localhost:8080/api/getList');

  }
  getAll2(liczba): Observable<any>{
    console.log("bb");
    return this.http.get('//localhost:8080/api/getSrednia/'+liczba);
  }
}
